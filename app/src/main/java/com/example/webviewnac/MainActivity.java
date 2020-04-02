package com.example.webviewnac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void mlBrowser (View view){

        Intent mlIntent = new Intent(this,RespostaMl.class);
        startActivity(mlIntent);

    }

public void wmBrowser (View view2){

        Intent wmIntent = new Intent(this,RespostaWm.class);
        startActivity(wmIntent);

    }

public void nsBrowser (View view3){

        Intent nsIntent = new Intent(this,RespostaNs.class);
        startActivity(nsIntent);

}

public void smBrowser (View view4){

        Intent smIntent = new Intent(this,RespostaSm.class);
        startActivity(smIntent);

}

public void aboutMe (View view5){

        Intent amIntent = new Intent(this,RespostaAm.class);
        startActivity(amIntent);

}

}
