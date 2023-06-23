package com.universefedi.universe

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.universefedi.universe.ui.theme.UniverseClientTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UniverseClientTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}
            ) {
                Icon(Icons.Default.Edit, contentDescription = stringResource(R.string.new_post))
            }
        },
        modifier = modifier
    ) { contentPadding ->
        LazyColumn(modifier = Modifier.padding(contentPadding)) {
            item {

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = { Text("Universe") },
        navigationIcon = { Icon(Icons.Default.Menu, contentDescription = stringResource(R.string.menu)) },
        modifier = modifier.padding(horizontal = 8.dp)
    )
}

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    NavigationBar(
        modifier = modifier.fillMaxWidth()
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text(stringResource(R.string.home)) },
            onClick = {},
            selected = true
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Search, contentDescription = null) },
            label = { Text(stringResource(R.string.search)) },
            onClick = {},
            selected = false
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Notifications, contentDescription = null) },
            label = { Text(stringResource(R.string.notifications)) },
            onClick = {},
            selected = false
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AccountCircle, contentDescription = null) },
            label = { Text(stringResource(R.string.accounts)) },
            onClick = {},
            selected = false
        )
    }
}

@Preview
@Composable
fun BottomBarPreview() {
    Surface {
        BottomBar()
    }

}

@Preview
@Composable
fun TopBarPreview() {
    Surface {
        TopBar()
    }
}