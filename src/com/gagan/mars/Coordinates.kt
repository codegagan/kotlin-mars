package com.gagan.mars

class Coordinates {
    val x : Int
    val y : Int

    constructor(x: Int, y: Int){
        this.x = x
        this.y = y
    }

    fun moveUp() : Coordinates{
        return Coordinates(this.x, this.y+1)
    }

    fun moveDown(): Coordinates {
        return Coordinates(this.x, this.y-1)

    }

    fun moveRight() : Coordinates{
        return Coordinates(this.x+1, this.y)

    }

    fun moveLeft() : Coordinates{
        return Coordinates(this.x-1, this.y)

    }

    override fun toString(): String {
        return "$x $y"
    }
}