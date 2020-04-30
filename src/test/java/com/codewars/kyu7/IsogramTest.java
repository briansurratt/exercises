package com.codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsogramTest {

    @Test
    public void test1() {
        assertEquals(true, com.codewars.kyu7.Isogram.isIsogram("Dermatoglyphics"));
    }

    @Test
    public void test2() throws Exception {

        assertEquals(true, com.codewars.kyu7.Isogram.isIsogram("isogram"));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(false, com.codewars.kyu7.Isogram.isIsogram("moose"));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(false, com.codewars.kyu7.Isogram.isIsogram("isIsogram"));
    }

    @Test
    public void test5() throws Exception {
        assertEquals(false, com.codewars.kyu7.Isogram.isIsogram("aba"));
    }

    @Test
    public void test6() throws Exception {
        assertEquals(false, com.codewars.kyu7.Isogram.isIsogram("moOse"));
    }

    @Test
    public void test7() throws Exception {
        assertEquals(true, com.codewars.kyu7.Isogram.isIsogram("thumbscrewjapingly"));
    }

    @Test
    public void test9() throws Exception {
        assertEquals(true, Isogram.isIsogram(""));
    }

}
