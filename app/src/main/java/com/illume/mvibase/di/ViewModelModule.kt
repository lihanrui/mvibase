package com.illume.mvibase.di

import com.illume.mvibase.domain.usecase.ExampleUseCase
import com.illume.mvibase.viewmodel.ExampleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ViewModelModule = module {
    viewModel { ExampleViewModel(get<ExampleUseCase>()) }
    factory { ExampleUseCase(get()) }
}