package screens.doctor

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.Doctor
import data.HospitalModel
import data.NavDestination

@Composable
fun DoctorScreen(currentScreen: MutableState<NavDestination>, hospitalModel: HospitalModel, doctor: Doctor) {
    Column(
        modifier = Modifier.fillMaxSize().padding(all = 36.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Button(onClick = {
            currentScreen.value = NavDestination.HospitalScreen(hospitalModel)
        }) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
        }
        Text(
            text = "ФИО: ${doctor.doctorName}",
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            color = Color.Black
        )
        Text(
            text = "Должность: ${doctor.doctorDegree}",
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp,
            color = Color.Gray
        )
        Text(
            text = "Стаж: ${doctor.doctorExperience}",
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp,
            color = Color.Gray
        )
        Text(
            text = "Время работы: ${doctor.doctorWorkSchedule}",
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp,
            color = Color.Gray
        )
    }
}