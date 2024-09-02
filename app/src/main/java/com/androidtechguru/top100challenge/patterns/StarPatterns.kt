package com.androidtechguru.top100challenge.patternsfun main() {    val pattern = Pattern()    pattern.rightAngleTriangle()    pattern.invertedRightAngleTriangle()    pattern.rightAngleTriangleMirrored(10)    pattern.triangle()}class Pattern {        fun rightAngleTriangle(maxRow: Int = 5) {        println("... Right Angle Triangle ...")        repeat(maxRow) { row ->            repeat(row + 1) {                print("*")            }            println()        }    }        fun invertedRightAngleTriangle(maxRow: Int = 5) {        println("... Inverted Right Angle Triangle ...")        repeat(maxRow) { row ->            repeat(maxRow - row) {                print("*")            }            println()        }    }        fun rightAngleTriangleMirrored(maxRow: Int = 5) {        println("... Right Angle Triangle Mirrored ...")        repeat(maxRow) { row ->            repeat(maxRow) { col ->                if (col < maxRow - row - 1) {                    print(" ")                } else {                    print("*")                }            }            println()        }    }        fun triangle(maxRow: Int = 5) {        println("... Triangle ...")        repeat(maxRow) { row ->            repeat(maxRow - row) {                print(" ")            }            repeat(row + 1) {                print("* ")            }            println()        }    }    }