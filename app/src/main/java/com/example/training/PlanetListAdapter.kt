package com.example.training

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import kotlinx.android.synthetic.main.planet_item.view.*

class PlanetListAdapter : Adapter<PlanetListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.planet_item, null)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind("Terra", "A beautiful place!")
    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {

        fun bind(title: String, description: String) {
            itemView.view_planet_name.text = title
            itemView.view_planet_description.text = description
        }
    }

}
