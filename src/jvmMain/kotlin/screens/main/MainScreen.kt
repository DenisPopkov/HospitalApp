package screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import components.InputField

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 36.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier.size(96.dp),
            painter = painterResource("ic_logo.webp"),
            contentDescription = "Logo image"
        )
        Text(
            text = "Минздрав России",
            color = Color.Black,
            fontSize = 36.sp,
            fontWeight = FontWeight.Black
        )
        InputField()
        Spacer(modifier = Modifier.weight(1f))
    }
}