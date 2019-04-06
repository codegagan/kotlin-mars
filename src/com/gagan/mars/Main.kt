package com.gagan.mars

    fun main(args: Array<String>){
        Rover()
            .setMaxCoordinates(5,5)
            .setPosition(1, 2, "N")
            .moveWithString("LMLMLMLMM")
            .printPosition()
            .setPosition(3,3,"E")
            .moveWithString("MMRMMRMRRM").printPosition()
    }
