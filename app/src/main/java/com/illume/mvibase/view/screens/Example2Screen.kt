package com.illume.mvibase.view.screens


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.illume.mvibase.model.ExampleIntent
import com.illume.mvibase.view.theme.MVIBaseTheme
import com.illume.mvibase.viewmodel.ExampleViewModel
import org.koin.androidx.compose.koinViewModel

/*
 *  Secondary screen to demonstrate navigation between screens.
 *  You may want to implement your own ViewModel and instantiate that here.
 */
@Composable
fun Example2Route(
    navigateToExample: () -> Unit,
    popBackStack: () -> Boolean
) {
    val viewModel: ExampleViewModel = koinViewModel()
    Example2Screen(viewModel, navigateToExample, popBackStack)
}


@Composable
fun Example2Screen(
    viewModel: ExampleViewModel,
    navigateToExample: () -> Unit,
    popBackStack: () -> Boolean
) {
    // A duplicate of ExampleScreen.
    // Modify this to your own UI for a secondary screen, and scale from there.
    MVIBaseTheme {
        Scaffold(
            bottomBar = {
                BottomAppBar {
                    Button(
                        onClick = {
                            viewModel.processIntent(
                                intent = ExampleIntent.ExampleButtonClicked
                            )
                            navigateToExample()
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Go to first screen")
                    }
                }
            }
        ) { innerPadding ->
            // Content for most of your screen
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                Greeting(
                    txt = " Screen 2",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}
