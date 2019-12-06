package test.example.recrutement.recrutement;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class AcceuilActivity extends AppCompatActivity {

    Button chercher , filtrer ;

    RelativeLayout r2 ;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            r2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        getSupportActionBar().hide();
        r2 = (RelativeLayout) findViewById(R.id.rellay2);

        handler.postDelayed(runnable , 3500);

        chercher = (Button) findViewById(R.id.ChercherBtn);
        filtrer = (Button) findViewById(R.id.filtrerBtn);

        chercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AcceuilActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });

        filtrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AcceuilActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });

    }


}
