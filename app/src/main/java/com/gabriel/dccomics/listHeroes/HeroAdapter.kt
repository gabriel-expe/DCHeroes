package com.gabriel.dccomics.listHeroes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gabriel.dccomics.R
import com.gabriel.dccomics.model.HeroItem
import com.squareup.picasso.Picasso

class HeroAdapter(private val listHeroes : ArrayList<HeroItem>) : RecyclerView.Adapter<HeroAdapter.ViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_heroe_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hero = listHeroes[position]
        holder.bind(hero)
    }

    override fun getItemCount(): Int = listHeroes.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val nameTextView : TextView = view.findViewById(R.id.name_text_view)
        private val aliasTextView : TextView = view.findViewById(R.id.alias_text_view)
        private val cityTextView : TextView = view.findViewById(R.id.city_text_view)
        private val pictureImageView : ImageView = view.findViewById(R.id.picture_image_view)

        fun bind (hero : HeroItem) {
            nameTextView.text = hero.name
            aliasTextView.text = hero.alias
            cityTextView.text = hero.city
            Picasso.get().load(hero.urlPicture).into(pictureImageView)
        }
    }

}