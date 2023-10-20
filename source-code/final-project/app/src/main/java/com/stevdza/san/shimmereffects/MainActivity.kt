package com.stevdza.san.shimmereffects

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stevdza.san.shimmereffects.ui.theme.ShimmerEffectsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShimmerEffectsTheme {
                MainScreen()
            }
        }
    }
}