package com.nauhalf.mysimplecleanarchitecture.data

import com.nauhalf.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}