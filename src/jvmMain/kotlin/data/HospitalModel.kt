package data

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
