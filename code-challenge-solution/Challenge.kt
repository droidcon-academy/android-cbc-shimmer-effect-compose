import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color

fun Modifier.pulsatingShimmer(
    backgroundColor: Color = Color.LightGray.copy(alpha = 0.5f),
    animationDuration: Int = 600,
    delay: Int = 0,
    easing: Easing = FastOutSlowInEasing
) = composed {
    val infiniteTransition = rememberInfiniteTransition(label = "Infinite Transition")
    val animatedAlpha by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = animationDuration,
                easing = easing,
                delayMillis = delay
            ),
            repeatMode = RepeatMode.Reverse
        ), label = "Infinite Alpha Animation"
    )
    alpha(alpha = animatedAlpha)
        .background(backgroundColor)
}