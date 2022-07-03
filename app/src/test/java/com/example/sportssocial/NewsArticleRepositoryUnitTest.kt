package com.example.sportssocial

import android.content.Context
import com.example.sportssocial.data.api.RetrofitClient
import com.example.sportssocial.data.model.dao.AthleteDao
import com.example.sportssocial.data.model.dao.NewsArticleDao
import com.example.sportssocial.data.repo.FirestoreRepo
import com.example.sportssocial.data.repo.NewsArticleRepository
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock


@RunWith(JUnit4::class)
class NewsArticleRepositoryUnitTest {

    lateinit var repo: NewsArticleRepository


    @Mock
    lateinit var dao: NewsArticleDao

    @Mock
    lateinit var inter: RetrofitClient

    var context= Context


    @Before()
    fun setup(){
        repo = NewsArticleRepository(context = Context)
    }

}