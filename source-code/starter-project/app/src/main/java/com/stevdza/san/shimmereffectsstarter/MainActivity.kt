package com.stevdza.san.shimmereffectsstarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stevdza.san.shimmereffectsstarter.ui.theme.ShimmerEffectsStarterTheme

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