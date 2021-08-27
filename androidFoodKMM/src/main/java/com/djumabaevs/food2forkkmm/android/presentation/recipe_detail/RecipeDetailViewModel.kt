package com.djumabaevs.food2forkkmm.android.presentation.recipe_detail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeDetailViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
){
    private val recipeId: MutableState<Int?> = mutableStateOf(null)

    init {
        try {
            savedStateHandle.get<Int>("recipeId")?.let { recipeId ->
                this.recipeId.value = recipeId
            }
        } catch (e: Exception) {
         //will throw an exception if an arg is not there for whatever reason
        }
    }

}