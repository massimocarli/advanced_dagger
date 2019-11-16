package com.raywenderlich.rwnews.di

import com.raywenderlich.news.android.ui.list.NewsListFragment
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import dagger.Subcomponent


/**
 * This is the @Subcomponent to use for the News feature
 */
@FeatureScope
@Subcomponent(modules = arrayOf(NewsModule::class))
interface NewsComponent {

  fun inject(frag: NewsListFragment)

  fun inject(frag: NewsDetailFragment)
}