package com.example.glidetest.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by zhangl on 2017/6/5.
 */

public class GlideImgManager {

    /**
     * load normal  for img
     *
     * @param url
     * @param erroImg
     * @param emptyImg
     * @param iv
     */
    public static void glideLoader(Context context, String url, int erroImg, int emptyImg, ImageView iv) {
        //原生 API
        Glide.with(context).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL).placeholder(emptyImg).error(erroImg).into(iv);
    }
    /**
     * load normal  for  circle or round img
     *
     * @param url
     * @param erroImg
     * @para
     * @param iv
     * @param tag
     */
    public static void glideLoader(Context context, String url, int erroImg, ImageView iv, int tag) {
        if (0 == tag) {
            Glide.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.ALL)
                    .error(erroImg).transform(new GlideCircleTransform(context)).into(iv);
        } else if (1 == tag) {
            Glide.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.ALL)
                    .error(erroImg).transform(new GlideRoundTransform(context,10)).into(iv);
        }
    }
}
