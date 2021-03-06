package com.example.wanandroidkotlin.http

import com.example.wanandroidkotlin.homes.model.*
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 *  Created by hannah on 2020-01-17
 */
interface ApiServices{

    companion object{
        const val API_BASE_URL = "https://www.wanandroid.com"
    }

    // banner
    @GET("banner/json")
    fun getTop250(): Single<BannerBean>

    // article list
    @GET("article/list/{page}/json")
    fun getArticleList(@Path("page") id: Int): Single<Article>


    // knowledge
    @GET("tree/json")
    fun getKnowledgesList(): Observable<Knowledge>

    // wechat
    @GET("wxarticle/list/408/{page}/json")
    fun getWechatList(@Path("page") id: Int): Observable<Wechat>


    @GET("project/tree/json")
    fun getTabList(): Observable<TabBean>


    @GET("project/list/1/json")
    fun getTabProjectList(@Query("cid")cid: Int): Observable<Project>


}
