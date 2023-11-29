package components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun InputField() {
    val mockList = remember { mutableStateListOf("Hospital 1", "Hospital 2", "Hospital 3") }
    var searchText by remember { mutableStateOf("") }
    val filteredList = remember(searchText) {
        mockList.filter { it.contains(searchText, ignoreCase = true) }
    }
    var isDropdownExpanded by remember { mutableStateOf(false) }

    Column {
        TextField(
            value = searchText,
            onValueChange = { searchText = it },
            label = { Text("Search") },
            modifier = Modifier.fillMaxWidth()
        )
        DropdownMenu(
            expanded = isDropdownExpanded && filteredList.isNotEmpty(),
            onDismissRequest = { isDropdownExpanded = false }
        ) {
            filteredList.forEach { suggestion ->
                DropdownMenuItem(onClick = {
                    searchText = suggestion
                    isDropdownExpanded = false
                }) {
                    Text(suggestion)
                }
            }
        }
    }
}