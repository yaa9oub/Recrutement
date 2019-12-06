package test.example.recrutement.recrutement;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipePlaceHolderView;

public class MainActivity extends AppCompatActivity {

    private SwipePlaceHolderView mSwipeView;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();
        mSwipeView = (SwipePlaceHolderView)findViewById(R.id.swipeView);
        mContext = getApplicationContext();

        int bottomMargin = Utils.dpToPx(160);
        Point windowSize = Utils.getDisplaySize(getWindowManager());
        mSwipeView.getBuilder()
                .setDisplayViewCount(3)
                .setIsUndoEnabled(true)
                .setHeightSwipeDistFactor(10)
                .setWidthSwipeDistFactor(5)
                .setSwipeDecor(new SwipeDecor()
                        .setViewWidth(windowSize.x)
                        .setViewHeight(windowSize.y - bottomMargin)
                        .setViewGravity(Gravity.TOP)
                        .setPaddingTop(20)
                        .setRelativeScale(0.01f)
                        .setSwipeMaxChangeAngle(2f)
                .setSwipeInMsgLayoutId(R.layout.tinder_swipe_in_msg_view)
                .setSwipeOutMsgLayoutId(R.layout.tinder_swipe_out_msg_view));

        Poste p1 = new Poste(getString(R.string.nom1),getString(R.string.contexte1).substring(0,100)+"..",getString(R.string.mission1).substring(0,100)+"..",getString(R.string.profil1).substring(0,150)+"..","http://pngtransparent.com/images/database-png-256x256_34744bb3.png",
                "http://www.requitix.io/mypics/max/46/466123_office-icon-png.png","https://freepngimg.com/thumb/logo/69456-linux-scalable-vector-graphics-logo-distribution-icon.png");
        mSwipeView.addView(new PosteCard(mContext, p1 , mSwipeView));

        Poste p2 = new Poste(getString(R.string.nom2),getString(R.string.contexte2),getString(R.string.mission2).substring(0,100)+"..",getString(R.string.profil2).substring(0,100)+"..","https://lemacksmedia.com/wp-content/uploads/2018/08/lockup_cloud_main.png",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Power_bi_logo_black.svg/1200px-Power_bi_logo_black.svg.png",
                "https://www.acssi.fr/wp-content/uploads/2018/08/stambia.png");
        mSwipeView.addView(new PosteCard(mContext, p2 , mSwipeView));

        Poste p3 = new Poste(getString(R.string.nom3),getString(R.string.contexte3).substring(0,100)+"..",getString(R.string.mission3).substring(0,100)+"..",getString(R.string.profil3).substring(0,100)+"..","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Python-logo-notext.svg/2000px-Python-logo-notext.svg.png",
                "https://upload.wikimedia.org/wikipedia/commons/c/c1/Rlogo.png","https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Google-BigQuery-Logo.svg/1200px-Google-BigQuery-Logo.svg.png");
        mSwipeView.addView(new PosteCard(mContext, p3 , mSwipeView));

        Poste p4 = new Poste(getString(R.string.nom4),getString(R.string.contexte4)+"..",getString(R.string.mission4).substring(0,100)+"..",getString(R.string.profil4).substring(0,100)+"..","https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Kotlin-logo.svg/1024px-Kotlin-logo.svg.png",
                "https://www.stickpng.com/assets/images/5847ea22cef1014c0b5e4833.png","https://img.pngio.com/c-letter-origami-isotype-transparent-png-c-png-512_512.png");
        mSwipeView.addView(new PosteCard(mContext, p4 , mSwipeView));


        findViewById(R.id.rejectBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSwipeView.doSwipe(false);
            }
        });

        findViewById(R.id.acceptBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSwipeView.doSwipe(true);
            }
        });

        findViewById(R.id.undoBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSwipeView.undoLastSwipe();
            }
        });

        findViewById(R.id.cardView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AfficherActivity.class);
                startActivity(intent);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_edit:
                /* DO EDIT */
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
