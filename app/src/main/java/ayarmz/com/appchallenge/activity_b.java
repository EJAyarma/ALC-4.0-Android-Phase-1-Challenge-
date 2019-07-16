package ayarmz.com.appchallenge;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_b extends AppCompatActivity {
    WebView alc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        alc = findViewById(R.id.webview_alc);
        alc.loadUrl("https://andela.com/alc/");
        alc.getSettings().setJavaScriptEnabled(true);
        alc.setWebViewClient( new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // Ignore SSL certificate errors
            }
        });
    }
}
