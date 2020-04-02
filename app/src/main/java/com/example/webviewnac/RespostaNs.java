package com.example.webviewnac;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class RespostaNs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respostans);

        WebView webviewNs = findViewById(R.id.webviewNs);
        webviewNs.setWebViewClient(new WebViewClient());

        webviewNs.getSettings().setJavaScriptEnabled(true);
        webviewNs.loadUrl("https://www.netshoes.com.br/");

    }

}
