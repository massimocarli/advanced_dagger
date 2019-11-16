package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.presenter.NewsDetailPresenter
import com.raywenderlich.rwnews.presenter.NewsListPresenter
import com.raywenderlich.rwnews.presenter.impl.NewsDetailPresenterImpl
import com.raywenderlich.rwnews.presenter.impl.NewsListPresenterImpl
import com.raywenderlich.rwnews.repository.NewsRepository
import dagger.Module
import dagger.Provides

/**
 * This is the Module to use for the News feature
 */
@Module
class NewsModule {

  @Provides
  fun provideNewsListPresenter(repo: NewsRepository): NewsListPresenter =
    NewsListPresenterImpl(repo)

  @Provides
  fun provideNewsDetailPresenter(repo: NewsRepository): NewsDetailPresenter =
    NewsDetailPresenterImpl(repo)
}