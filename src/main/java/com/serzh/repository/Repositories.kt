package com.serzh.example.repository

import com.serzh.example.entity.Article
import com.serzh.example.entity.User
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
	fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, String>
