package com.example.sportssocial

import com.example.sportssocial.data.api.RetrofitClient
import com.example.sportssocial.data.model.dao.AthleteDao
import com.example.sportssocial.data.model.dao.NewsArticleDao
import com.example.sportssocial.data.repo.AthleteRepository
import com.example.sportssocial.data.repo.FirestoreRepo
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class AthleteRepositoryUnitTest {

    lateinit var athleteRepo: AthleteRepository

    @Mock

    lateinit var dao: AthleteDao

    @Mock
    lateinit var repo: FirestoreRepo


    @Before()
    fun setup() {
        repo = AthleteRepository(context = )




        MockitoAnnotations.openMocks(this)
    }

}