package com.example.masalkitabi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.masalkitabi.databinding.ReclyerRowBinding

class LandmarkAdapter (var landmarkList:ArrayList<Landmark>):RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder  (var binding: ReclyerRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
       var binding=ReclyerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        //bu kısım sadece recylerView de ne başlıklarda ne göstermek istiyorsa o yazılır
        holder.binding.recyclerRowTextView.text=landmarkList.get(position).baslik
        holder.itemView.setOnClickListener {
            val intent=Intent(holder.itemView.context,DetayActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }


    }
}