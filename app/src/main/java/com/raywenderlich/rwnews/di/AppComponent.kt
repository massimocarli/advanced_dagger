package com.raywenderlich.rwnews.di

import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class, FeatureModule::class))
@Singleton
interface AppComponent {

  fun featureComp(): FeatureComponent
}

