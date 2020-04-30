package com.kodewars.kyu6

import java.lang.StringBuilder

object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {

        if (lstOfArt.isEmpty() || lstOfCat.isEmpty()) {
            return ""
        }


        val results = mutableMapOf<String, Int>()

        lstOfCat.forEach {
            results[it] = 0
        }

        lstOfCat.forEach { category: String ->
            lstOfArt.forEach {book: String ->
                if (book.startsWith(category)) {
                    val split = book.split(" ")
                    val count = split[1].toInt()
                    results[category] = results[category]!!.plus(count)
                }
            }
        }

        val sb = StringBuilder()
        results.forEach() {
            if (sb.isNotEmpty()) {
                sb.append(" - ")
            }
            sb.append("(${it.key} : ${it.value})")
        }


        return sb.toString()
    }
}