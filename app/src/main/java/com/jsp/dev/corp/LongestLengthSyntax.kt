package com.jsp.dev.corp

class LongestLengthSyntax {
    val str = arrayOf("String1","String2","String333333","String111")
    fun getTheLongestStr(): String {
        var temp = ""
        str.forEach {
            if(temp.length<it.length)
                temp = it
        }
        return temp
    }

    fun newFunction() {

    }

}