package com.raywenderlich.rwnews.init

import android.app.Application
import com.raywenderlich.rwnews.di.AppComponent
import com.raywenderlich.rwnews.di.AppModule
import com.raywenderlich.rwnews.di.DaggerAppComponent
import com.raywenderlich.rwnews.repository.impl.MemoryNewsRepository

/**
 * The Custom Application object where to put the Dependency Graph
 */
class InitApp : Application() {

  lateinit var appComponent: AppComponent

  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent
      .builder()
      .repository(MemoryNewsRepository())
      .build()
  }

  /**
   * The reference to the AppComponent
   */
  fun appComp() = appComponent
}