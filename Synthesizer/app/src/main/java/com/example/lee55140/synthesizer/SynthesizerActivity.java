package com.example.hack.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button mEButton;
    private Button mFButton;
    private Button mGButton;
    private Button mGSButton;
    private Button mHEButton;
    private Button mHFButton;
    private Button mHGButton;
    private Button mAButton;
    private Button mBButton;
    private Button mCButton;
    private Button mCSButton;
    private Button mDButton;
    private Button mDSButton;
    private Button mFSButton;
    private Button mHFSButton;
    private Button mChallenge5;
    private Button mChallenge9;
    private Button mChallenge10;
    private Button mChallenge12;

    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpG;
    private MediaPlayer mpGS;
    private MediaPlayer mpHE;
    private MediaPlayer mpHF;
    private MediaPlayer mpHG;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpCS;
    private MediaPlayer mpD;
    private MediaPlayer mpDS;
    private MediaPlayer mpFS;
    private MediaPlayer mpHFS;

    private final int WHOLE_NOTE = 1000;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        mEButton = (Button) findViewById(R.id.button1);
        mFButton = (Button) findViewById(R.id.button2);
        mGButton = (Button) findViewById(R.id.button3);
        mGSButton = (Button) findViewById(R.id.button4);
        mHEButton = (Button) findViewById(R.id.button5);
        mHFButton = (Button) findViewById(R.id.button6);
        mHGButton = (Button) findViewById(R.id.button7);
        mAButton = (Button) findViewById(R.id.button8);
        mBButton = (Button) findViewById(R.id.button9);
        mCButton = (Button) findViewById(R.id.button10);
        mCSButton = (Button) findViewById(R.id.button11);
        mDButton = (Button) findViewById(R.id.button12);
        mDSButton = (Button) findViewById(R.id.button13);
        mFSButton = (Button) findViewById(R.id.button14);
        mHFSButton = (Button) findViewById(R.id.button15);
        mChallenge5 = (Button) findViewById(R.id.button16);
        mChallenge9 = (Button) findViewById(R.id.button17);
        mChallenge10 = (Button) findViewById(R.id.button18);
        mChallenge12 = (Button) findViewById(R.id.button19);

        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGS = MediaPlayer.create(this, R.raw.scalegs);
        mpHE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHG = MediaPlayer.create(this, R.raw.scalehighg);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDS = MediaPlayer.create(this, R.raw.scaleds);
        mpFS = MediaPlayer.create(this, R.raw.scalefs);
        mpHFS = MediaPlayer.create(this, R.raw.scalehighfs);
    }


    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }

    public void onButton1Click(View view) {
        mpE.seekTo(0);
        Log.e("SynthesizerActivity", "Button 1 Clicked");
        mpE.start();
    }

    public void onButton2Click(View view) {
        mpF.seekTo(0);
        Log.e("SynthesizerActivity", "Button 2 Clicked");
        mpF.start();
    }

    public void onButton3Click(View view) {
        mpG.seekTo(0);
        Log.e("SynthesizerActivity", "Button 3 Clicked");
        mpG.start();
    }

    public void onButton4Click(View view) {
        mpGS.seekTo(0);
        Log.e("SynthesizerActivity", "Button 4 Clicked");
        mpGS.start();
    }

    public void onButton5Click(View view) {
        mpHE.seekTo(0);
        Log.e("SynthesizerActivity", "Button 5 Clicked");
        mpHE.start();
    }

    public void onButton6Click(View view) {
        mpHF.seekTo(0);
        Log.e("SynthesizerActivity", "Button 6 Clicked");
        mpHF.start();
    }

    public void onButton7Click(View view) {
        mpHG.seekTo(0);
        Log.e("SynthesizerActivity", "Button 7 Clicked");
        mpHG.start();
    }

    public void onButton8Click(View view) {
        mpA.seekTo(0);
        Log.e("SynthesizerActivity", "Button 8 Clicked");
        mpA.start();
    }

    public void onButton9Click(View view) {
        mpB.seekTo(0);
        Log.e("SynthesizerActivity", "Button 9 Clicked");
        mpB.start();
    }

    public void onButton10Click(View view) {
        mpC.seekTo(0);
        Log.e("SynthesizerActivity", "Button 10 Clicked");
        mpC.start();
    }

    public void onButton11Click(View view) {
        mpCS.seekTo(0);
        Log.e("SynthesizerActivity", "Button 11 Clicked");
        mpCS.start();
    }

    public void onButton12Click(View view) {
        mpD.seekTo(0);
        Log.e("SynthesizerActivity", "Button 12 Clicked");
        mpD.start();
    }

    public void onButton13Click(View view) {
        mpDS.seekTo(0);
        Log.e("SynthesizerActivity", "Button 13 Clicked");
        mpDS.start();
    }

    public void onButton14Click(View view) {
        mpFS.seekTo(0);
        Log.e("SynthesizerActivity", "Button 14 Clicked");
        mpFS.start();
    }

    public void onButton15Click(View view) {
        mpHFS.seekTo(0);
        Log.e("SynthesizerActivity", "Button 15 Clicked");
        mpHFS.start();
    }


    public void onButton16Click(View view) {
        Log.e("SynthesizerActivity", "Challenge Twinkle Twinkle Little Star");
        try {
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpHFS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHFS.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpHFS.start();

            delayPlaying(WHOLE_NOTE);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.pause();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void onButton17Click(View view) {
        Log.e("SynthesizerActivity", "Challenge Twinkle Twinkle Little Star Line 2");
        try {
            //cameron's code start
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpHFS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHFS.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpHFS.start();

            delayPlaying(WHOLE_NOTE);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.pause();
            //cameron's code end


            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.pause();

            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.pause();

            //cameron code start
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpHFS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHFS.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpHFS.start();

            delayPlaying(WHOLE_NOTE);
            mpHE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpHE.pause();

            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.pause();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();

            delayPlaying(WHOLE_NOTE / 2);
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.pause();
            //cameron code stop

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onButton18Click(View view) {
        Log.e("SynthesizerActivity", "Challenge 10 Button clicked");
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpFS.start();
            delayPlaying(WHOLE_NOTE);
            mpG.start();
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpCS.start();
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpE.start();
            delayPlaying(WHOLE_NOTE);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onButton19Click(View view) {
        Log.e("SynthesizerActivity", "challenge 12 clicked");
        try {
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpF.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpDS.start();
            delayPlaying(WHOLE_NOTE);
            mpDS.start();
            delayPlaying(WHOLE_NOTE);
            mpC.start();
            delayPlaying(WHOLE_NOTE);
            mpC.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpC.start();
            delayPlaying(WHOLE_NOTE);
            mpDS.start();
            delayPlaying(WHOLE_NOTE);
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpF.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpG.start();
            delayPlaying(WHOLE_NOTE);
            mpCS.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpC.start();
            delayPlaying(WHOLE_NOTE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
