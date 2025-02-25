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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.illume.mvibase.model.ExampleIntent
import com.illume.mvibase.view.theme.MVIBaseTheme
import com.illume.mvibase.viewmodel.ExampleViewModel
import org.koin.androidx.compose.koinViewModel

/*
 *  Primary screen. This screen is initially loaded by ExampleNavGraph's NavHost call
 */
@Composable
fun ExampleRoute(
    navigateToExample2: () -> Unit
) {
    val viewModel: ExampleViewModel = koinViewModel()
    ExampleScreen(viewModel, navigateToExample2)
}


@Composable
fun ExampleScreen(viewModel: ExampleViewModel, navigateToExample2: () -> Unit) {
    MVIBaseTheme {
        Scaffold(
            bottomBar = {
                BottomAppBar {
                    Button(
                        onClick = {
                            viewModel.processIntent(
                                intent = ExampleIntent.ExampleButtonClicked
                            )
                            navigateToExample2()
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Go to second screen")
                    }
                }
            }
        ) { innerPadding ->
            // Content for most of the screen
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                Greeting(
                    txt = " Screen 1",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

@Composable
fun Greeting(txt: String = "", modifier: Modifier = Modifier) {
    Text(
        text = "This is $txt!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MVIBaseTheme {
        Greeting("a greeting preview")
    }
}