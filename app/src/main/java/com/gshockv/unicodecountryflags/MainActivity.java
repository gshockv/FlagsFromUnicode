package com.gshockv.unicodecountryflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewUsa;
    private TextView textViewItaly;
    private TextView textViewChina;

    private static final String FLAG_USA = new String(
            new int[] {0x1F1FA, 0x1F1F8}, 0, 2
    );
    private static final String FLAG_ITALY = new String(
            new int[] {0x1F1EE, 0x1F1F9}, 0, 2
    );
    private static final String FLAG_CHINA = new String(
            new int[] {0x1F1E8, 0x1F1F3}, 0, 2
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewUsa = (TextView) findViewById(R.id.txt_usa);
        textViewItaly = (TextView) findViewById(R.id.txt_italy);
        textViewChina = (TextView) findViewById(R.id.txt_china);
    }

    public void showFlags(View anchor) {
        textViewUsa.setText(Html.fromHtml("USA: " + FLAG_USA));
        textViewItaly.setText(Html.fromHtml("Italy: " + FLAG_ITALY));
        textViewChina.setText(Html.fromHtml("China: " + FLAG_CHINA));
    }
}
