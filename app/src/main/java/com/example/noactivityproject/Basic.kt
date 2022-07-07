package com.example.noactivityproject
const val SEPARATOR = "============="
fun main(){
    print("THIS IS KOtlin")


}

fun newTopic(topic:String){

    print("\n$SEPARATOR $topic $SEPARATOR\n")
}

fun newSubTopic(subtopic:String){
    print("\n$SEPARATOR $subtopic\n")
}