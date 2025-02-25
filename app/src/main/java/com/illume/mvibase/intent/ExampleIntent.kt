package com.illume.mvibase.intent

sealed class ExampleIntent {
    data object ExampleButtonClicked : ExampleIntent()
}