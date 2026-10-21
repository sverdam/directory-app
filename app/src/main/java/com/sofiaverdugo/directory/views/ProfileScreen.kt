package com.sofiaverdugo.directory.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sofiaverdugo.directory.models.User

@Composable
fun ProfileScreen(user: User) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(user.pfp),
                contentDescription = "${user.name} profile picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 160.dp, height = 160.dp)
                    .clip(RoundedCornerShape(80.dp))
            )

            Text(
                text = user.name,
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = user.pronouns,
                style = MaterialTheme.typography.headlineSmall,
                color = Color.Gray
            )
        }


        Text(
            text = user.description,
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.size(width=100.dp, height = 10.dp))

        Text(
            text = "Favorite Song:",
            style = MaterialTheme.typography.titleSmall
        )
        Text(
            text = user.favSong,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = "Favorite Movie:",
            style = MaterialTheme.typography.titleSmall
        )
        Text(
            text = user.favMovie,
            style = MaterialTheme.typography.titleMedium
        )
    }
}