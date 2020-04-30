package com.kodewars.kyu7

import com.kodewars.Isogram
import org.junit.Assert.assertEquals
import org.junit.Test

class IsogramTests {

    @Test
    fun test1() {
        assertEquals(true, Isogram.isIsogram("Dermatoglyphics"))
    }

    @Test
    fun test2() {

        assertEquals(true, Isogram.isIsogram("isogram"))
    }

    @Test
    fun test3() {
        assertEquals(false, Isogram.isIsogram("moose"))
    }

    @Test
    fun test4() {
        assertEquals(false, Isogram.isIsogram("isIsogram"))
    }

    @Test
    fun test5() {
        assertEquals(false, Isogram.isIsogram("aba"))
    }

    @Test
    fun test6() {
        assertEquals(false, Isogram.isIsogram("moOse"))
    }

    @Test
    fun test7() {
        assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"))
    }

    @Test
    fun test9() {
        assertEquals(true, Isogram.isIsogram(""))
    }

}