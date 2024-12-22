package com.droidcon.shimmerdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.droidcon.shimmerdemo.ui.theme.ShimmerEffectsStarterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShimmerEffectsStarterTheme {
                MainScreen()
            }
        }
    }
}