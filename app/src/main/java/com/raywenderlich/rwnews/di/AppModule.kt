package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.presenter.NewsDetailPresenter
import com.raywenderlich.rwnews.presenter.NewsListPresenter
import com.raywenderlich.rwnews.presenter.impl.NewsDetailPresenterImpl
import com.raywenderlich.rwnews.presenter.impl.NewsListPresenterImpl
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.repository.impl.MemoryNewsRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

  @Provides
  fun provideNewsListPresenter(repo: NewsRepository): NewsListPresenter =
    NewsListPresenterImpl(repo)

  @Provides
  fun provideNewsDetailPresenter(repo: NewsRepository): NewsDetailPresenter =
    NewsDetailPresenterImpl(repo)
}