package com.example.sensimate.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sensimate.R
import com.example.sensimate.ui.components.Card
import com.example.sensimate.ui.theme.SensiMateTheme


@Composable
fun MyEvent() {
    SensiMateTheme {
        Background{
            SearchField(
                Modifier
                    .width(370.dp)
                    .height(60.dp).clip(RoundedCornerShape(120.dp))
                    .background(Color.White)
                    .alpha(0.8500000238418579f).padding(top = 0.dp)
            )
            Card{
                BookedEvent()
            }
            Card {
                SavedEvent()
            }
            Card {
                EventHistory()
            }
        }
    }
}

@Composable
fun Background(content: @Composable () -> Unit){
    Box(
        modifier = Modifier.verticalScroll(rememberScrollState())
            .fillMaxSize().background(Color(0xFF323232)).padding(20.dp),
        contentAlignment = Alignment.TopCenter
    ){
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            content()
        }
    }
}
@Composable
fun SearchField(modifier: Modifier) {
    TextField(value = "Search", onValueChange = {}, leadingIcon = {Icon(Icons.Default.Search, contentDescription = "")}, modifier = Modifier
        .width(370.dp)
        .heightIn(min = 36.dp).clip(RoundedCornerShape(120.dp))
        .background(Color.White)
        .alpha(0.85f).padding(top = 0.dp))
}

@Composable
fun BookedEvent(){
    Column(verticalArrangement = Arrangement.spacedBy(1.dp)){
        CardTitle("Booked Events")
        CardBody {
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp), modifier = Modifier.padding(3.dp)){
                CardBodyContent(maxWidthFraction = 0.33f){
                    Image(painterResource(R.drawable.hand_beer),"content description")
                }
                CardBodyContent(maxWidthFraction = 0.5f){
                    Image(painterResource(R.drawable.cider),"content description", modifier = Modifier.size(1500.dp))
                }
                CardBodyContent(maxWidthFraction = 1f){
                    Image(painterResource(R.drawable.coke),"content description", modifier = Modifier.size(1500.dp))
                }
            }
        }
    }
}
@Composable
fun SavedEvent(){
    Column(verticalArrangement = Arrangement.spacedBy(1.dp)){
        CardTitle("Saved Events")
        CardBody {
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp), modifier = Modifier.padding(3.dp)){
                CardBodyContent(maxWidthFraction = 0.33f){
                    Image(painterResource(R.drawable.hand_beer),"content description")
                }
                CardBodyContent(maxWidthFraction = 0.5f){
                    Image(painterResource(R.drawable.cider),"content description", modifier = Modifier.size(1500.dp))
                }
                CardBodyContent(maxWidthFraction = 1f){
                    Image(painterResource(R.drawable.coke),"content description", modifier = Modifier.size(1500.dp))
                }
            }
        }
    }
}
@Composable
fun EventHistory(){
    Column(verticalArrangement = Arrangement.spacedBy(1.dp)){
        CardTitle("Event History")
        CardBody {
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp), modifier = Modifier.padding(3.dp)){
                CardBodyContent(maxWidthFraction = 0.33f){
                    Image(painterResource(R.drawable.hand_beer),"content description")
                }
                CardBodyContent(maxWidthFraction = 0.5f){
                    Image(painterResource(R.drawable.cider),"content description", modifier = Modifier.size(1500.dp))
                }
                CardBodyContent(maxWidthFraction = 1f){
                    Image(painterResource(R.drawable.coke),"content description", modifier = Modifier.size(1500.dp))
                }
            }
        }
    }
}

@Composable
fun CardTitle(title: String){
    Box(modifier = Modifier
        .width(370.dp)
        .fillMaxHeight(0.15F)
        .border(
            brush = Brush.horizontalGradient(listOf(Color(0xFFED7069), Color(0xFF9F6CF1))),
            width = 3.dp,
            shape = RoundedCornerShape(20.dp)
        ),
        contentAlignment = Alignment.Center) {
        Text(text = title, color = Color.White)
    }
}

@Composable
fun CardBody(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Box(modifier = Modifier
        .width(370.dp)
        .fillMaxHeight(1F)
        .padding(2.dp, 2.dp).padding(2.dp, 2.dp),
        contentAlignment = Alignment.TopCenter) {
        content()
    }
}
@Composable
fun CardBodyContent(modifier: Modifier = Modifier, maxWidthFraction: Float, content: @Composable () -> Unit) {
    Box(modifier = modifier.fillMaxHeight().fillMaxWidth(maxWidthFraction).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp)), contentAlignment = Alignment.Center){
        content()
    }
}
@Preview
@Composable
fun MyEventsPreview(){
    MyEvent()
}