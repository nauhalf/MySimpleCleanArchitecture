package com.nauhalf.mysimplecleanarchitecture.data

import com.nauhalf.mysimplecleanarchitecture.domain.IMessageRepository
import com.nauhalf.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}