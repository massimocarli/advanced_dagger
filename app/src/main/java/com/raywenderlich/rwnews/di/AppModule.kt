package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.repository.impl.MemoryNewsRepository
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

  @Binds
  abstract fun provideNewsRepository(newsRepository: MemoryNewsRepository): NewsRepository
}



