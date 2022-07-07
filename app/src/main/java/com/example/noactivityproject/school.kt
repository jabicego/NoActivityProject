package com.example.noactivityproject

class SCHOOL(var name:String, var address:String, val active_school:Boolean=true, val numcode:Int=0) {

    constructor() : this("", "")

    override fun toString(): String {
        if (active_school) {
            return "escuela: $name en $address"
        } else {
            return "ESCUELA INACTIVCA"

        }
    }
}