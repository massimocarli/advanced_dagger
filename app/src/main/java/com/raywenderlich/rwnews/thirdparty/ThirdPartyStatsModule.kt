package com.raywenderlich.rwnews.thirdparty

import com.raywenderlich.rwnews.stats.NewsStats
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class ThirdPartyStatsModule {

  @Provides
  @IntoSet
  fun provideWordsCountNewsStats(): NewsStats = WordCountNewsStats()
}