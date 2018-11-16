package com.serzh.coursera.e_2_sequences

fun main(args: Array<String>) {
    val people = listOf<People>()
    people.sortedBy { it.age }.reversed()
    people.sortedByDescending { it.age }


    people
            .map { person ->
                person.takeIf { it.isPublicProfile }?.name
            }
            .filterNotNull()

    people.mapNotNull { person ->
        person.takeIf { it.isPublicProfile }?.name
    }

}

data class People(var age: Int, var isPublicProfile: Boolean, val name: String) {

}