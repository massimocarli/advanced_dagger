package com.raywenderlich.rwnews.di

import dagger.Component
import javax.inject.Singleton

/**
 * Module for the App. It provides the NewsRepository
 */
@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {

  fun newsComponent(newsModule: NewsModule): NewsComponent
}