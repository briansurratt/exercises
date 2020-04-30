package com.kodewars.kyu7

import junit.framework.Assert.assertEquals
import org.junit.Test

class FindScreenSizeTest  {
    @Test
    fun test4By3() {
        assertEquals("1024x768", findScreenHeight(1024, "4:3"))
    }
    @Test
    fun test16By9() {
        assertEquals("1280x720", findScreenHeight(1280, "16:9"))
    }
    @Test
    fun test32By9() {
        assertEquals("3840x1080", findScreenHeight(3840, "32:9"))
    }
}