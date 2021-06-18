package com.marinj.shoppingwarfare.android.feature.grocery

import androidx.lifecycle.viewModelScope
import com.marinj.shoppingwarfare.android.core.base.BaseViewModel
import com.marinj.shoppingwarfare.android.feature.grocery.GroceryEvent.GetGroceries
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GroceryViewModel @Inject constructor() : BaseViewModel<GroceryEvent>() {

    private val _groceryViewState = MutableStateFlow(GroceryViewState())
    val groceryViewState: StateFlow<GroceryViewState> = _groceryViewState

    override fun onEvent(event: GroceryEvent) {
        when (event) {
            GetGroceries -> handleGetGroceries()
        }
    }

    private fun handleGetGroceries() {
        viewModelScope.launch {
            _groceryViewState.value = _groceryViewState.value.copy(isLoading = true)
        }
    }
}
