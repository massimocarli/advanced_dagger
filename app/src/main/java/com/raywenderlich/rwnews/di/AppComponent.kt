package com.raywenderlich.rwnews.di

import com.raywenderlich.news.android.ui.list.NewsListFragment
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import dagger.BindsInstance
import dagger.Component

@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

  fun inject(frag: NewsListFragment)

  fun inject(frag: NewsDetailFragment)

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun repository(repo: NewsRepository): Builder

    fun build(): AppComponent
  }
}