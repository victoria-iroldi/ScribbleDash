package com.viroldi.core.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.viroldi.core.presentation.design_system.BackgroundColor1
import com.viroldi.core.presentation.design_system.TextTitleColor
import com.viroldi.core.presentation.design_system.bagetFatOneFontFamily
import com.viroldi.core.presentation.design_system.largeText
import com.viroldi.core.presentation.design_system.mediumPadding
import com.viroldi.core.presentation.design_system.mediumPadding2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScribbleDashToolbar(title: String, modifier: Modifier = Modifier) {
    TopAppBar(
        title =  {
            Text(
                text = title,
                fontFamily = bagetFatOneFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = largeText,
                color = TextTitleColor
            )
        },
        modifier = modifier.background(BackgroundColor1).padding(horizontal = mediumPadding, vertical = mediumPadding2),
        colors = TopAppBarColors(
            containerColor = BackgroundColor1,
            scrolledContainerColor = BackgroundColor1,
            navigationIconContentColor = TextTitleColor,
            titleContentColor = TextTitleColor,
            actionIconContentColor = TextTitleColor
        ),
    )
}