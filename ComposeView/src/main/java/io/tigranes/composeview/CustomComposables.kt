package io.tigranes.composeview

import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface

data class TigranTextModel(var text: String)

@Model
class TigranTextModelState(var tigranTextModel: TigranTextModel)

@Composable
fun TigranText(tigranTextModelState: TigranTextModelState) {
    MaterialTheme {
        Surface {
            Text(tigranTextModelState.tigranTextModel.text)
        }
    }
}