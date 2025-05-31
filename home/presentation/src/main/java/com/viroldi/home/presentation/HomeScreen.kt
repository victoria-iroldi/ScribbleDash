package com.viroldi.home.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.viroldi.core.presentation.components.ScribbleDashToolbar
import com.viroldi.core.presentation.design_system.BackgroundColor1
import com.viroldi.core.presentation.design_system.BackgroundColor2
import com.viroldi.core.presentation.design_system.SubTextColor
import com.viroldi.core.presentation.design_system.TextTitleColor
import com.viroldi.core.presentation.design_system.bagetFatOneFontFamily
import com.viroldi.core.presentation.design_system.outfit
import com.viroldi.home.presentation.components.ModeButton

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            ScribbleDashToolbar(
                title = stringResource(R.string.scribble_dash)
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(listOf(BackgroundColor1, BackgroundColor2)))
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier.height(200.dp)
            )
            Text(
                text = stringResource(R.string.start_drawing),
                fontFamily = bagetFatOneFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 40.sp,
                color = TextTitleColor
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = stringResource(R.string.select_game_mode),
                fontFamily = outfit,
                fontWeight = FontWeight.Normal,
                color = SubTextColor,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            ModeButton(
                Modifier.padding(horizontal = 16.dp),
                stringResource(R.string.one_round_wonder)
            )
        }

        NavigationBar {

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}