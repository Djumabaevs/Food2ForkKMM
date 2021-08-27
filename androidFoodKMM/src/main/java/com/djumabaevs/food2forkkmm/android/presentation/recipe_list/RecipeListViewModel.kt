package com.djumabaevs.food2forkkmm.android.presentation.recipe_list

import androidx.lifecycle.SavedStateHandle
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle //don't need for this VM
) {
}