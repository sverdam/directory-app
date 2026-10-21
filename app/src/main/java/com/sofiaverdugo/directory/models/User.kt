package com.sofiaverdugo.directory.models

data class User(
    val id: Int,
    val name: String,
    val description: String,
    val pfp: Int,
    val header: Int,
    val age: Int,
    val pronouns: String,
    val favSongName: String,
    val favSongCover: Int,
    val favMovieName: String,
    val favMoviePoster: Int
)