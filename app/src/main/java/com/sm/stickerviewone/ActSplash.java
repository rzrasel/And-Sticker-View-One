package com.sm.stickerviewone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class ActSplash extends AppCompatActivity {
    private ImageView sysIvBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);

        sysIvBackground = (ImageView) findViewById(R.id.sysIvBackground);

        FrameLayout canvas = (FrameLayout) findViewById(R.id.vg_canvas);

        // add a stickerImage to canvas
        StickerImageView iv_sticker = new StickerImageView(getApplicationContext());
        iv_sticker.setImageDrawable(((ImageView) sysIvBackground.findViewById(R.id.sysIvBackground)).getDrawable());
        canvas.addView(iv_sticker);

        // add a stickerText to canvas
        StickerTextView tv_sticker = new StickerTextView(getApplicationContext());
        tv_sticker.setText("call me baby");
        canvas.addView(tv_sticker);
    }
}