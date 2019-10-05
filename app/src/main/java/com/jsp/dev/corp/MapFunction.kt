package com.jsp.dev.corp

class MapFunction {
    val arr = listOf("Janus","Meljan","Jhnrik")
    fun mapWithJSP() = arr.map {
        "$it.JSP"
    }

}