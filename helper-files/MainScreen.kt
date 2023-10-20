package com.droidcon.shimmereffectsstarter

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
    val surfaceVariant = MaterialTheme.colorScheme.tertiaryContainer
    val defaultGradient = remember { listOf(surfaceVariant, surface) }

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .height(300.dp),
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp)
                .height(32.dp),
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(bottom = 8.dp)
                .height(18.dp),
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(0.90f)
                .padding(bottom = 8.dp)
                .height(18.dp),
        )
    }
}