package com.raywenderlich.rwnews.presenter.impl

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.raywenderlich.rwnews.model.NewsListModel
import com.raywenderlich.rwnews.presenter.impl.NewsListPresenterImplTest.fakeNewsRepository.DATA
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.repository.entity.News
import com.raywenderlich.rwnews.ui.list.NewsListView
import org.junit.After
import org.junit.Before
import org.junit.Test

class NewsListPresenterImplTest {

  /**
   * Fake implementation of the NewsRepository
   */
  object fakeNewsRepository : NewsRepository {

    val DATA = listOf(
      News(1L, "title1", "body1"),
      News(2L, "title2", "body2"),
      News(3L, "title3", "body3")
    )

    override fun byId(id: Long): News? = null
    override fun list(): List<News> = DATA
    override fun insert(news: News) {}
  }

  lateinit var newsListPresenter: NewsListPresenterImpl
  lateinit var view: NewsListView

  @Before
  fun setUp() {
    view = mock()
    newsListPresenter = NewsListPresenterImpl(fakeNewsRepository).apply {
      bind(view)
    }
  }

  @After
  fun tearDown() {
    newsListPresenter.unbind()
  }

  @Test
  fun displayNewsList() {
    newsListPresenter.displayNewsList()
    verify(view).displayNews(NewsListModel(DATA))
  }
}