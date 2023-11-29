package data

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

data class HospitalModel(
    val hospitalName: String,
    val hospitalGeo: String,
    val hospitalTime: String,
    val hospitalDoctors: List<Doctor>
)

data class Doctor(
    val doctorName: String,
    val doctorDegree: String
)

@Composable
fun getHospitalMockData() = remember {
    mutableStateListOf(
        HospitalModel(
            hospitalName = "ГКБ им. С.П. Боткина",
            hospitalGeo = "Москва",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(Doctor(doctorName = "Иванова Анна Петровна", doctorDegree = "Хирург"))
        ),
        HospitalModel(
            hospitalName = "ГКБ им. Н.И. Пирогова",
            hospitalGeo = "Москва",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(Doctor(doctorName = "Попов Андрей Николаевич", doctorDegree = "Психиатр"))
        ),
        HospitalModel(
            hospitalName = "ГКБ им. В.В. Виноградова",
            hospitalGeo = "Москва",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(Doctor(doctorName = "Кузнецова Мария Дмитриевна", doctorDegree = "Терапевт"))
        ),
        HospitalModel(
            hospitalName = "ГКБ № 31",
            hospitalGeo = "Москва",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(Doctor(doctorName = "Козлова Елена Владимировна", doctorDegree = "Педиатр"))
        ),
        HospitalModel(
            hospitalName = "ГКБ им. Г.Б. Елизарова",
            hospitalGeo = "Санкт-Петербург",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(
                Doctor(
                    doctorName = "Васильев Дмитрий Александрович",
                    doctorDegree = "Нейрохирург"
                )
            )
        ),
    )
}