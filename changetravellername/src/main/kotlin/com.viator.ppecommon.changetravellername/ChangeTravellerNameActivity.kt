package com.viator.ppecommon.changetravellername

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem

class ChangeTravellerNameActivity() : AppCompatActivity(), ChangeTravellerNameView  {
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override var travellers: List<Traveller> = emptyList()
        set(value) {
            field = value
            updateTravellersUI(value)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        travellers = listOf(com.viator.ppecommon.changetravellername.Traveller("karel", "herink"), Traveller("dean", "baker"))
    }

    fun updateTravellersUI(travellers: List<Traveller>) {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ChangeTravellerNameViewAdapter(this, travellers)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuItem = menu.add(Menu.NONE, 1000, Menu.NONE, "Done")
        menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        println("send updated traveller names")
        return true
    }
}
