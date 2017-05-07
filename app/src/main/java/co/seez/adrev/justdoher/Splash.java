package co.seez.adrev.justdoher;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Adrev on 26-04-2017.
 */

public class Splash extends Activity {

    MediaPlayer ourSound;

    @Override
    protected void onCreate(@Nullable Bundle AndrewLovesBacon) {
        super.onCreate(AndrewLovesBacon);
        setContentView(R.layout.splash);
        ourSound = MediaPlayer.create(Splash.this, R.raw.splashsound);
        ourSound.start();
        Thread timer = new Thread()
        {
            public void run (){
                try{
                    sleep (7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    Intent openStartingPoint = new Intent("co.seez.adrev.justdoher.MENU");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSound.release();
        finish();
    }
}
