package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.stats.LengthNewsStats
import com.raywenderlich.rwnews.stats.NewsStats
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet

@Module
class StatsModule {

  @Provides
  @ElementsIntoSet
  fun provideNewsStats(): Set<NewsStats> = setOf(
    LengthNewsStats()
  )
}