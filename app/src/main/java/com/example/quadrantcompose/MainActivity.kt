package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantComposeInterface()
        }
    }
}



@Composable
fun QuadrantComposeInterface(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ) {

        Row (
            modifier = Modifier
                .weight(1f)
        ){

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(12.dp)

                )

                Text(
                    style = MaterialTheme.typography.bodyMedium,
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify
                )
            }


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(12.dp)

                )

                Text(
                    style = MaterialTheme.typography.bodyMedium,
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify
                )
            }

        }







        Row (
            modifier = Modifier
                .weight(1f)
        ){

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(12.dp)

                )

                Text(
                    style = MaterialTheme.typography.bodyMedium,
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify
                )
            }


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(12.dp)

                )

                Text(
                    style = MaterialTheme.typography.bodyMedium,
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify
                )
            }

        }





    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantComposeInterfacePreview() {
    QuadrantComposeInterface()
}
