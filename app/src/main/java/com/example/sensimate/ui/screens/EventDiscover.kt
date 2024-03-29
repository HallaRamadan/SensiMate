package com.example.sensimate.ui.screens



import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.sensimate.model.Event
import com.example.sensimate.ui.components.Card
import com.example.sensimate.ui.components.Background
import com.example.sensimate.viewmodel.MainViewModel

import androidx.compose.material.*
import kotlin.reflect.KFunction1

/* -------- Composable that to display Discover screen  -------*/

@Composable
fun Discover(viewModel: MainViewModel) {
    viewModel.populateEventList()
    Background {
        if (!viewModel.loading.value) {

            val eventList = viewModel.eventlist
            for (event: Event in eventList) {
                Foodstuff(event, viewModel::replaceCurrentViewedEvent, viewModel::navigateToEventDetails)
            }
        Spacer(Modifier.height(55.dp))
        } else {
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                CircularProgressIndicator(modifier = Modifier
                    .align(Alignment.Center)
                    .size(80.dp)


                )
            }
        }
    }

}


@Composable

fun Foodstuff(event:Event, setEventCallback:(Event)-> Unit, navigationCallback: () -> Unit) {
    Card(modifier = Modifier
        .padding(0.dp)
        .height(150.dp)
        .clickable(onClick = {
            run { setEventCallback(event); navigationCallback(); }
        }),
        alignment = Alignment.CenterStart) {

            
            Row(
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(0.3F)
                    .fillMaxSize()) {
                    Image(rememberAsyncImagePainter(event.image), contentDescription ="content description", contentScale = ContentScale.Fit, modifier = Modifier.fillMaxSize())
                }


                Column(modifier = Modifier
                    .fillMaxHeight(0.8F)
                    .fillMaxWidth(0.9F)) {
                    Row(modifier = Modifier.fillMaxHeight(0.40F)){
                        Text(text = event.title.uppercase(), color = Color.White, fontSize = 20.sp)
                    }
                    Row(modifier = Modifier.fillMaxHeight(0.33F)){
                        Column(modifier = Modifier
                            .fillMaxWidth(0.5F)) {
                            Text(text = event.date, color = Color.White)
                        }
                        Column(modifier = Modifier
                            .fillMaxWidth(1F)
                            .padding(1.dp), horizontalAlignment = Alignment.End) {
                            Text(text = event.distance, color = Color.White)
                        }

                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Row(modifier = Modifier.fillMaxHeight(0.50F)){
                        Text(text = event.availability, color = Color.LightGray)
                    }
                }


                }
            }




        }


@Preview
@Composable
fun DiscoverPreview() {
    //Discover()

}