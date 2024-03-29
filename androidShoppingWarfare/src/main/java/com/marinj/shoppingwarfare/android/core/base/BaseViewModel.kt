package com.marinj.shoppingwarfare.android.core.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<E> : ViewModel() {
    abstract fun onEvent(event: E)
}
