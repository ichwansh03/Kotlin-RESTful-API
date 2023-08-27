package com.ichwan.kotlin.restful.service

import com.ichwan.kotlin.restful.model.CreateProductRequest
import com.ichwan.kotlin.restful.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse
}