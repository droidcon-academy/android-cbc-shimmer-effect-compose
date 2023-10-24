package com.droidcon.shimmerdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
            .padding(all = 24.dp),
    ) {
        CardPlaceholder()
        Spacer(modifier = Modifier.height(24.dp))
        CardPlaceholder()
    }
}

@Composable
fun CardPlaceholder() {
    val surface = MaterialTheme.colorScheme.surface
    val tertiaryContainer = MaterialTheme.colorScheme.tertiaryContainer
    val defaultGradient = remember { listOf(tertiaryContainer, surface) }

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .offsetShimmer(backgroundColor = Color.Transparent)
                .scaleShimmer()
                .gradientShimmer(gradient = Brush.linearGradient(defaultGradient))
                .height(300.dp),
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp)
                .offsetShimmer(
                    backgroundColor = Color.Transparent,
                    yOffset = 22
                )
                .scaleShimmer()
                .gradientShimmer(gradient = Brush.linearGradient(defaultGradient))
                .height(32.dp),
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(bottom = 8.dp)
                .offsetShimmer(
                    backgroundColor = Color.Transparent,
                    yOffset = 24
                )
                .scaleShimmer()
                .gradientShimmer(gradient = Brush.linearGradient(defaultGradient))
                .height(18.dp),
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(0.90f)
                .padding(bottom = 8.dp)
                .offsetShimmer(
                    backgroundColor = Color.Transparent,
                    yOffset = 26
                )
                .scaleShimmer()
                .gradientShimmer(gradient = Brush.linearGradient(defaultGradient))
                .height(18.dp),
        )
    }
}