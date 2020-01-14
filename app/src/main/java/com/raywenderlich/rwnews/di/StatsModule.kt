package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.stats.LengthNewsStats
import com.raywenderlich.rwnews.stats.NewsStats
import dagger.Module
import dagger.Provides

@Module
class StatsModule {

  @Provides
  fun provideNewsStats(): Set<NewsStats> = setOf(
    LengthNewsStats()
  )
}