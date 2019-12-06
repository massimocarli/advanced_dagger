package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.presenter.NewsDetailPresenter
import com.raywenderlich.rwnews.presenter.NewsListPresenter
import com.raywenderlich.rwnews.presenter.impl.NewsDetailPresenterImpl
import com.raywenderlich.rwnews.presenter.impl.NewsListPresenterImpl
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.repository.impl.MemoryNewsRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class AppModule {

  @Module
  companion object {
    @Provides
    @JvmStatic
    fun provideNewsListPresenter(repo: NewsRepository): NewsListPresenter =
      NewsListPresenterImpl(repo)

    @Provides
    @JvmStatic
    fun provideNewsDetailPresenter(repo: NewsRepository): NewsDetailPresenter =
      NewsDetailPresenterImpl(repo)
  }

  @Binds
  abstract fun provideRepository(repoImpl: MemoryNewsRepository): NewsRepository
}