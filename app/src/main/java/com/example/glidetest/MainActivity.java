package com.example.glidetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.glidetest.utils.GlideImgManager;
import com.example.glidetest.utils.GlideRoundTransform;

public class MainActivity extends AppCompatActivity {


    private ImageView iv_main00,iv_main01,iv_main02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_main00 = (ImageView) findViewById(R.id.iv_main00);
        iv_main01 = (ImageView) findViewById(R.id.iv_main01);
        iv_main02 = (ImageView) findViewById(R.id.iv_main02);

        String url = "http://p1.image.hiapk.com/uploads/allimg/150331/7730-150331100136-53.jpg";

        GlideImgManager.glideLoader(this, url, R.mipmap.ic_launcher, R.mipmap.ic_launcher, iv_main00);
        GlideImgManager.glideLoader(this, url, R.mipmap.ic_launcher, iv_main01, 0);
        Glide.with(this).load(url).diskCacheStrategy(DiskCacheStrategy.ALL)
                .transform(new GlideRoundTransform(this,10)).into(iv_main02);


    }
}
