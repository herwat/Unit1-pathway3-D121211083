package com.example.apk_card_name

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.apk_card_name.ui.theme.Apk_Card_NameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Apk_Card_NameTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFE8E8E8)
                ) {
                    MyProfile()
                    MyContact()

                }
            }
        }
    }
}

@Composable
fun MyProfile(){
    val image = painterResource(R.drawable.heracard)
    Column (modifier = Modifier
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = image, contentDescription = null, Modifier.size(120.dp)
        )
        Text("Herawati",
            textAlign = TextAlign.Center, fontSize = 25.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Serif)
        Text("Android Developer Extraordinaire",
            textAlign = TextAlign.Center, fontSize = 20.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif, fontWeight = FontWeight.Bold, color = Color.Green
        )
    }
}
@Composable
fun MyContact(){
    Column (modifier = Modifier
        .padding(90.dp, 42.dp),
        verticalArrangement = Arrangement.Bottom,
    ){
        Row {
            Icon(
                imageVector = Icons.Default.Phone, contentDescription = null, tint = Color.DarkGray,
            )
            Text(text = "+62872-3988-0123",
                textAlign = TextAlign.Left, fontFamily = androidx.compose.ui.text.font.FontFamily.Serif)
        }
        Row {
            Icon(
                imageVector = Icons.Default.Share, contentDescription = null,
                tint = Color.DarkGray,
            )
            Text(text = "Herawati",
                textAlign = TextAlign.Left,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif)
        }
        Row {
            Icon(
                imageVector = Icons.Default.Email, contentDescription = null,
                tint = Color.DarkGray,
            )
            Text(text = "hherawatii083@gmail.com",
                textAlign = TextAlign.Left,fontSize = 15.sp,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif
            )

        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun Apk_Card_NamePreview() {
    Apk_Card_NameTheme {
        MyProfile()
        MyContact()
    }
}