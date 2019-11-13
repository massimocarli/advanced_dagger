package com.raywenderlich.rwnews.di

import com.raywenderlich.news.android.ui.list.NewsListFragment
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {

  fun inject(frag: NewsListFragment)

  fun inject(frag: NewsDetailFragment)

  @Component.Factory
  interface Factory {

    fun create(@BindsInstance repo: NewsRepository): AppComponent
  }
}