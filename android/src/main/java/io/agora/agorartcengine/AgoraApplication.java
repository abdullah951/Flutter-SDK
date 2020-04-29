package io.agora.agorartcengine;

import android.app.Application;
import android.content.SharedPreferences;
import android.view.TextureView;

import io.agora.rtc.RtcEngine;

public class AgoraApplication extends Application {
    private RtcEngine mRtcEngine;

    private TextureView mLocalPreview;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        RtcEngine.destroy();
    }
}
