package com.jsp.dev.corp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lambdaclass { i: Int, s: String ->

            "return"
        }
        lambdaclazz {

        }
        lambda?.invoke()
    }
    var lambda: (() -> Unit?)? = null
    fun lambdaclass(lambda: (Int, String) -> String) {

    }
    fun lambdaclazz(lamda:()->Unit){
        this.lambda = lamda
    }
}
