package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.repository.impl.MemoryNewsRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

  @Provides
  @Singleton
  fun repository(): NewsRepository = MemoryNewsRepository()
}