package com.example.saher.fragment;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by saher on 1/31/2016.
 */
public class Fragment extends android.support.v4.app.Fragment {

    static Fragment fragment;
    LinearLayout linearLayout;
    MainActivity mainActivity;
    BitmapDrawable bt1,bt2;
    Bitmap [] imgs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = new MainActivity();
    }

    public static Fragment newInstance() {
        fragment = new Fragment();
        return fragment;
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment,container,false);
        splitBitmap();

        linearLayout = (LinearLayout) view.findViewById(R.id.container);
        linearLayout.setBackground(bt1);
        TextView tv = (TextView) view.findViewById(R.id.tv_name);
        tv.setText("saher");
        tv.setTextSize(26);
        tv.setTypeface(Typeface.SANS_SERIF);
        return view;
    }
    public void splitBitmap() {
        Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.fg);
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(image, 240, 240, true);
        imgs = new Bitmap[2];

        imgs[0] = Bitmap.createBitmap(scaledBitmap, 0, 0, scaledBitmap.getWidth()/2, scaledBitmap.getHeight());
        imgs[1] = Bitmap.createBitmap(scaledBitmap, scaledBitmap.getWidth()/2, 0, scaledBitmap.getWidth()/2, scaledBitmap.getHeight());


         bt1 = new BitmapDrawable(getResources(), imgs[0]);
         bt2 = new BitmapDrawable(getResources(), imgs[1]);
    }

}
