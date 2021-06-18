package com.marinj.shoppingwarfare.android.feature.grocery

import com.marinj.shoppingwarfare.android.core.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GroceryViewModel @Inject constructor() : BaseViewModel<GroceryEvent>() {

    override fun onEvent(event: GroceryEvent) {
        when (event) {
            GroceryEvent.GetGroceries -> TODO()
        }
    }
}
