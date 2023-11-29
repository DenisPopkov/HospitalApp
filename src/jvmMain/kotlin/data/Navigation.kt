package data

sealed class NavDestination {
    object MainScreen : NavDestination()
    data class HospitalScreen(val hospitalModel: HospitalModel) : NavDestination()
    data class DoctorScreen(val hospitalModel: HospitalModel, val doctor: Doctor) : NavDestination()
}
