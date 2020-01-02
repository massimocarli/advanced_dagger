package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.repository.NewsRepository
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {

  fun repository(): NewsRepository
}

