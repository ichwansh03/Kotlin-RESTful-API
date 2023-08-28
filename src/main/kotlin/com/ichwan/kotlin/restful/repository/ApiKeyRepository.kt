package com.ichwan.kotlin.restful.repository

import com.ichwan.kotlin.restful.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String> {
}