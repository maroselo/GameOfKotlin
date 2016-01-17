package com.github.maroselo.gok

/**
 * Created by marosseleng on 17/12/15.
 */

fun main(args: Array<String>) {
    var myVar : String? = null
    if (args.size != 0) {
        myVar = args[0]
    }
    println("Hello " + myVar)
}
