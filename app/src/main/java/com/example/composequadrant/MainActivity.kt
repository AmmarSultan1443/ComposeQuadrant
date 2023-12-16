package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant("Android")
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(name: String, modifier: Modifier = Modifier) {


    Column {
        Row(modifier = modifier.weight(0.5F,true)) {
            Column(
                modifier = modifier
                    .padding(16.dp)
                    .background(colorResource(id = R.color.color1))
                    .weight(0.5F),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Text composable",
                    modifier = modifier,
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }

            Column(
                modifier = modifier
                    .padding(16.dp)
                    .background(colorResource(id = R.color.color2))
                    .weight(0.5F),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Image composable",
                    modifier = modifier,
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }
        }

        Row(modifier = modifier.weight(0.5F,true)) {
            Column(
                modifier = modifier
                    .padding(16.dp)
                    .background(colorResource(id = R.color.color3))
                    .weight(0.5F, true),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Row composable",
                    modifier = modifier,
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }

            Column(
                modifier = modifier
                    .padding(16.dp)
                    .background(colorResource(id = R.color.color4))
                    .weight(0.5F, true),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Column composable",
                    modifier = modifier,
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant("Android")
    }
}