package com.example.portafogliocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portafogliocompose.ui.theme.PortafoglioCOmposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortafoglioCOmposeTheme {
                // A surface container using the 'background' color from the theme

                cardBox()

            }
        }
    }
}


@Composable
fun cardBox() {
    Surface(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Card(
            Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(12.dp),
            backgroundColor = Color.White,
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            elevation = 16.dp

        )
        {
            Column(
                Modifier.height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                createAvatarProfile()
                Divider(color = Color.Black,startIndent = 10.dp)
            }
        }
    }
}

@Composable
private fun createAvatarProfile() {
    Surface(
        Modifier
            .size(150.dp)
            .padding(5.dp),
        shape = CircleShape,

        border = BorderStroke(0.5.dp, Color.White),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)

    ) {
        Image(
            painter = painterResource(id = R.drawable.avatar_suppport),
            contentDescription = "avatar profile",
            modifier = Modifier
                .size(150.dp)
                .shadow(9.dp),
            contentScale = ContentScale.Crop
        )


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PortafoglioCOmposeTheme {

        cardBox()

    }
}