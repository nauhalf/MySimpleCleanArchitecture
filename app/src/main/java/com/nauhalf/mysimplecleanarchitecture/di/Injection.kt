package com.nauhalf.mysimplecleanarchitecture.di

import com.nauhalf.mysimplecleanarchitecture.data.IMessageDataSource
import com.nauhalf.mysimplecleanarchitecture.data.MessageDataSource
import com.nauhalf.mysimplecleanarchitecture.data.MessageRepository
import com.nauhalf.mysimplecleanarchitecture.domain.IMessageRepository
import com.nauhalf.mysimplecleanarchitecture.domain.MessageInteractor
import com.nauhalf.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}