package com.illume.mvibase.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.illume.mvibase.domain.usecase.ExampleUseCase
import com.illume.mvibase.model.ExampleIntent
import com.illume.mvibase.model.ExampleState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ExampleViewModel(private val exampleUseCase: ExampleUseCase) : ViewModel() {

    private val _state = MutableStateFlow(ExampleState())
    val state: StateFlow<ExampleState> = _state.asStateFlow()

    init {
        loadExamples()
    }

    fun loadExamples() {
        viewModelScope.launch {
            try {
                exampleUseCase().collectLatest { exampleList ->
                    _state.update { currentState ->
                        currentState.copy(db_objects = exampleList, successDbFetch = true)
                    }
                }
            } catch (e: Exception) {
                _state.update { it.copy(errorMessage = e.message, successDbFetch = false) }
            }
        }
    }

    fun processIntent(intent: ExampleIntent) {
        when (intent) {
            is ExampleIntent.ExampleButtonClicked -> {
                // todo Handle button click here
            }
        }
    }

}