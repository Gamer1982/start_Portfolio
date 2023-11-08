package bachurin1982.raidshadowlegendsmanadger.calculator_for_the_game_raid_shadow_legend;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web = findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebChromeClient(new WebChromeClient());
        web.loadUrl("file:///android_asset/www/index.html");web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setDatabaseEnabled(true);

        }


    }
