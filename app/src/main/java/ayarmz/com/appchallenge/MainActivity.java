package ayarmz.com.appchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAlc = findViewById(R.id.button_alc);
        Button buttonProfile = findViewById(R.id.button_profile);

        buttonAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityB();
            }
        });

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityC();
            }
        });
    }
    public void openActivityB(){
        Intent toActivityB = new Intent(MainActivity.this, activity_b.class);
        startActivity(toActivityB);
    }

    public void openActivityC() {
        Intent toActivityC = new Intent(MainActivity.this, activity_c.class);
        startActivity(toActivityC);
    }

}
