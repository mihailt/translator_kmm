package com.tumkins.translator_kmm.di

import com.tumkins.translator_kmm.testing.FakeHistoryDataSource
import com.tumkins.translator_kmm.testing.FakeTranslateClient
import com.tumkins.translator_kmm.testing.FakeVoiceToTextParser
import com.tumkins.translator_kmm.translate.domain.translate.Translate

class TestAppModule: AppModule {
    override val historyDataSource = FakeHistoryDataSource()
    override val client = FakeTranslateClient()
    override val translateUseCase = Translate(client, historyDataSource)
    override val voiceParser = FakeVoiceToTextParser()
}