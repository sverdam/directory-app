package com.sofiaverdugo.directory.models

data class User(
    val id: Int,
    val name: String,
    val description: String,
    val pfp: Int,
    val age: Int,
    val pronouns: String,
    val favSong: String,
    val favMovie: String,
)