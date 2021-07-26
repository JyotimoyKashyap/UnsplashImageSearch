package com.jyotimoykashyap.unsplashimagesearch.ui.Gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.jyotimoykashyap.unsplashimagesearch.data.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository)
    : ViewModel() {
}