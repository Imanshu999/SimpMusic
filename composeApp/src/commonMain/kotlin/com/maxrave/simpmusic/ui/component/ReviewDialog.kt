package com.maxrave.simpmusic.ui.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

/**
 * Legacy review/promotion dialog intentionally disabled for SQLplayer.
 * Normal app functionality remains unchanged.
 */
@Composable
@ExperimentalMaterial3Api
fun ReviewDialog(
    onDismissRequest: () -> Unit,
    onDoneReview: () -> Unit,
) {
    Unit
}
