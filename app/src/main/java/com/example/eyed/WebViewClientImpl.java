package com.example.eyed;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ProgressBar;


public class WebViewClientImpl extends WebViewClient {

    private Activity activity = null;
    String ShowOrHideWebViewInitialUse = "show";
    private WebView webView = null;

    public WebViewClientImpl(Activity activity) {
        this.activity = activity;
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if(url.indexOf("https://smartphone.edgeimpulse.com/classifier.html?apiKey=ei_c728c47b9eeeaf5604fb4d666a5a48e2813513647e75d9ab322fe16f867a6f92") > -1 ) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;


    }

}
