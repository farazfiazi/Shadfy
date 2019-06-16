package set.fabsolutions.shadfy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.style.DoubleBounce;

public class Splash extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);




        progressBar = findViewById(R.id.spinKitView);

        DoubleBounce db = new DoubleBounce();

        progressBar.setIndeterminateDrawable(db);


        Thread thread = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(3000);

                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(Splash.this, Home.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
    }
}
