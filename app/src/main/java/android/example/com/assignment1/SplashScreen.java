package android.example.com.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progressBar = findViewById(R.id.progressbar);
        progressBar.setVisibility(View.VISIBLE);
        progressBar.getIndeterminateDrawable().setColorFilter(0xFF78909C, android.graphics.PorterDuff.Mode.MULTIPLY);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, RView.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
