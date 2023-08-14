package com.fpinkotlin.functions.exercise05


class Functions

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

val add: (Int) -> (Int) -> Int = { a -> { b -> a + b} }

val compose = { x: (Int) -> Int -> { y: (Int) -> Int -> { z: Int -> x(y(z)) } } }

/* T is type of input x. U is the result type of g(x). V is the result type of f(g(x)).
   higher compose is of the form f ° g ° x which means first apply g to input x, and then apply f to result of g
   g: (T) -> U
   f: (U) -> V
   higherCompose: (type of f) -> (type of g) -> (type of input -> type of result)
   higherCompose: ((U) -> V) -> ((T) -> U) -> ((T) -> V)
 */
fun <T, U, V> higherCompose(): ((U) -> V) -> ((T) -> U) -> (T) -> V = { f -> {g -> { f(g(it)) } } }
fun <T, U, V> higherCompose2(): ((U) -> V) -> ((T) -> U) -> (T) -> V = { f -> {g -> { x -> f(g(x)) } } }  // more explicit
