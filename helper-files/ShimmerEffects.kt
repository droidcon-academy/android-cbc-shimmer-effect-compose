package com.droidcon.shimmerdemo

import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

fun Modifier.gradientShimmer(
    gradient: Brush,
    animationDuration: Int = 1600,
    delay: Int = 0,
    easing: Easing = LinearEasing
) {
    TODO("Implement a Gradient Shimmer")
}

fun Modifier.offsetShimmer(
    backgroundColor: Color = Color.LightGray.copy(alpha = 0.5f),
    yOffset: Int = 25,
    animationDuration: Int = 600,
    delay: Int = 0,
    easing: Easing = FastOutSlowInEasing
) {
    TODO("Implement an Offset Shimmer")
}

fun Modifier.scaleShimmer(
    animationDuration: Int = 600,
    delay: Int = 0,
    easing: Easing = FastOutSlowInEasing
) {
    TODO("Implement a Scale Shimmer")
}