package test.example.recrutement.recrutement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.swipe.SwipeView;

public class AfficherActivity extends AppCompatActivity {

    @SwipeView
    private android.view.View cardView;

    @View(R.id.contexteTxt)
    private TextView contextetxt;

    @View(R.id.nompostetxt)
    private TextView nomtxt;

    @View(R.id.missionTxt)
    private TextView missiontxt;

    @View(R.id.procherTxt)
    private TextView profilecherchetxt;

    @View(R.id.img1)
    private ImageView img1;

    @View(R.id.img2)
    private ImageView img2;

    @View(R.id.img3)
    private ImageView img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher);



    }
}
