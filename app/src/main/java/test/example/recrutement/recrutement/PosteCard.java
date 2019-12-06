package test.example.recrutement.recrutement;


import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.swipe.SwipeCancelState;
import com.mindorks.placeholderview.annotations.swipe.SwipeHead;
import com.mindorks.placeholderview.annotations.swipe.SwipeIn;
import com.mindorks.placeholderview.annotations.swipe.SwipeInState;
import com.mindorks.placeholderview.annotations.swipe.SwipeOut;
import com.mindorks.placeholderview.annotations.swipe.SwipeOutState;
import com.mindorks.placeholderview.annotations.swipe.SwipeView;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

@Layout(R.layout.poste_card)
public class PosteCard {

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


    private Poste mPoste;
    private Context mContext;
    private SwipePlaceHolderView mSwipeView;

    public PosteCard(Context context, Poste poste, SwipePlaceHolderView swipeView) {
        mContext = context;
        mPoste = poste;
        mSwipeView = swipeView;
    }

    @Resolve
    private void onResolved(){
        MultiTransformation multi = new MultiTransformation(
                new BlurTransformation(mContext, 30),
                new RoundedCornersTransformation(
                        mContext, Utils.dpToPx(7), 0,
                        RoundedCornersTransformation.CornerType.TOP));


        //image setting

        Glide.with(mContext).load(mPoste.getImg1())
                .bitmapTransform(multi)
                .into(img1);

        Glide.with(mContext).load(mPoste.getImg2())
                .bitmapTransform(multi)
                .into(img2);

        Glide.with(mContext).load(mPoste.getImg3())
                .bitmapTransform(multi)
                .into(img3);


        contextetxt.setText(mPoste.getContexte());
        missiontxt.setText(mPoste.getMission());
        profilecherchetxt.setText(mPoste.getProfilecherche());
        nomtxt.setText(mPoste.getNomposte());
    }

    @SwipeHead
    private void onSwipeHeadCard() {
        /*
        Glide.with(mContext).load(mProfile.getImageUrl())
                .bitmapTransform(new RoundedCornersTransformation(
                        mContext, Utils.dpToPx(7), 0,
                        RoundedCornersTransformation.CornerType.TOP))
                .into(profileImageView);
        */
        cardView.invalidate();
    }

    /*
    @Click(R.id.profileImageView)
    private void onClick(){
        Log.d("EVENT", "profileImageView click");
//        mSwipeView.addView(this);
    }
*/
    @SwipeOut
    private void onSwipedOut(){
        Log.d("EVENT", "onSwipedOut");
//        mSwipeView.addView(this);
    }

    @SwipeCancelState
    private void onSwipeCancelState(){
        Log.d("EVENT", "onSwipeCancelState");
    }

    @SwipeIn
    private void onSwipeIn(){
        Log.d("EVENT", "onSwipedIn");
    }

    @SwipeInState
    private void onSwipeInState(){
        Log.d("EVENT", "onSwipeInState");
    }

    @SwipeOutState
    private void onSwipeOutState(){
        Log.d("EVENT", "onSwipeOutState");
    }
}
