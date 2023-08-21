package com.fpinkotlin.recursion.exercise03

import java.math.BigInteger

// doubly recursive version
fun fibonacci(n: Int): Int =
    if (n == 0 || n == 1)
        1
    else
        fibonacci(n - 1) + fibonacci(n - 2)

fun fib(x: Int): BigInteger {
    tailrec fun fib(acc1: BigInteger, acc2: BigInteger, x: BigInteger): BigInteger =
        when {
            (x == BigInteger.ZERO) -> BigInteger.ONE
            (x == BigInteger.ONE) -> acc1 + acc2
            else -> fib(acc2, acc1 + acc2, x - BigInteger.ONE)
        }

    return fib(BigInteger.ZERO, BigInteger.ONE, BigInteger.valueOf(x.toLong()))
}

