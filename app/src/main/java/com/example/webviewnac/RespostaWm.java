package com.example.webviewnac;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class RespostaWm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respostawm);

        WebView webviewWm = findViewById(R.id.webviewWm);
        webviewWm.setWebViewClient(new WebViewClient());

        webviewWm.getSettings().setJavaScriptEnabled(true);
        webviewWm.loadUrl("https://www.webmotors.com.br/");

    }

}
