package com.example.sensimate.ui.screens

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import androidx.compose.foundation.layout.Column

import androidx.compose.ui.text.input.TextFieldValue


@Composable
fun Survey_PageToPersonInfo(){
    frame {
        Column(modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly) {




    progress_indicator(0.1f, prog = "1/7")
    questionscreen("Before we start, we would like to\n" +
            "know a little about you")}}


    Info()
    NextandPreviousButton()}


@Preview
@Composable
fun Survey_PageToPersonInfoPreview(){
    Survey_PageToPersonInfo()
}

@Preview
@Composable
fun Info() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier
            .size(
                width = 350.dp,
                height = 300.dp
            )


            .clip(RoundedCornerShape(20.dp))
            .border(
                BorderStroke(2.dp, MaterialTheme.colors.onBackground),
                RoundedCornerShape(20.dp)
            )
            .background(Color(0xFFFFFFFF))
            .border(BorderStroke(1.dp, Color(0xFFFFFFFF)), RoundedCornerShape(20.dp)),

            contentAlignment = Alignment.Center




        ) {

            Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
                AgeInfo()
                Gender()
                Postcode()
            }

           /* Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ) {
            AgeInfo()}
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ){
            Gender()}
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxHeight(1F)
                    .fillMaxWidth(1F)
            ){
            Postcode()}*/

    }
}}

@Preview
@Composable
fun AgeInfo(){
        Row ( modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(39.dp),



        ){
            Text(text = "Alder",
                modifier = Modifier.padding(
                    top = 25.dp

                )

            )
            LabelAndPlaceHolder(label = "Alder", skriv = "hvor gammel er du")


}}


@Composable
fun LabelAndPlaceHolder(label: String, skriv: String) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField( modifier = Modifier
        .width(200.dp)
        .height(60.dp),

        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(text = label) },
        placeholder = { Text(text = skriv) },
        shape = RoundedCornerShape(20.dp)
    )
}



/*
@Preview
@Composable
fun TextField(visualTransformation:VisualTransformation = VisualTransformation.None,
              keyboardOptions: KeyboardOptions = KeyboardOptions.Default) {
    val (text, setText) = remember {
        mutableStateOf("")
    }
    OutlinedTextField(modifier = Modifier
        .width(200.dp)
        .height(10.dp),
        value = "$text",
        onValueChange ={setText(it)},
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        shape = RoundedCornerShape(20.dp)

    )

}*/

@SuppressLint("SuspiciousIndentation")
@Preview
@Composable
fun Gender() {
    var expanded by remember { mutableStateOf(false) }
    val suggestions = listOf("male", "female", "other")
    var selectedText by remember { mutableStateOf("") }

    var textfieldSize by remember { mutableStateOf(Size.Zero) }

    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

        Row ( modifier = Modifier,

                horizontalArrangement = Arrangement.spacedBy(20.dp),

                ){
            Text(text = "Gender",
                modifier = Modifier.padding(
                    top = 25.dp

                )

            )

            OutlinedTextField(
                shape = RoundedCornerShape(15.dp),
                value = selectedText,
                onValueChange = { selectedText = it },
                modifier = Modifier

                    .width(200.dp)
                    .height(60.dp)
                    .onGloballyPositioned { coordinates ->
                        //This value is used to assign to the DropDown the same width
                        textfieldSize = coordinates.size.toSize()
                    },
                label = { Text("Label") },
                trailingIcon = {
                    Icon(icon, "contentDescription",
                        Modifier.clickable { expanded = !expanded })
                }
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .width(with(LocalDensity.current) { textfieldSize.width.toDp() })
            ) {
                suggestions.forEach { label ->
                    DropdownMenuItem(onClick = {
                        selectedText = label
                        expanded = false
                    }) {
                        Text(text = label)
                    }
                }
            }
        }

    }

@Preview
@Composable
fun Postcode(){

        Row ( modifier = Modifier,

            horizontalArrangement = Arrangement.spacedBy(6.dp),


        ){
            Text(text = "Postnummer",
                modifier = Modifier.padding(
                    top = 25.dp)

            )
            LabelAndPlaceHolder(label = "Postnummer", skriv = "skriv dit postnummer")


        }}
