package com.example.slotapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.slotapi.ui.theme.SlotApiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    SlotApiTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            HomeScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { ScaffoldTopBar() }
    ) {
        Box(
            modifier = Modifier.padding(it)
        ) {
            ScaffoldImage()
        }
    }
}

@Composable
fun ScaffoldTopBar() {
    Row(
        modifier = Modifier
            .background(Color.Blue)
            .padding(12.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Icon(
            Icons.Rounded.Home,
            contentDescription = null,
            tint = Color.White
        )

        Text(
            text = "Alura",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 22.sp
        )

        Icon(
            Icons.Rounded.ExitToApp,
            contentDescription = null,
            tint = Color.White
        )

    }
}

@Composable
fun ScaffoldImage() {
    
}

@Preview(showSystemUi = true)
@Composable
fun AppPreview() {
    App()
}