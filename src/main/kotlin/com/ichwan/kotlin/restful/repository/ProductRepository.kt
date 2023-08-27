package com.ichwan.kotlin.restful.repository

import com.ichwan.kotlin.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}