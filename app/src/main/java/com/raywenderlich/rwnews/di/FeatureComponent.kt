package com.raywenderlich.rwnews.di

import com.raywenderlich.news.android.ui.list.NewsListFragment
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import dagger.Subcomponent

@Subcomponent(
  modules = arrayOf(
    FeatureModule::class,
    StatsModule::class
  )
)
@FeatureScope
interface FeatureComponent {

  fun inject(frag: NewsListFragment)

  fun inject(frag: NewsDetailFragment)
}