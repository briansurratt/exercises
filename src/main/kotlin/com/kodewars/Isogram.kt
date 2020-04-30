package com.kodewars

object Isogram {

    fun isIsogram(str: String): Boolean {

        if ("" == str) {
            return true
        }

        val distinctCharacters = str.toLowerCase().asSequence().distinct().count()

        return str.length == distinctCharacters

    }

}