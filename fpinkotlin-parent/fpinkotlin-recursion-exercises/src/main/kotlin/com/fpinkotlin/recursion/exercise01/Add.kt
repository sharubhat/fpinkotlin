package com.fpinkotlin.recursion.exercise01

/*
Decompiled java equivalent

public static final int add(int a, int b) {
      while(b != 0) {
         a = inc(a);
         b = dec(b);
      }
      return a;
   }
 */
tailrec fun addWrong(a: Int, b: Int): Int = if (b == 0) a else addWrong(inc(a), dec(b))

tailrec fun add2(a: Int, b: Int): Int =
    if (b == 0) a
    else if (b > 0) add2(inc(a), dec(b))
    else add2(dec(a), inc(b))

fun inc(n: Int) = n + 1
fun dec(n: Int) = n - 1

tailrec fun add(a: Int, b: Int): Int =
    when {
        (b == 0) -> a
        (b > 0) -> add(inc(a), dec(b))
        else -> add(dec(a), inc(b))
    }

tailrec fun add(a: Long, b: Int): Long =
    when {
        (b == 0) -> a
        (b > 0) -> add(incFixed(a), decFixed(b))
        else -> add(decFixed(a), incFixed(b))
    }

fun incFixed(n: Long) = n + 1
fun decFixed(n: Long): Long = n - 1

fun incFixed(n: Int) = n + 1
fun decFixed(n: Int) = n - 1

fun main() {
    println(add(3, -4))
    println(add(4, -3))
}
