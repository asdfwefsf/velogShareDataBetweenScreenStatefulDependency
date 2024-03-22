package com.company.velogsharedatabetweenscreenstatefuldependency

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen1ViewModel @Inject constructor(
    // @Inject를 사용하였기 때문에 Hilt가 Screen1ViewModel 객체를 생성 할 때 아래의 GlobalCounter 객체를 자동으로 주입해준다.
    private val counter: GlobalCounter
): ViewModel() {

    val count = counter.count

    fun inc() {
        counter.inc()
    }
}