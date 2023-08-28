package com.ichwan.kotlin.restful.service

import com.ichwan.kotlin.restful.model.CreateProductRequest
import com.ichwan.kotlin.restful.model.ListProductRequest
import com.ichwan.kotlin.restful.model.ProductResponse
import com.ichwan.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>

}