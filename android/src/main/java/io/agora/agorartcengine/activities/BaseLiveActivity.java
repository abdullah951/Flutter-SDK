package io.agora.agorartcengine.activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import io.agora.rtc.Constants;

public abstract class BaseLiveActivity extends BaseActivity {
    protected RelativeLayout videoContainer;

    protected ImageView mMuteAudioBtn;
    protected ImageView mMuteVideoBtn;

    protected boolean mIsBroadcaster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onSwitchCameraClicked(View view) {
        onSwitchCameraButtonClicked(view);
    }

    public void onBeautyClicked(View view) {

    }

    public void onMoreClicked(View view) {
        onMoreButtonClicked(view);
    }

    public void onPushStreamClicked(View view) {

    }

    public void onMuteAudioClicked(View view) {
        onMuteAudioButtonClicked(view);
    }

    public void onMuteVideoClicked(View view) {
        onMuteVideoButtonClicked(view);
    }

    protected abstract void onInitializeVideo();

    protected abstract void onLeaveButtonClicked(View view);

    protected abstract void onSwitchCameraButtonClicked(View view);

    protected abstract void onMuteAudioButtonClicked(View view);

    protected abstract void onMuteVideoButtonClicked(View view);

    protected abstract void onMoreButtonClicked(View view);
}
