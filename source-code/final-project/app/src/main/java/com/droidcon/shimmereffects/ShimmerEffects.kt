package com.droidcon.shimmereffects

import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.dp

fun Modifier.gradientShimmer(
    gradient: Brush,
    animationDuration: Int = 1600,
    delay: Int = 0,
    easing: Easing = LinearEasing
) = composed {
    val infiniteTransition = rememberInfiniteTransition(label = "Infinite Gradient Transition")
    val animatedDegrees by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = animationDuration,
                easing = easing,
                delayMillis = delay
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = "Gradient Animation"
    )
    clipToBounds()
        .drawWithContent {
            rotate(degrees = animatedDegrees) {
                drawCircle(
                    brush = gradient,
                    radius = size.width
                )
            }
        }
}

fun Modifier.offsetShimmer(
    backgroundColor: Color = Color.LightGray.copy(alpha = 0.5f),
    yOffset: Int = 25,
    animationDuration: Int = 600,
    delay: Int = 0,
    easing: Easing = FastOutSlowInEasing
) = composed {
    val infiniteTransition = rememberInfiniteTransition(label = "Infinite Offset Transition")
    val animatedOffset by infiniteTransition.animateValue(
        initialValue = 0,
        targetValue = yOffset,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = animationDuration,
                easing = easing,
                delayMillis = delay
            ),
            repeatMode = RepeatMode.Reverse
        ),
        typeConverter = Int.VectorConverter,
        label = "Offset Animation"
    )
    offset(x = 0.dp, y = animatedOffset.dp)
        .background(backgroundColor)
}

fun Modifier.scaleShimmer(
    backgroundColor: Color = Color.LightGray.copy(alpha = 0.5f),
    animationDuration: Int = 600,
    delay: Int = 0,
    easing: Easing = FastOutSlowInEasing
) = composed {
    val infiniteTransition = rememberInfiniteTransition(label = "Infinite Scale Transition")
    val animatedScale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0.95f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = animationDuration,
                easing = easing,
                delayMillis = delay
            ),
            repeatMode = RepeatMode.Reverse
        ),
        label = "Scale Animation"
    )
    scale(animatedScale)
        .background(backgroundColor)
}