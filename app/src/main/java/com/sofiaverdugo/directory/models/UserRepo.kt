package com.sofiaverdugo.directory.models

import com.sofiaverdugo.directory.R


class UserRepo {
    private val users = listOf(
        User(1, "Sofía Verdugo", "redesign your logo, give us all your money!", R.drawable.sv_pfp, 20,"she/her", "Selfless - The Strokes", "The Truman Show"),
        User(2, "Carlos Maytorena", "despite everything, it’s still you", R.drawable.cm_pfp, 21,"she/her", "Iris - The Goo Goo Dolls", "A Silent Voice"),
        User(3, "Dahina Franco", "Hola!", R.drawable.df_pfp, 20,"she/her", "El diablo - Fobia", "Gnomeo y Julieta"),
        User(4, "Ángel Vieyra", "Leo comics todo el dia y ni dinero tengo", R.drawable.av_pfp, 20,"he/him", "Song", "Spiderman 2"),
        User(5, "Sophia Peralta", "te amo jungkook", R.drawable.sp_pfp, 20,"she/her", "Rule of Nines - Spiritbox", "Dune"),
        User(6, "Mar Frías", "Eee ee e soy trans sans", R.drawable.mf_pfp, 20,"she/her", "Me, a God - Seb Lowe", "La Viuda"),
        User(7, "Mateo Zaragoza", "Mis hobbies favoritos son dormir \uD83D\uDE05 ir al gim \uD83D\uDCAA y leer \uD83E\uDD13 soy timido...", R.drawable.mz_pfp, 20,"he/him", "Give up the funk - Parliament", "Matrix"),
        User(8, "Camila Dominguez", "I'm walkin' with my own dirt ", R.drawable.cd_pfp, 20,"he/him", "Heartbeat - BTS", "Aunque nuestro amor se desvanezca está noche")
    )


    fun getUsers(): List<User> {
        return users
    }
    fun getMyUser(): User {
        return users.first()
    }
}