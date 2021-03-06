package com.blogsetyaaji.smafuturegate;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Frag_Kontak extends Fragment {

    WebView wb;
    ProgressBar pg;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_web, null);
        wb = (WebView)v.findViewById(R.id.webView);
        pg = (ProgressBar)v.findViewById(R.id.progressBar);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());

        wb.getSettings().setDomStorageEnabled(true);
        wb.getSettings().setLoadWithOverviewMode(true);
        wb.getSettings().setUseWideViewPort(true);
        wb.getSettings().setSupportMultipleWindows(true);
        wb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wb.setHorizontalScrollBarEnabled(false);
        wb.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        wb.getSettings().setAllowFileAccessFromFileURLs(true);
        wb.getSettings().setAllowUniversalAccessFromFileURLs(true);

        wb.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                pg.setVisibility(View.VISIBLE);
                pg.setProgress(newProgress);
                if (newProgress == 100) {
                    pg.setVisibility(View.GONE);
                }
            }
        });

        pg.setVisibility(View.VISIBLE);
        wb.loadUrl("https://plus.google.com/u/0/+AjiSetya");
        return v;
    }

    @Override
    public void onPause() {
        wb.onPause();
        super.onPause();
    }
}
