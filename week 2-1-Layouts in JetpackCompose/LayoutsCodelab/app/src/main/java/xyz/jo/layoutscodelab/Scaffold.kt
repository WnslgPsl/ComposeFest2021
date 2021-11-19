package xyz.jo.layoutscodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.jo.layoutscodelab.ui.theme.LayoutsCodelabTheme

@Composable
fun ScaffoldCodelab() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "ScaffoldCodelab")
                },
                actions = {
                    IconButton(onClick = {  }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                }
            )
        }
    ) {
        Scaffold {
            ScaffoldBodyContent(Modifier.padding(it).padding(8.dp))
        }
    }
}

@Composable
fun ScaffoldBodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hi there!")
        Text(text = "Thanks for going through the Layouts codelab")
    }
}

@Preview
@Composable
fun ScaffoldCodelabPreview() {
    LayoutsCodelabTheme {
        ScaffoldCodelab()
    }
}