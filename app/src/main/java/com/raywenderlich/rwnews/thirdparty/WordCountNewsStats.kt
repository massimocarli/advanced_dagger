package com.raywenderlich.rwnews.thirdparty

import android.util.Log
import com.raywenderlich.rwnews.repository.entity.News
import com.raywenderlich.rwnews.stats.NewsStats
import com.raywenderlich.rwnews.stats.STATS_LOG

/**
 * Counts the number of words in the body of the News
 */
class WordCountNewsStats : NewsStats {
  override fun printStats(news: News) {
    val wordsCount = news.body.splitToSequence(" ").count()
    Log.i(STATS_LOG, "News Work count: ${wordsCount}")
  }
}