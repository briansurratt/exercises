package com.kodewars.kyu6

import junit.framework.Assert.assertEquals
import org.junit.Test

class StockListTest {

    private fun testing(lstOfArt: Array<String>, lstOfCat: Array<String>, expect: String) {
        val actual: String = StockList.stockSummary(lstOfArt, lstOfCat)
        assertEquals(expect, actual)
    }

    @Test
    fun testOne() {
        val b = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
        val c = arrayOf("A", "B", "C", "D")

        val res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"

        testing(b, c, res)

    }

    @Test
    fun testTwo() {

        val b = arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600")
        val c = arrayOf("A", "B")

        val res = "(A : 200) - (B : 1140)"

        testing(b, c, res)

    }

    @org.junit.Test
    fun artListIsEmpty() {
        testing(emptyArray(), arrayOf("A", "B"),"")
    }

    @org.junit.Test
    fun testCatListEmpty() {
        testing(arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"), emptyArray(), "")
    }

}