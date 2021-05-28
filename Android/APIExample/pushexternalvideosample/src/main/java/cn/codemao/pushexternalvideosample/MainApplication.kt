package cn.codemao.pushexternalvideosample

import android.app.Application

class MainApplication : Application() {

    private var globalSettings:GlobalSettings = GlobalSettings()
    fun getGlobalSettings(): GlobalSettings {
        return globalSettings
    }
}