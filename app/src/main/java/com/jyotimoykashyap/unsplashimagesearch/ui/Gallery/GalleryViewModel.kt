package com.jyotimoykashyap.unsplashimagesearch.ui.Gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.jyotimoykashyap.unsplashimagesearch.data.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository)
    : ViewModel() {

    private val currentQuery = MutableLiveData(DEFAULT_QUERY)

    val photos = currentQuery.switchMap {
        repository.getSearchResults(it).cachedIn(viewModelScope)
    }

    fun searchPhotos(query: String){
        currentQuery.value = query
    }

    companion object{
        private const val DEFAULT_QUERY = "cats"
    }
}