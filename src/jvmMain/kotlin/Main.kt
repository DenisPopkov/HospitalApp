import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import data.NavDestination
import screens.doctor.DoctorScreen
import screens.hospital.HospitalScreen
import screens.main.MainScreen

@Composable
@Preview
fun App() {
    val currentScreen: MutableState<NavDestination> =
        remember { mutableStateOf(NavDestination.MainScreen) }
    MaterialTheme {
        when (val destination = currentScreen.value) {
            is NavDestination.MainScreen -> MainScreen(currentScreen)
            is NavDestination.HospitalScreen -> HospitalScreen(currentScreen, destination.hospitalModel)
            is NavDestination.DoctorScreen -> DoctorScreen(currentScreen, destination.hospitalModel, destination.doctor)
        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Регистратура") {
        App()
    }
}
