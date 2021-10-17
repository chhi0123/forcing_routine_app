package com.oldolgol.android.forcing_routine_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.oldolgol.android.forcing_routine_app.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()

            var webView = WebView(this)
            setContentView(webView)
            webView.settings.javaScriptEnabled = true
            webView.webViewClient = WebViewClient()
            webView.webChromeClient = WebChromeClient()
            webView.loadUrl("http://ec2-13-59-141-198.us-east-2.compute.amazonaws.com/#/")
        }
    }
}