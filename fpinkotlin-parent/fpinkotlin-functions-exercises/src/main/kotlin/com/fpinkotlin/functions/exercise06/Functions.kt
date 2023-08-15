package com.fpinkotlin.functions.exercise06


class Functions

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

val add: (Int) -> (Int) -> Int = { a -> { b -> a + b} }

val compose = { x: (Int) -> Int -> { y: (Int) -> Int -> { z: Int -> x(y(z)) } } }

fun <T, U, V> higherCompose(): ((U) -> V) -> ((T) -> U) -> (T) -> V =
    { f ->
        { g ->
            { x -> f(g(x)) }
        }
    }

/*
result of higherAndThen is of type (T) -> V
obtained by first applying f on x resulting in type of f (T) -> U
g is applied on f which produces U. Type of g becomes (U) -> V
f ° g ° x will be of type ((T) -> U) -> ((U) -> V) -> (T) -> V
 */
fun <T, U , V> higherAndThen(): ((T) -> U) -> ((U) -> V) -> (T) -> V = { f -> { g -> { g(f(it))}} }
