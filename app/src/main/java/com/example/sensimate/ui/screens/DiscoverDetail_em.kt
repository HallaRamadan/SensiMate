package com.example.sensimate.ui.screens_employee

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sensimate.ui.screens.Card
import com.example.sensimate.ui.components.Background
import com.example.sensimate.ui.components.SensimateLogo
@Preview
@Composable
fun DiscoverDetail_emPreviw(){
    DiscoverDitail_em()
}
@Composable
fun DiscoverDitail_em(){
    Background {
        SensimateLogo()
        SensiMateCard()
    }


}

@Composable
fun Background() {

        Box(
            modifier = Modifier
                .width(350.dp)
                .fillMaxHeight(300.4F)
                .border(BorderStroke(1.dp, Color.Black), RoundedCornerShape(20.dp))
                .background(color = Color.Black),
        ) {
        }

}

@Composable
fun SensiMateCard() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

            }
}










