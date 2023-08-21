package com.fpinkotlin.recursion.exercise03

// defining head as extension function to List class
fun <T> List<T>.head(): T =
    if (this.isEmpty())
        throw IllegalArgumentException("head called on empty list")
    else
        this[0]

fun <T> List<T>.tail(): List<T> =
    if (this.isEmpty())
        throw IllegalArgumentException("tail called on empty list")
    else
        this.drop(1)

/*
// recursive solution
fun sum(list:List<Int>): Int =
    if (list.isEmpty())
        0
    else
        list.head() + sum(list.tail())
 */

// corecursive solution that can be TCE(tail call elimination optimized
// local helper functions are generally called `go` or `process`
fun sum(list: List<Int>): Int {
    tailrec fun process(list: List<Int>, acc: Int): Int =
        if(list.isEmpty())
            acc
        else
            process(list.tail(), acc + list.head())
    return process(list, 0)
}

fun main() {
    println(sum(intArrayOf(1, 2, 3).toList()))
}
