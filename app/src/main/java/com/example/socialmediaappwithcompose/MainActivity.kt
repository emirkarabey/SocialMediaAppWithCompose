package com.example.socialmediaappwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.socialmediaappwithcompose.ui.theme.SocialMediaAppWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SocialMediaAppWithComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomePage()
                }
            }
        }
    }
}

@Composable
fun HomePage() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SocialMediaAppWithComposeTheme {
        HomePage()
    }
}