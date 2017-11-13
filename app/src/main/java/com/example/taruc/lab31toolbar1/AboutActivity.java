package com.example.taruc.lab31toolbar1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {
    WebView webViewAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_about);

        //webViewAbout = (WebView)findViewById(R.id.webViewAbout);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.google.com");
        ///Uri uri = Uri.parse("");
    }
}
