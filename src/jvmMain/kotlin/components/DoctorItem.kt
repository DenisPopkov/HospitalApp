package components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.Doctor

@Composable
fun DoctorItem(doctor: Doctor, onItemClick: (Doctor) -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = { onItemClick(doctor) })
            .background(Color.Red)
            .height(57.dp)
            .fillMaxWidth()
            .padding(PaddingValues(8.dp, 16.dp)),
        horizontalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(text = doctor.doctorName, fontSize = 18.sp, color = Color.White)
        Text(text = doctor.doctorDegree, fontSize = 18.sp, color = Color.White)
    }
}