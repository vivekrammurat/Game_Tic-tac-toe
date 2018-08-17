package com.vishru.startup

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.*


class TwoPlayer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun btnClick(view: View){
        val btnSelected = view as Button
        var CELLID = 0
        when(btnSelected.id){

            R.id.button1 -> CELLID = 1
            R.id.button2 -> CELLID = 2
            R.id.button3 -> CELLID = 3
            R.id.button4 -> CELLID = 4
            R.id.button5 -> CELLID = 5
            R.id.button6 -> CELLID = 6
            R.id.button7 -> CELLID = 7
            R.id.button8 -> CELLID = 8
            R.id.button9 -> CELLID = 9

        }

        PlayGame(CELLID,btnSelected)
        // Toast.makeText(this,"ID :"+ CELLID ,Toast.LENGTH_SHORT).show()
    }

    var Player1 = ArrayList<Int>()
    var Player2 = ArrayList<Int>()
    var ActivePlayer = 1
    private fun PlayGame(cellid: Int, btnSelected: Button) {
        if(ActivePlayer == 1){
            btnSelected.text = "X"
            btnSelected.setBackgroundColor(Color.GREEN)
            Player1.add(cellid)
            ActivePlayer = 2
           // autoPlay()
        }
        else{
            btnSelected.text = "O"
            btnSelected.setBackgroundColor(Color.BLUE)
            Player2.add(cellid)
            ActivePlayer = 1
        }
        btnSelected.isEnabled = false

        checkWinner()
    }

    private fun checkWinner() {
        var winner = -1

        //row 1
        if(Player1.contains(1) && Player1.contains(2) && Player1.contains(3) )
            winner = 1

        if(Player2.contains(1) && Player2.contains(2) && Player2.contains(3))
            winner = 2

        //row 2
        if(Player1.contains(4) && Player1.contains(5) && Player1.contains(6))
            winner = 1
        if(Player2.contains(4) && Player2.contains(5) && Player2.contains(6))
            winner = 2

        //row 3
        if(Player1.contains(7) && Player1.contains(8) && Player1.contains(9))
            winner = 1
        if(Player2.contains(7) && Player2.contains(8) && Player2.contains(9))
            winner = 2

        //col 1
        if(Player1.contains(1) && Player1.contains(4) && Player1.contains(7))
            winner = 1
        if(Player2.contains(1) && Player2.contains(4) && Player2.contains(7))
            winner = 2

        //col 2
        if(Player1.contains(2) && Player1.contains(5) && Player1.contains(8))
            winner = 1
        if(Player2.contains(2) && Player2.contains(5) && Player2.contains(8))
            winner = 2

        //col 3
        if(Player1.contains(3) && Player1.contains(6) && Player1.contains(9))
            winner = 1
        if(Player2.contains(3) && Player2.contains(6) && Player2.contains(9))
            winner = 2

        //diagonal1
        if(Player1.contains(1) && Player1.contains(5) && Player1.contains(9))
            winner = 1
        if(Player2.contains(1) && Player2.contains(5) && Player2.contains(9))
            winner = 2

        //diagonal2
        if(Player2.contains(3) && Player2.contains(5) && Player2.contains(7))
            winner = 1
        if(Player2.contains(3) && Player2.contains(5) && Player2.contains(7))
            winner = 2


        if(winner != -1){
            if(winner == 1)
                Toast.makeText(this," Player 1 is Winner ", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this,"Player 2 is Winner ", Toast.LENGTH_LONG).show()

            //  Toast.makeText(this, "game draw", Toast.LENGTH_LONG).show()

        }



    }


}
