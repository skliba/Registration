package com.example.interviewapplication.repository

import com.example.interviewapplication.model.ErrorResponse
import com.example.interviewapplication.model.SuccessResponse

interface RegisterRepository {
    suspend fun success() : SuccessResponse
    suspend fun error() : ErrorResponse
}

class RegisterRepositoryImpl : RegisterRepository {

    override suspend fun success(): SuccessResponse {
        TODO("Not yet implemented")
    }

    override suspend fun error(): ErrorResponse {
        TODO("Not yet implemented")
    }
}