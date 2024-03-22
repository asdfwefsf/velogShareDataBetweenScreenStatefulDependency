package com.company.velogsharedatabetweenscreenstatefuldependency

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
// Singleton으로 설정하였기 때문에 애플리케이션에서 단일 인스턴스로만 존재한다.
// 이로서 앱의 모든 장소에서 같은 GlobalCounter 인스턴스에 접근 할 수 있다.
class GlobalCounter @Inject constructor() {

    private val _count = MutableStateFlow(1)
    val count = _count.asStateFlow()

    fun inc() {
        _count.value += count.value
    }
}