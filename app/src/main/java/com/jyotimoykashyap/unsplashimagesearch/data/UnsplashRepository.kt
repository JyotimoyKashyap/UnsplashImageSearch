package com.jyotimoykashyap.unsplashimagesearch.data

import com.jyotimoykashyap.unsplashimagesearch.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}