package edu.miu.composetextstyles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.miu.composetextstyles.ui.theme.ComposeTextStylesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTextStylesTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        Text(
                            text = "Welcome to Compose",
                            fontSize = 24.sp,
                            color = Color.Blue,
                            fontStyle = FontStyle.Normal,
                            textDecoration = TextDecoration.Underline,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Hello, Compose!",
                            fontSize = 25.sp,
                            color = Color.Magenta,
                            fontStyle = FontStyle.Normal,
                            fontFamily = FontFamily.Cursive,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Android Jetpack Compose",
                            fontSize = 25.sp,
                            color = Color(0xFF1C862A),
                            style = TextStyle(
                                shadow = Shadow(
                                    color = Color.Black,
                                    offset = Offset(
                                        5f, //The shadow is offset 5 pixels to the right
                                        5f  //The shadow is offset 5 pixels down from the text
                                    ),
                                    blurRadius = 5f //The shadow has a blur radius of 5 pixels, making it slightly blurred.
                                )
                            )
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "About Compose",
                            style = MaterialTheme.typography.headlineLarge
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Jetpack Compose is a modern UI toolkit for Android.",
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        val gradientColors = listOf(Color.Green, Color.Blue, Color.Magenta)
                        Text(
                            text = "Compose is really fun",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            style = TextStyle(
                                brush = Brush.linearGradient(colors = gradientColors)
                            )
                        )
                    }
                }
            }
        }
    }
}



@Composable
@Preview(showBackground = true)
fun MyTextPreview() {
    ComposeTextStylesTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {
            Text(
                text = "Welcome to Compose",
                fontSize = 24.sp,
                color = Color.Blue,
                fontStyle = FontStyle.Normal,
                textDecoration = TextDecoration.Underline,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Hello, Compose!",
                fontSize = 25.sp,
                color = Color.Magenta,
                fontStyle = FontStyle.Normal,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Android Jetpack Compose",
                fontSize = 25.sp,
                color = Color(0xFF1C862A),
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Black,
                        offset = Offset(
                            5f, //The shadow is offset 5 pixels to the right
                            5f  //The shadow is offset 5 pixels down from the text
                        ),
                        blurRadius = 5f //The shadow has a blur radius of 5 pixels, making it slightly blurred.
                    )
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "About Compose",
                style = MaterialTheme.typography.headlineLarge
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Jetpack Compose is a modern UI toolkit for Android.",
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(16.dp))
            val gradientColors = listOf(Color.Green, Color.Blue, Color.Magenta)
            Text(
                text = "Compose is really fun",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                style = TextStyle(
                    brush = Brush.linearGradient(colors = gradientColors)
                )
            )
        }
    }
}