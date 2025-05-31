package com.viroldi.home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.viroldi.core.presentation.design_system.MenuButtonBorderColor
import com.viroldi.core.presentation.design_system.bagetFatOneFontFamily
import com.viroldi.home.presentation.R

@Composable
fun ModeButton(modifier: Modifier = Modifier, text: String) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .border(
                width = 8.dp,
                color = MenuButtonBorderColor,
                shape = RoundedCornerShape(CornerSize(16.dp))
            )
            .clip(RoundedCornerShape(CornerSize(16.dp)))
            .background(Color.White),

        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(
            modifier = Modifier
                .padding(8.dp)
                .padding(start = 22.dp)
                .padding(vertical = 26.dp)
                .wrapContentWidth(),
            text = text,
            fontFamily = bagetFatOneFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 26.sp,
            minLines = 2
        )
        Image(
            modifier = Modifier.padding(5.dp),
            alignment = Alignment.BottomEnd,
            painter = painterResource(R.drawable.one_round_wonder),
            contentDescription = stringResource(R.string.one_round_wonder)
        )
    }
}

@Composable
@Preview
fun ModeButtonPreview() {
    ModeButton(text = stringResource(R.string.one_round_wonder))
}