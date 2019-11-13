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
  private val repo: NewsRepository
) {

  @Provides
  fun provideNewsListPresenter(): NewsListPresenter = NewsListPresenterImpl(repo)

  @Provides
  fun provideNewsDetailPresenter(): NewsDetailPresenter = NewsDetailPresenterImpl(repo)
}