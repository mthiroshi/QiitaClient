package com.example.mutouhiroshi.qiitaclient

import android.app.Application
import com.example.mutouhiroshi.qiitaclient.dagger.AppComponent
import com.example.mutouhiroshi.qiitaclient.dagger.DaggerAppComponent


class QiitaClientApp : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}