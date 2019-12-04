package com.raywenderlich.rwnews.presenter.impl

import android.util.Log
import com.raywenderlich.common.mvp.impl.BasePresenter
import com.raywenderlich.rwnews.conf.TAG
import com.raywenderlich.rwnews.model.NewsListModel
import com.raywenderlich.rwnews.presenter.NewsListPresenter
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.ui.list.NewsListView


/**
 * Presenter for the display of the list
 */
class NewsListPresenterImpl(
  private val newsRepository: NewsRepository
) : BasePresenter<NewsListModel, NewsListView>(),
  NewsListPresenter {

  override fun displayNewsList() {
    Log.i(TAG, "In NewsListPresenterImpl using Repository $newsRepository")
    val newsList = newsRepository.list()
    view?.displayNews(NewsListModel(newsList))
  }
}