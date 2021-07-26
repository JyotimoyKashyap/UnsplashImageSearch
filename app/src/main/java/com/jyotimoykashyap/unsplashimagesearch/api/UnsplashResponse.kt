package com.jyotimoykashyap.unsplashimagesearch.api

import com.jyotimoykashyap.unsplashimagesearch.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)