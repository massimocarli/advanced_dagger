package com.raywenderlich.rwnews.di

import com.raywenderlich.news.android.ui.list.NewsListFragment
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import dagger.Component

@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

  fun inject(frag: NewsListFragment)

  fun inject(frag: NewsDetailFragment)
}