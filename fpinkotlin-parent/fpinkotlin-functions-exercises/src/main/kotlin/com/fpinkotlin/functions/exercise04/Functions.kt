package com.fpinkotlin.functions.exercise04


class Functions

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

typealias IntBinOp = (Int) -> (Int) -> Int

val compose = { f: (Int) -> Int -> { g: (Int) -> Int -> compose(f, g) } }

typealias IntFun = (Int) -> Int
// if compose function didn't exist
val compose2: (IntFun) -> (IntFun) -> (IntFun) = { f: IntFun ->
    { g: IntFun ->
        { h: Int ->
            f(g(h))
        }
    }
}
