package vn.edu.usth.twitterclient;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class MyTweets extends Fragment {

    public static MyTweets newInstance() {
        MyTweets fragment = new MyTweets();
        return fragment;
    }
    boolean check = false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_my_tweets, container, false);
        final Drawable d1= getResources().getDrawable(R.drawable.like);
        final Drawable d = getResources().getDrawable(R.drawable.dislike);
        final ImageView img= v.findViewById(R.id.dislike1);
        final TextView tx= v.findViewById(R.id.likee);
        tx.setText("0 like");
        img.setImageDrawable(d);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check==false){
                    check=true;
                    img.setImageDrawable(d1);
                    tx.setText("1 Like");}
                else { check=false;
                    img.setImageDrawable(d);
                    tx.setText("0 like");}
            }
        });
        return v;

    }
}
