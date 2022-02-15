package com.nauhalf.mysimplecleanarchitecture.data

import com.nauhalf.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Hello $name, Welcome to Clean Architecture")
}