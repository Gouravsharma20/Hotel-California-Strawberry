package com.littlelemon.hotelstrawberry.ui.theme.userInterface

import android.annotation.SuppressLint
import android.widget.HorizontalScrollView
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.hotelstrawberry.R
import com.littlelemon.hotelstrawberry.ui.theme.HotelStrawberryTheme

@SuppressLint("ResourceType")
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TopScreen(modifier: Modifier = Modifier) {
    Column {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.BottomEnd) {
            Image(
                painter = painterResource(R.drawable.living_room),
                contentDescription = "hotel top image"
            )
            Column {
                Text(
                    "Hotel California Strawberry",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
                Row {
                    Icon(imageVector = Icons.Default.LocationOn,
                        contentDescription = "location"
                    )
                    Text("Los Angeles,California")
                }
                Row {
                    Icon(imageVector = Icons.Default.Star,
                        contentDescription = "Star"
                    )
                    Text("4.9(14K reviews)                          $420/night")
                }

            }
        }
        FlowRow(modifier = Modifier.padding(start = 20.dp), horizontalArrangement = Arrangement.SpaceBetween, maxItemsInEachRow = 3) {
            AssistChip(onClick = {}, label = { Text("City-Center", color = Color.Black) })
            AssistChip(onClick = {}, label = { Text("Luxury", color = Color.Black) })
            AssistChip(onClick = {}, label = { Text("Instant Booking", color = Color.Black) })
            AssistChip(onClick = {}, label = { Text("Exclusive Deal", color = Color.Black) })
            AssistChip(onClick = {}, label = { Text("Early Bird Discount", color = Color.Black) })
            AssistChip(onClick = {}, label = { Text("Romantic Gateway", color = Color.Black) })
            AssistChip(onClick = {}, label = { Text("24/7 Support", color = Color.Black) })
        }
        Box (contentAlignment = Alignment.Center){
            Text("text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it", modifier = Modifier.padding(20.dp))
        }
        Row () {
            Text(
                "What we offer",
                fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 100.dp))
        }

        FlowRow(
            Modifier.horizontalScroll(
                state = rememberScrollState(),
                reverseScrolling = true).padding(start = 25.dp), horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Box(
            Modifier.border(
                1.dp,
                color = Color.DarkGray
            ).background(Color.LightGray)
                .size(80.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(painter = painterResource(R.xml.bed), contentDescription = "cutlear",modifier = Modifier.padding(20.dp))
            Text("2 Bed", modifier = Modifier.padding(top = 4.dp))
        }
            Box(
                Modifier.border(
                    1.dp,
                    color = Color.DarkGray
                ).background(Color.LightGray)
                    .size(80.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(painter = painterResource(R.xml.breakfast), contentDescription = "cutlear",modifier = Modifier.padding(20.dp))
                Text("Breakfast", modifier = Modifier.padding(top = 4.dp))
            }

            Box(
                Modifier.border(
                    1.dp,
                    color = Color.DarkGray
                ).background(Color.LightGray)
                    .size(80.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(painter = painterResource(R.xml.cutlery), contentDescription = "cutlary",modifier = Modifier.padding(20.dp))
                Text("Kitchen", modifier = Modifier.padding(top = 4.dp))
            }

            Box(
                Modifier.border(
                    1.dp,
                    color = Color.DarkGray
                ).background(Color.LightGray)
                    .size(80.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(painter = painterResource(R.xml.pawprint), contentDescription = "pet print",modifier = Modifier.padding(20.dp))
                Text("Pet Friendly", modifier = Modifier.padding(top = 4.dp))
            }

            Box(
                Modifier.border(
                    1.dp,
                    color = Color.DarkGray
                ).background(Color.LightGray)
                    .size(80.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(painter = painterResource(R.xml.serving_dish), contentDescription = "serving dish",modifier = Modifier.padding(20.dp))
                Text("Dinner", modifier = Modifier.padding(top = 4.dp))
            }

            Box(
                Modifier.border(
                    1.dp,
                    color = Color.DarkGray
                ).background(Color.LightGray)
                    .size(80.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(painter = painterResource(R.xml.snowflake), contentDescription = "Ac waves",modifier = Modifier.padding(20.dp))
                Text("Air Conditioning", modifier = Modifier.padding(top = 4.dp))
            }
            Box(
                Modifier.border(
                    1.dp,
                    color = Color.DarkGray
                ).background(Color.LightGray)
                    .size(80.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(painter = painterResource(R.xml.television), contentDescription = "Tv",modifier = Modifier.padding(20.dp))
                Text("Tv", modifier = Modifier.padding(top = 4.dp))
            }
            Box(
                Modifier.border(
                    1.dp,
                    color = Color.DarkGray
                ).background(Color.LightGray)
                    .size(80.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(painter = painterResource(R.xml.wi_fi_icon), contentDescription = "wifi",modifier = Modifier.padding(20.dp))
                Text("Wifi", modifier = Modifier.padding(top = 2.dp))
            }
        }

        Button(
            onClick = {},
            shape = RoundedCornerShape(200.dp),
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .size(width = 300.dp, height = 60.dp)
                .padding(top = 18.dp), colors = ButtonDefaults.buttonColors(Color.Magenta)
        ) { Text("Book Now", color = Color.White) }


    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HotelStrawberryTheme {
        TopScreen()
    }
}