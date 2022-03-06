package app

import data.BigNote
import data.Note

fun main() {
//  call getterSetter var
    val note = Note("Belajar Kotlin")
//    call Getter
    println(note.title)
//    call Setter
    note.title = "Belajar Kotlin di Android"
    println(note.title)

    note.title = ""
    println(note.title)

//    call getterSetter val
    val bigNote = BigNote("Belajar Kotlin di Android Big Course")
    println(bigNote.title)
    println(bigNote.bigTitle)
}



