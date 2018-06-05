package com.viator.ppecommon.changetravellername

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

class ChangeTravellerNameViewAdapter(private val context: Context, private val travellers: List<Traveller>)
    : Adapter<ChangeNameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChangeNameViewHolder {
        return ChangeNameViewHolder(View.inflate(context, R.layout.traveller_list_item, null))
    }

    override fun getItemCount(): Int {
        return travellers.size
    }

    override fun onBindViewHolder(holder: ChangeNameViewHolder, position: Int) {
        holder.lblPassenger.text = "Passenger " +  (position+1).toString()
        holder.tvFirstName.setText(travellers[position].firstName)
        holder.tvLastName.setText(travellers[position].lastName)
    }

}

class ChangeNameViewHolder(view: View): RecyclerView.ViewHolder(view) {
    var lblPassenger = view.findViewById<TextView>(R.id.passengerLabel)
    var tvFirstName = view.findViewById<EditText>(R.id.firstName)
    var tvLastName = view.findViewById<EditText>(R.id.lastName)
}