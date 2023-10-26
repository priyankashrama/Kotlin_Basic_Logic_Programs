package com.includehelp.basic
import java.util.*

fun main(args: Array<String>) {
    // InputStream to get Input
    val scanner = Scanner(System.`in`)

    //Input Your Character
    print("Enter Character : ")
    val c = scanner.next()[0]

    //Get ASCII Value of Character
    val ascii = c.toInt();

    //Print ASCII Value
    println("ASCII Code of $c is $ascii");
}
