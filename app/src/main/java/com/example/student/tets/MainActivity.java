package com.example.student.tets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.txt1);
        tv2 = findViewById(R.id.txt2);
        tv1 .setText(R.string.msg4);
        tv2.setText(R.string.msg1);
        Log.i("lifecycle", "Inside OnCreate Method");
    }
    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        Log.i("lifecycle", "Inside On Resume Method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifecycle", "Inside On Restart Method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycle", "Inside On Pause Method");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle", "Inside On Stop Method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycle", "Inside On Destroy Method");
    }
}

