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
    val doctorDegree: String,
    val doctorExperience: String,
    val doctorWorkSchedule: String
)

@Composable
fun getHospitalMockData() = remember {
    mutableStateListOf(
        HospitalModel(
            hospitalName = "ГКБ им. С.П. Боткина",
            hospitalGeo = "Москва",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(Doctor(doctorName = "Иванова Анна Петровна", doctorDegree = "Хирург", doctorExperience = "12", doctorWorkSchedule = "10:00-18:00"),Doctor(doctorName = "Титов Алексей Владимирович", doctorDegree = "Травматолог-ортопед", doctorExperience = "14", doctorWorkSchedule = "08:00-18:00"), Doctor(doctorName = "Куликов Иван Васильевич", doctorDegree = "Эндоскопист", doctorExperience = "22", doctorWorkSchedule = "12:00-20:00"))
        ),
        HospitalModel(
            hospitalName = "ГКБ им. Н.И. Пирогова",
            hospitalGeo = "Москва",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(Doctor(doctorName = "Попов Андрей Николаевич", doctorDegree = "Психиатр", doctorExperience = "15", doctorWorkSchedule = "08:00-18:00"),Doctor(doctorName = "Комарова Ольга Павловна", doctorDegree = "фтизиатр", doctorExperience = "16", doctorWorkSchedule = "10:00-18:00"), Doctor(doctorName = "Полякова Ольга Анатольевна", doctorDegree = "Диетолог", doctorExperience = "17", doctorWorkSchedule = "11:00-19:00"))
        ),
        HospitalModel(
            hospitalName = "ГКБ им. В.В. Виноградова",
            hospitalGeo = "Москва",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(Doctor(doctorName = "Кузнецова Мария Дмитриевна", doctorDegree = "Терапевт", doctorExperience = "23", doctorWorkSchedule = "10:00-18:00"),Doctor(doctorName = "Федосеев Сергей Александрович", doctorDegree = "Офтальмолог", doctorExperience = "12", doctorWorkSchedule = "08:00-18:00"), Doctor(doctorName = "Кузьмин Алексей Валентинович", doctorDegree = "Гематолог", doctorExperience = "18", doctorWorkSchedule = "12:00-20:00"))
        ),
        HospitalModel(
            hospitalName = "ГКБ № 31",
            hospitalGeo = "Москва",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(Doctor(doctorName = "Козлова Елена Владимировна", doctorDegree = "Педиатр", doctorExperience = "9", doctorWorkSchedule = "08:00-18:00"),Doctor(doctorName = "Козлова Елена Владимировна", doctorDegree = "Отоларинголог", doctorExperience = "11", doctorWorkSchedule = "10:00-18:00"), Doctor(doctorName = "Головачев Дмитрий Владимирович", doctorDegree = "Рентгенхирург", doctorExperience = "19", doctorWorkSchedule = "11:00-19:00"))
        ),
        HospitalModel(
            hospitalName = "ГКБ им. Г.Б. Елизарова",
            hospitalGeo = "Санкт-Петербург",
            hospitalTime = "08:00-18:00",
            hospitalDoctors = listOf(Doctor(doctorName = "Васильев Дмитрий Александрович", doctorDegree = "Нейрохирург", doctorExperience = "10", doctorWorkSchedule = "10:00-18:00"),Doctor(doctorName = "Козлова Елена Владимировна", doctorDegree = "Эндокринолог", doctorExperience = "24", doctorWorkSchedule = "08:00-18:00"), Doctor(doctorName = "Соколова Мария Сергеевна", doctorDegree = "Венеролог", doctorExperience = "16", doctorWorkSchedule = "12:00-20:00"))
        ),
    )
}