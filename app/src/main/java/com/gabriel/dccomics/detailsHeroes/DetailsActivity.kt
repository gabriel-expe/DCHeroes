package com.gabriel.dccomics.detailsHeroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gabriel.dccomics.databinding.ActivityDetailsBinding
import com.gabriel.dccomics.model.HeroItem
import com.squareup.picasso.Picasso

class DetailsActivity : AppCompatActivity() {

    private lateinit var detailsBinding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailsBinding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(detailsBinding.root)
        val hero : HeroItem = intent.extras?.getSerializable("hero") as HeroItem

        with(detailsBinding){
            nameTextView.text = hero.name
            aliasTextView.text = hero.alias
            cityTextView.text = hero.city
            facebookTextView.text = hero.facebook
            powersTextView.text = hero.powers
            occupationTextView.text = hero.occupation
            Picasso.get().load(hero.urlPicture).into(pictureImageView)
        }
    }
}