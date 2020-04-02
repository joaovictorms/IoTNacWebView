package com.example.webviewnac;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class RespostaMl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respostaml);

        WebView webviewMl = findViewById(R.id.webviewMl);
        webviewMl.setWebViewClient(new WebViewClient());

        webviewMl.getSettings().setJavaScriptEnabled(true);
        webviewMl.loadUrl("https://www.mercadolivre.com.br/");

    }

}
