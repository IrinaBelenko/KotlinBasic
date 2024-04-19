package org.example.lesson_1_10.lesson_14

import lesson_17.BabelFish
import lesson_18.*
import java.util.Date


fun main() {

    val creationDate = Date()
    val messageItem: NotesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )

    val phoneItem: NotesAppItem = PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        89914424242,
    )

    val listItem: NotesAppItem = ListItem(
        "todo_list",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes"),
    )
//    println(messageItem.getItemData())
//    println()
//    println(phoneItem.getItemData())
//    println()
//    println(listItem.getItemData())

    val arrayOfNotes = arrayOf<NotesAppItem>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)
//    val note = NotesAppItem1()

//    note.addItemToCell(
//        "call sister",
//        creationDate,
//        "message",
//        "call sister to congratulate"
//    )
//    println()
//
//    note.addItemToCell(
//        "todo_list",
//        creationDate,
//        "list",
//        listOf("wash dog", "do the cleaning", "buy new shoes"),
//    )
//    println()
//
//    note.addItemToCell(
//        "sister's number",
//        creationDate,
//        "phone",
//        89914424242,
//    )
//    println()

}

fun showAllNotes(notes: Array<NotesAppItem>){
    notes.forEach {
        println(it.getItemData())
    }
}
