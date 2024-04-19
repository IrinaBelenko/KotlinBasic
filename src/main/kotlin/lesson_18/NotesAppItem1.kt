package lesson_18

import java.util.*

class NotesAppItem1 {
    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: String,
    ){
        println("Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data")
    }

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: Long,
    ){
        println("Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data")
    }

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: List<String>,
    ){
        println("Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data")
    }
}