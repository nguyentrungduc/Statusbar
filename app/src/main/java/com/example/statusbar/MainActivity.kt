package com.example.statusbar

import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }

    }

    fun ResolveTransparentStatusBarFlag(): Int {
        val libs = packageManager.systemSharedLibraryNames
        var reflect: String? = null

        if (libs == null)
            return 0

        for (lib in libs) {
            if (lib == "touchwiz")
                reflect = "SYSTEM_UI_FLAG_TRANSPARENT_BACKGROUND"
            else if (lib.startsWith("com.sonyericsson.navigationbar"))
                reflect = "SYSTEM_UI_FLAG_TRANSPARENT"
        }

        if (reflect == null)
            return 0

        try {
            val field = View::class.java!!.getField(reflect)
            if (field.getType() === Integer.TYPE)
                return field.getInt(null)
        } catch (e: Exception) {
        }

        return 0
    }

    fun ApplyTransparentStatusBar() {
        val window = window
        if (window != null) {
            val decor = window.decorView
            if (decor != null)
                decor.systemUiVisibility = ResolveTransparentStatusBarFlag()
        }
    }
}
