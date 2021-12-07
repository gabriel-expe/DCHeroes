package com.gabriel.dccomics.listHeroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabriel.dccomics.R
import com.gabriel.dccomics.detailsHeroes.DetailsActivity
import com.gabriel.dccomics.model.Hero
import com.gabriel.dccomics.model.HeroItem
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    private lateinit var listHeroes : ArrayList<HeroItem>
    private lateinit var heroAdapter : HeroAdapter
    private lateinit var heroesRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heroesRecyclerView = findViewById(R.id.heroes_recycler_view)
        listHeroes = loadMockHeroes()
        heroAdapter = HeroAdapter(listHeroes, onItemClicked = { onHeroClicked(it) })

        heroesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = heroAdapter
            setHasFixedSize(false)
        }

    }

    private fun onHeroClicked(hero: HeroItem) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("hero", hero)
        startActivity(intent)
    }

    private fun loadMockHeroes() : ArrayList<HeroItem>{
        val heroesString : String = applicationContext.assets.open("heroes.json").bufferedReader().use {it.readText()}
        val gson = Gson()
        val data = gson.fromJson(heroesString, Hero::class.java)
        return data
    }
}