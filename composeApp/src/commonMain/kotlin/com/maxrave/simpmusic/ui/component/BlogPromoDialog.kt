package com.maxrave.simpmusic.ui.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

/**
 * Legacy promotion hook intentionally disabled for SQLplayer.
 * Kept as a no-op so existing callers remain source-compatible without showing
 * creator-specific promotions or external links.
 */
@Composable
@ExperimentalMaterial3Api
fun BlogPromoDialog(
    onDismissRequest: () -> Unit,
    onVisitBlog: () -> Unit,
) {
    Unit
}
