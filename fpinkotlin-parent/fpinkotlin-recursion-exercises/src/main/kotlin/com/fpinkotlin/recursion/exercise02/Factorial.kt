package com.fpinkotlin.recursion.exercise02

object Factorial {
    /* option 1
    lateinit var factorial: (Int) -> Int

    init {
        factorial = { if (it <= 1) it else it * factorial(it - 1) }
    }
    */

    /* Option 2
    val factorial: (Int) -> Int by lazy { { n: Int -> if (n <=1) n else n * factorial(n - 1) } }
    */

    private lateinit var fact: (Int) -> Int
    init {
        fact = { if (it <= 1) it else it * fact(it - 1) }
    }
    val factorial = fact
}
