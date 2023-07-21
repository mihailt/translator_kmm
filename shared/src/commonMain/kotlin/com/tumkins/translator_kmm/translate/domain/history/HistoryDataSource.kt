package com.tumkins.translator_kmm.translate.domain.history

import com.tumkins.translator_kmm.core.domain.util.CommonFlow

interface HistoryDataSource {
    fun getHistory(): CommonFlow<List<HistoryItem>>
    suspend fun insertHistoryItem(item: HistoryItem)
}