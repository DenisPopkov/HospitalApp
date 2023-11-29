package screens.hospital

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import components.DoctorItem
import data.HospitalModel

@Composable
fun HospitalScreen(hospitalModel: HospitalModel) {
    Column(
        modifier = Modifier.fillMaxSize().padding(all = 36.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Учреждение: ${hospitalModel.hospitalName}",
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            color = Color.Black
        )
        Text(
            text = "Время работы: ${hospitalModel.hospitalTime}",
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp,
            color = Color.Gray
        )
        Text(
            text = "Адрес: ${hospitalModel.hospitalGeo}",
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp,
            color = Color.Gray
        )
        LazyColumn {
            items(hospitalModel.hospitalDoctors) {
                DoctorItem(doctor = it) {
                    // On item click
                }
            }
        }
    }
}