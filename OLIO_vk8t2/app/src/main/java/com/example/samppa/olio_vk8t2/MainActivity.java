package com.example.samppa.olio_vk8t2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    BottleDispenser bottleDispenser = BottleDispenser.getInstance();
    TextView text;
    double finalValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addCash (View v) {
        text = (TextView) findViewById(R.id.textView);
        bottleDispenser.addMoney(text);

        SeekBar simpleSeekBar = (SeekBar)findViewById(R.id.seekBar); // initiate the Seek bar
        double seekBarValue = simpleSeekBar.getProgress(); // get progress value from the Seek bar

        finalValue = finalValue + (seekBarValue/2);

        simpleSeekBar.setProgress(0);

        //System.out.println(seekBarValue);
        //System.out.println(finalValue);
    }

    public void buy (View v) {
        text = (TextView) findViewById(R.id.textView);
        bottleDispenser.buyBottle(text, finalValue);
    }

    public void cashOut (View v) {
        text = (TextView) findViewById(R.id.textView);
        bottleDispenser.returnMoney(text);
        finalValue = 0;
        //System.out.println(finalValue);
    }
}
