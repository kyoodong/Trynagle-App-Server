package com.gomson.tryangle.domain

import kotlin.math.pow
import kotlin.math.sqrt

class Point(val x: Int, val y: Int) {

    operator fun plus(item: Point): Point {
        return Point(x + item.x, y + item.y)
    }

    operator fun minus(item: Point): Point {
        return Point(x - item.x, y - item.y)
    }

    fun distance(point: Point): Double {
        return sqrt((point.x - x).toDouble().pow(2) + (point.y - y).toDouble().pow(2))
    }

    fun isClose(point: Point): Boolean {
        val diff = distance(point)
        return diff < 10
    }

    fun isFar(point: Point): Boolean {
        val diff = distance(point)
        return diff > 50
    }
}