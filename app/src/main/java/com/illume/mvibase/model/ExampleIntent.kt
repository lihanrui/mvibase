package com.illume.mvibase.model

sealed class ExampleIntent {
    data object ExampleButtonClicked : ExampleIntent()
}