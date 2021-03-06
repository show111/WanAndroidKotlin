package com.example.wanandroidkotlin.homes.view.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.wanandroidkotlin.homes.model.ArticleItem
import kotlinx.android.synthetic.main.view_item_article.view.*

/**
 *  Created by hannah on 2020-01-24
 */
class ArticleHolder(articleView: View):  RecyclerView.ViewHolder(articleView){

    private var view: View = articleView

    fun showArticle(
        dataX: ArticleItem,
        onItemClick: ((ArticleItem) -> Unit)?
    ) {
        view.author.text = dataX.author
        view.articleView.text = dataX.title
        view.date.text = dataX.niceDate
        view.category.text = dataX.superChapterName

        view.setOnClickListener {
            onItemClick?.invoke(dataX)
        }
    }

}
