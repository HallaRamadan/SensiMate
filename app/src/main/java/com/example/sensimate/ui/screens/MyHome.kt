package com.example.sensimate.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyEvent(modifier: Modifier
) {
    @Composable
    fun BookedEvent(){
    }
    @Composable
    fun SavedEvent(){
    }
    @Composable
    fun EventHistory(){
    }
    Box {
        Box(modifier = Modifier
            .width(414.dp)
            .height(896.dp)
            .clip(RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp))
            .background(Color(red = 1f, green = 1f, blue = 1f, alpha = 1f))
            .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)
        )
    }

}
@Preview
@Composable
fun MyEventsPreview(){
    MyEvent(modifier = Modifier)
}