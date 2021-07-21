package com.example.mirecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mirecycler.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class HeroAdapter(val superhero:List<Superhero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>() {





    class HeroHolder(val view:View):RecyclerView.ViewHolder(view){
        val binding=ItemSuperheroBinding.bind(view)
        fun render(superhero: Superhero){
            binding.tvSuperheroname.setText(superhero.supernombre)
            binding.tvRealName.setText(superhero.realname)
            binding.tvpublisher.setText(superhero.publisher)
            Picasso.get().load(superhero.image).into(binding.ivHero)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }

    override fun getItemCount(): Int {
        return  superhero.size
    }

}