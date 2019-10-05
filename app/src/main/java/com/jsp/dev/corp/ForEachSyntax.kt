package com.jsp.dev.corp

import android.util.Log

class ForEachSyntax {
    val str1 = arrayOf("Meljan","Jhnrik","Janus")
    val str2 = arrayOf("JJJJ","PPPP","Meljan")
    var int1:Int? = null
    var int2:Int? = null
    fun compare() {
        str1.forEachIndexed { index1, s1 ->
            str2.forEachIndexed { index2, s2 ->
                if(s1.equals(s2)){
                    int1 = index1
                    int2 = index2
                }
            }
        }
        Log.d("Indexes",int1.toString() + " " + int2.toString())
    }
}