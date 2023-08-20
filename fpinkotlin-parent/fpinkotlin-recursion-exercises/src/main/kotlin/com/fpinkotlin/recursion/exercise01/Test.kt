package com.fpinkotlin.recursion.exercise01

fun append(s: String, c: Char): String = "$s$c"

fun toString(list: List<Char>): String {
    tailrec fun toString(list: List<Char>, s: String): String =
        if (list.isEmpty())
            s
        else
            toString(list.drop(1), append(s, list.first()))

    return toString(list, "")
}

fun main() {
    println(toString("abc".toList()))
}
