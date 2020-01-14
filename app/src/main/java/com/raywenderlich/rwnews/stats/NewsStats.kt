package com.raywenderlich.rwnews.stats

import com.raywenderlich.rwnews.repository.entity.News

// The Tag to use for the log of the stats
const val STATS_LOG = "NEWS_STATS"

/**
 * Abstraction for classes which parses
 */
interface NewsStats {

  /**
   * Prints the stats from the model
   */
  fun printStats(news: News)
}