package com.example.bizlibottomnavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CashFlowScreen() {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        contentAlignment = Alignment.Center
    ){

        Text(text ="CASH FLOW \n SCREEN",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }

}


@Preview(showBackground = true)
@Composable
fun CashFlowScreenPreview() {
    CashFlowScreen()
}
