package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.presenter.NewsDetailPresenter
import com.raywenderlich.rwnews.presenter.NewsListPresenter
import com.raywenderlich.rwnews.presenter.impl.NewsDetailPresenterImpl
import com.raywenderlich.rwnews.presenter.impl.NewsListPresenterImpl
import com.raywenderlich.rwnews.repository.NewsRepository
import dagger.Module
import dagger.Provides

@Module
class AppModule(
  private val newsRepository: NewsRepository
) {

  @Provides
  fun provideNewsListPresenter(): NewsListPresenter = NewsListPresenterImpl(newsRepository)

  @Provides
  fun provideNewsDetailPresenter(): NewsDetailPresenter = NewsDetailPresenterImpl(newsRepository)

}