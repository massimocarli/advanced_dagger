package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.repository.impl.MemoryNewsRepository
import dagger.Binds
import dagger.Module

@Module
abstract class NewsRepositoryModule {

  @Binds
  abstract fun provideRepository(repoImpl: MemoryNewsRepository): NewsRepository
}