package com.example.nac2emr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class magazineActivity extends AppCompatActivity {
    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magazine);
        mywebView = (WebView) findViewById(R.id.webview2);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("http://www.magazineluiza.com.br");
        mywebView.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed(){
        if (mywebView.canGoBack()){
            mywebView.goBack();
        }else{

        }
    } public void startmainActivity(View view) {
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }
}
