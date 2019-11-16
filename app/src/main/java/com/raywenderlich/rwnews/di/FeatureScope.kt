package com.raywenderlich.rwnews.di

import javax.inject.Scope

/**
 * Annotation for the Scope to use for a feature
 *
 * @see javax.inject.Scope @Scope
 */
@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class FeatureScope