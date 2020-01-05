package com.raywenderlich.rwnews.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raywenderlich.news.android.ui.list.NewsListFragment
import com.raywenderlich.rwnews.R
import com.raywenderlich.rwnews.di.FeatureComponent
import com.raywenderlich.rwnews.init.InitApp
import javax.inject.Provider

/**
 * Interface which defines a provider for the FeatureComponent
 */
typealias FeatureComponentProvider = Provider<FeatureComponent>

class MainActivity : AppCompatActivity(), FeatureComponentProvider {

  lateinit var featureComp: FeatureComponent

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
        .replace(R.id.anchor, NewsListFragment())
        .commit()
      featureComp = (applicationContext as InitApp).appComp().featureComp()
    }
  }

  override fun get(): FeatureComponent = featureComp
}
