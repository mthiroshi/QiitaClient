package com.example.mutouhiroshi.qiitaclient.dagger

import com.example.mutouhiroshi.qiitaclient.MainActivity
import dagger.Component
import javax.inject.Singleton


@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}