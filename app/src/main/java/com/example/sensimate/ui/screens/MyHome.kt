package com.example.sensimate.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
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
import androidx.lifecycle.ViewModel
import com.example.sensimate.R
import com.example.sensimate.ui.theme.SensiMateTheme


@Composable
fun MyEvent(viewModel: ViewModel) {
    SensiMateTheme {
        Background{
            Card {
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
            .fillMaxSize().padding(20.dp),
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
        Box(modifier = Modifier
            .width(370.dp)
            .fillMaxHeight(1F)
            .border(
                brush = Brush.horizontalGradient(listOf(MaterialTheme.colors.secondaryVariant, MaterialTheme.colors.error)),
                width = 3.dp,
                shape = RoundedCornerShape(18.dp)
            ).background(MaterialTheme.colors.surface, RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.TopCenter) {
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp), modifier = Modifier.padding(3.dp)){
                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.33F).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp)), contentAlignment = Alignment.Center){
                    Image(painterResource(R.drawable.hand_beer),"content description")
                }
                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.50F).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))){
                    Image(painterResource(R.drawable.cider),"content description", modifier = Modifier.size(1500.dp))
                }
                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(1F).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))){
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
        Box(modifier = Modifier
            .width(370.dp)
            .fillMaxHeight(1F)
            .border(
                brush = Brush.horizontalGradient(listOf(MaterialTheme.colors.secondaryVariant, MaterialTheme.colors.error)),
                width = 3.dp,
                shape = RoundedCornerShape(18.dp)
            ).background(MaterialTheme.colors.surface, RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.TopCenter) {
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp), modifier = Modifier.padding(3.dp)){
                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.33F).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp)), contentAlignment = Alignment.Center){
                    Image(painterResource(R.drawable.hand_beer),"content description", modifier = Modifier.size(150.dp))
                }
                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.50F).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))){
                    Image(painterResource(R.drawable.cider),"content description", modifier = Modifier.size(1500.dp))
                }
                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(1F).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))){
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
        Box(modifier = Modifier
            .width(370.dp)
            .fillMaxHeight(1F)
            .border(
                brush = Brush.horizontalGradient(listOf(MaterialTheme.colors.secondaryVariant, MaterialTheme.colors.error)),
                width = 3.dp,
                shape = RoundedCornerShape(18.dp)
            ).background(MaterialTheme.colors.surface, RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.TopCenter) {
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp), modifier = Modifier.padding(3.dp)){
                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.33F).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp)), contentAlignment = Alignment.Center){
                    Image(painterResource(R.drawable.hand_beer),"content description", modifier = Modifier.size(150.dp))
                }
                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.50F).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))){
                    Image(painterResource(R.drawable.cider),"content description", modifier = Modifier.size(1500.dp))
                }
                Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(1F).border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))){
                    Image(painterResource(R.drawable.coke),"content description", modifier = Modifier.size(1500.dp))
                }
            }
        }
    }
}
@Composable
fun Card (content: @Composable () -> Unit){
    Box(
        modifier = Modifier
            .width(370.dp)
            .height(220.dp).padding()
            .alpha(0.85f),

        contentAlignment = Alignment.TopCenter


    ) {
        content()
    }
}
@Composable
fun CardTitle(title: String){
    Box(modifier = Modifier
        .width(370.dp)
        .fillMaxHeight(0.15F)

        .border(
            brush = Brush.horizontalGradient(listOf(MaterialTheme.colors.secondaryVariant, MaterialTheme.colors.error)),
            width = 3.dp,
            shape = RoundedCornerShape(20.dp)
        ),
        contentAlignment = Alignment.Center) {
        Text(text = title, color = Color.White)
    }
}

