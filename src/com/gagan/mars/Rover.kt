package com.gagan.mars

import java.lang.RuntimeException

class Rover {
    var coordinates = Coordinates(0,0)
    var maxCoordinates = Coordinates(0,0)
    var facing = Facing()

    private fun move() : Rover{
        var coordinates = when(facing.direction){
            "N" -> coordinates.moveUp()
            "S" -> coordinates.moveDown()
            "W" -> coordinates.moveLeft()
            "E" -> coordinates.moveRight()
            else -> null!!
        }
        this.coordinates = coordinates
        checkBoundary()
        return this
    }

    private fun checkBoundary() {
        if(coordinates.x > maxCoordinates.x || coordinates.y > maxCoordinates.y || coordinates.x <0 || coordinates.y <0){
            throw RuntimeException("Coordinates out of boundry")
        }
    }

    private fun left(): Rover{
        facing.left()
        return this
    }

    private fun right() : Rover{
        facing.right()
        return this
    }

    fun setMaxCoordinates(x: Int, y: Int) : Rover{
        this.maxCoordinates = Coordinates(x,y)
        return this
    }

    fun setPosition(x: Int, y: Int, facing: String): Rover{
        this.facing.direction = facing
        this.coordinates = Coordinates(x, y)
        checkBoundary()
        return this
    }

    fun printPosition() : Rover{
        println("${coordinates} ${facing}")
        return this
    }

    fun moveWithString(input: String) : Rover{
        val calculatedRover = input.fold(this) { x, y ->
            when (y) {
                'L' -> x.left()
                'M' -> x.move()
                'R' -> x.right()
                else -> null!!
            }
        }
        checkBoundary()
        return calculatedRover;
    }


}