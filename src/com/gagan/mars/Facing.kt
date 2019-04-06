package com.gagan.mars

import java.lang.RuntimeException

class Facing {
    var direction = "N"
        set(value) {
            if(value !in listOf("N", "S", "W", "E")){
                throw RuntimeException("Incorrect direction")
            }
            field = value
        }
    fun left(){
        this.direction = when(direction){
            "N" -> "W"
            "S" -> "E"
            "E" -> "N"
            "W" -> "S"
            else -> "N"
        }
    }

    fun right() {
        this.direction = when(direction){
            "N" -> "E"
            "S" -> "W"
            "E" -> "S"
            "W" -> "N"
            else -> "N"
        }
    }

    override fun toString(): String {
        return direction
    }
}