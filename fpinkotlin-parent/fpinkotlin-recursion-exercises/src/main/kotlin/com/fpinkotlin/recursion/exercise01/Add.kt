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
tailrec fun add(a: Int, b: Int): Int = if (b == 0) a else add(inc(a), dec(b))

tailrec fun add2(a: Int, b: Int): Int =
    if (b == 0) a
    else if (b > 0) add2(inc(a), dec(b))
    else add2(dec(a), inc(b))

fun inc(n: Int) = n + 1
fun dec(n: Int) = n - 1

