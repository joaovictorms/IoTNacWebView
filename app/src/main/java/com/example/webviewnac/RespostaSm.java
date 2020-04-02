package com.example.webviewnac;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class RespostaSm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respostasm);

        WebView webviewSm = findViewById(R.id.webviewSm);
        webviewSm.setWebViewClient(new WebViewClient());

        webviewSm.getSettings().setJavaScriptEnabled(true);
        webviewSm.loadUrl("https://www.submarino.com.br/");

    }

}
