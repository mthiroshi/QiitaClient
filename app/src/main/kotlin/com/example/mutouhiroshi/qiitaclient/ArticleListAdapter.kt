package com.example.mutouhiroshi.qiitaclient

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.mutouhiroshi.qiitaclient.model.Article
import com.example.mutouhiroshi.qiitaclient.view.ArticleView
import java.text.FieldPosition


class ArticleListAdapter(private val context: Context) :BaseAdapter() {
    var articles: List<Article> = emptyList()

    override fun getCount(): Int = articles.size

    override fun getItem(position: Int): Any? = articles[position]

    override fun getItemId(position: Int): Long = 0

    override fun getView(position: Int,
                         convertView: View?,
                         parent: ViewGroup?): View =
            ((convertView as? ArticleView) ?: ArticleView(context)).apply { setArticle(articles[position]) }

}

