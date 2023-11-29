package components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import data.getHospitalMockData
import java.util.*

@Composable
fun HospitaListItems(state: MutableState<TextFieldValue>) {
    val hospitalMockData = getHospitalMockData().map { it.hospitalName }
    var filteredHospitals: List<String>
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        val searchedText = state.value.text
        filteredHospitals = if (searchedText.isEmpty()) {
            hospitalMockData
        } else {
            val resultList = ArrayList<String>()
            for (hospital in hospitalMockData) {
                if (hospital.lowercase(Locale.getDefault())
                        .contains(searchedText.lowercase(Locale.getDefault()))
                ) {
                    resultList.add(hospital)
                }
            }
            resultList
        }
        items(filteredHospitals) { filteredHospital ->
            HospitalItemDropDown(
                hospitalText = filteredHospital,
                onItemClick = { selectedHospital ->
                    /* Add code later */
                }
            )
        }
    }
}