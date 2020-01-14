package com.raywenderlich.rwnews.stats

import android.util.Log
import com.raywenderlich.rwnews.repository.entity.News

/**
 * Simple implementation of the NewsStats interface which prints the
 * length of the body of the News
 */
class LengthNewsStats : NewsStats {
  override fun printStats(news: News) {
    Log.i(STATS_LOG, "News Length: ${news.body.length}")
  }
}