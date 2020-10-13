package com.digitalhouse.exercicio_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_res.visibility = View.INVISIBLE
        setSupportActionBar(toolbar)

        btn_comparar.setOnClickListener {
            txt_res.visibility = View.VISIBLE
            if (edt_etanol.text.toString().toDouble() < edt_gasolina.text.toString().toDouble() * 0.7)
                img_res.setImageResource(R.drawable.abasteca_etanol)
            else
                img_res.setImageResource(R.drawable.abasteca_gasolina)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_app, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.menu_op1){
            var temp = edt_etanol.text.toString()
            edt_etanol.setText(edt_gasolina.text.toString())
            edt_gasolina.setText(temp)
            return true
        }else if (id == R.id.menu_op2){
            var novoVal = edt_gasolina.text.toString().toDouble() + 1
            edt_gasolina.setText(novoVal.toString())

            novoVal = edt_etanol.text.toString().toDouble() + 1
            edt_etanol.setText(novoVal.toString())
            return true
        }else return super.onOptionsItemSelected(item)
    }
}