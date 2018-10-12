package com.example.kasun.ulegal;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private WebView my_web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_web_view = (WebView) findViewById(R.id.my_web_view);
        WebSettings webSettings = my_web_view.getSettings();
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        my_web_view.setWebViewClient(new WebViewClient());

        /*
        my_web_view.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                ProgressBar progressBar= new ProgressBar();
                progressBar.setProgress(newProgress);
            }

            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                getSupportActionBar().setTitle(title);
            }

            @Override
            public void onReceivedIcon(WebView view, Bitmap icon) {
                super.onReceivedIcon(view, icon);
                ImageView imageView = new ImageView();
                imageView.setImageBitmap(icon);
            }
        });
        */

        my_web_view.loadUrl("https://mobile.ulegal.lk");
    }

    /*@Override
    public void onBackPressed(){
        if(my_web_view.canGoBack()){
            my_web_view.goBack();
        }else{
            super.onBackPressed();
        }
    }*/
}
