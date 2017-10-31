package com.example.lee55140.synthesizer;

        import android.media.MediaPlayer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpCS;
    private MediaPlayer mpD;
    private MediaPlayer mpDS;
    private MediaPlayer mpFS;
    private MediaPlayer mpG;
    private MediaPlayer mpGS;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighF;
    private MediaPlayer mpHighFS;
    private MediaPlayer mpHighG;
    private MediaPlayer twinkle;


    private final int WHOLE_NOTE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button) findViewById(R.id.eButton);
        button2 = (Button) findViewById(R.id.fButton);
        button3 = (Button) findViewById(R.id.aButton);
        button4 = (Button) findViewById(R.id.bButton);
        button5 = (Button) findViewById(R.id.bbButton);
        button6 = (Button) findViewById(R.id.cButton);
        button7 = (Button) findViewById(R.id.csButton);
        button8 = (Button) findViewById(R.id.dButton);
        button9 = (Button) findViewById(R.id.dsButton);
        button10 = (Button) findViewById(R.id.fsButton);
        button11 = (Button) findViewById(R.id.gButton);
        button12 = (Button) findViewById(R.id.gsButton);
        button13 = (Button) findViewById(R.id.higheButton);
        button14 = (Button) findViewById(R.id.highfButton);
        button15 = (Button) findViewById(R.id.highfsButton);
        button16 = (Button) findViewById(R.id.highgButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDS = MediaPlayer.create(this, R.raw.scaleds);
        mpFS = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGS = MediaPlayer.create(this, R.raw.scalegs);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighG = MediaPlayer.create(this, R.raw.scalehighg);


    }


    private void delayPlaying(int delay) throws InterruptedException{
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.i(TAG,"Button 1 Clicked");
        mpE.start();

    }
    public void onButton2Click(View v) {
        mpF.seekTo(0);
        Log.i(TAG,"Button 2 Clicked");
        mpF.start();

    }
    public void onButton3Click(View v) {
        mpA.seekTo(0);
        Log.i(TAG,"Button 3 Clicked");
        mpA.start();

    }
    public void onButton4Click(View v) {
        mpB.seekTo(0);
        Log.i(TAG,"Button 4 Clicked");
        mpB.start();

    }
    public void onButton5Click(View v) {
        mpBB.seekTo(0);
        Log.i(TAG,"Button 5 Clicked");
        mpBB.start();

    }
    public void onButton6Click(View v) {
        mpC.seekTo(0);
        Log.i(TAG,"Button 6 Clicked");
        mpC.start();

    }
    public void onButton7Click(View v) {
        mpCS.seekTo(0);
        Log.i(TAG,"Button 7 Clicked");
        mpCS.start();

    }
    public void onButton8Click(View v) {
        mpD.seekTo(0);
        Log.i(TAG,"Button 8 Clicked");
        mpD.start();

    }
    public void onButton9Click(View v) {
        mpDS.seekTo(0);
        Log.i(TAG,"Button 9 Clicked");
        mpDS.start();

    }
    public void onButton10Click(View v) {
        mpFS.seekTo(0);
        Log.i(TAG,"Button 10 Clicked");
        mpFS.start();

    }
    public void onButton11Click(View v) {
        mpG.seekTo(0);
        Log.i(TAG,"Button 11 Clicked");
        mpG.start();

    }
    public void onButton12Click(View v) {
        mpGS.seekTo(0);
        Log.i(TAG,"Button 12 Clicked");
        mpGS.start();

    }
    public void onButton13Click(View v) {
        mpHighE.seekTo(0);
        Log.i(TAG,"Button 13 Clicked");
        mpHighE.start();

    }
    public void onButton14Click(View v) {
        mpHighF.seekTo(0);
        Log.i(TAG,"Button 14 Clicked");
        mpHighF.start();

    }
    public void onButton15Click(View v) {
        mpHighFS.seekTo(0);
        Log.i(TAG,"Button 15 Clicked");
        mpHighFS.start();

    }
    public void onButton16Click(View v) {
        mpHighG.seekTo(0);
        Log.i(TAG,"Button 16 Clicked");
        mpHighG.start();

    }
    public void onButton17Click(View v) {

        Log.i(TAG,"Button 17 Clicked");



    }
}

