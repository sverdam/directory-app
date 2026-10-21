package com.sofiaverdugo.directory.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sofiaverdugo.directory.models.User

@Composable
fun ProfileScreen(user: User) {
    Column(
        modifier = Modifier.padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // PFP
        Text(
            text = "${user.name} (${user.pronouns})",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(text = user.description)
        Text(text = "Favorite Song: ${user.favSong}")
        Text(text = "Favorite Movie: ${user.favMovie}")
    }
}