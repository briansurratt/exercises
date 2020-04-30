package com.kodewars.kyu7

import kotlin.math.floor

fun findScreenHeight(width: Int, ratio: String): String {

    val values = ratio.split(":").map { it.toDouble() }

    val ratio = values[1] / values[0]

    val height = floor(width * ratio).toInt()

    return "${width}x${height}"

}