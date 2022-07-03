package com.example.sportssocial

import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.MockitoAnnotations
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@RunWith(JUnit4::class)
class RetrofitClientUnitTest {

    lateinit var inter: Retrofit
    lateinit var mockServer: MockWebServer

    @Before
    fun setup(){
        MockitoAnnotations.openMocks(this)
        mockServer = MockWebServer()
        inter = Retrofit.Builder()
            .baseUrl(mockServer.url("/"))
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(Retrofit::class.java)
    }

    @Test
    fun getNewstest() {
        //8
        var mockRes = MockResponse()
        mockServer.enqueue(mockRes.setBody("[]"))
        //9
        val res = inter.
        val req = mockServer.takeRequest()
        //10
        Assert.assertEquals("v2/top-headlines", req.path)
        Assert.assertEquals(true, res.body()?.isEmpty() == true)

    }

    @After
    fun destroy() {
        mockServer.shutdown()
    }


}

