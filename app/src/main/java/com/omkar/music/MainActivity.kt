
package com.omkar.music

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OmkarMusicApp()
        }
    }
}

private val Gold = Color(0xFFD6AD60)
private val Background = Color(0xFF080808)
private val SurfaceDark = Color(0xFF171717)

@Composable
fun OmkarMusicApp() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Background)
                .padding(22.dp)
        ) {
            Spacer(modifier = Modifier.height(24.dp))

            Text(
                "OMKAR",
                color = Gold,
                fontSize = 15.sp,
                letterSpacing = 5.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                "MUSIC",
                color = Color.White,
                fontSize = 34.sp,
                fontWeight = FontWeight.ExtraBold
            )

            Spacer(modifier = Modifier.height(28.dp))

            Text(
                "Your sound. Your world.",
                color = Color.LightGray,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                listOf("Home", "Online", "Local").forEach {
                    Surface(
                        color = if (it == "Home") Gold else SurfaceDark,
                        shape = RoundedCornerShape(24.dp)
                    ) {
                        Text(
                            it,
                            color = if (it == "Home") Color.Black else Color.White,
                            modifier = Modifier.padding(
                                horizontal = 20.dp,
                                vertical = 11.dp
                            ),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                "FEATURED",
                color = Gold,
                fontSize = 12.sp,
                letterSpacing = 3.sp
            )

            Spacer(modifier = Modifier.height(14.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.dp)
                    .background(
                        Brush.linearGradient(
                            listOf(
                                Color(0xFF473719),
                                Color(0xFF17130B),
                                Color(0xFF101010)
                            )
                        ),
                        RoundedCornerShape(24.dp)
                    )
                    .padding(22.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Column {
                    Text(
                        "NOW PLAYING",
                        color = Gold,
                        fontSize = 11.sp,
                        letterSpacing = 2.sp
                    )
                    Text(
                        "Discover your sound",
                        color = Color.White,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                "YOUR LIBRARY",
                color = Gold,
                fontSize = 12.sp,
                letterSpacing = 3.sp
            )

            Spacer(modifier = Modifier.height(14.dp))

            listOf("Recently Played", "Favorites", "Playlists").forEach {
                Surface(
                    color = SurfaceDark,
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(
                        it,
                        color = Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(18.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                "OMKAR MUSIC  •  MADE FOR YOU",
                color = Color.Gray,
                fontSize = 10.sp,
                letterSpacing = 1.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}

