package com.fpinkotlin.functions.exercise03


class Compose

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

typealias IntBinOp = (Int) -> (Int) -> Int

val add: IntBinOp = { x -> { y -> x + y } }
val mult: IntBinOp = { x -> { y -> x * y } }

