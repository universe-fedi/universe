package com.universefedi.universe

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.universefedi.universe.data.Post

@Composable
fun PostCard(post: Post, modifier: Modifier = Modifier) {
    Card (modifier = modifier.fillMaxWidth().padding(10.dp)) {
        Column (modifier = Modifier.padding(10.dp)) {
            Row {
                Column {
                    Text(text = post.username, fontSize = 18.sp)
                    Text(text = post.handle, fontSize = 10.sp)
                }
            }
            Divider(modifier = Modifier.padding(3.dp))
            Text(text = post.body, fontSize = 15.sp)
            ActionRow(post.canReact)
        }
    }
}

@Composable
fun ActionRow(canReact: Boolean, modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        IconButton(onClick = {}) {
            Icon(painter = painterResource(id = R.drawable.baseline_reply_24), contentDescription = stringResource(R.string.reply))
        }
        IconButton(onClick = {}) {
            Icon(painter = painterResource(id = R.drawable.baseline_repeat_24), contentDescription = stringResource(R.string.boost))
        }
        IconButton(onClick = {}) {
            Icon(painter = painterResource(id = R.drawable.baseline_favorite_border_24), contentDescription = stringResource(R.string.like))
        }
        if (canReact) {
            IconButton(onClick = {}) {
                Icon(painter = painterResource(id = R.drawable.baseline_emoji_emotions_24), contentDescription = stringResource(R.string.reactions))
            }
        }
        IconButton(onClick = {}) {
            Icon(painter = painterResource(id = R.drawable.baseline_more_horiz_24), contentDescription = stringResource(R.string.more_actions))
        }
    }
}


@Preview
@Composable
fun PostPreview() {
    Surface {
        PostCard(Post("Riker Googling", "@RikerGoogling@botsin.space", "ingredients mazel tov cocktail", null, true))
//        PostCard("Riker Googling", "@RikerGoogling@botsin.space", "ingredients mazel tov cocktail", true)
    }
}