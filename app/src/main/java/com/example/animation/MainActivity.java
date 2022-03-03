package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        t1=(TextView) findViewById(R.id.t1);
    }

    public void demo1(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.blink);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
    }

    public void demo2(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.rotate);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
    }

    public void demo3(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.fade);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
    }
    public void demo4(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.moveup);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
    }

    public void demo5(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.slide);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
    }

    public void demo6(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.zoomin);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
    }

    public void demo7(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.zoomout);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
    }

    public void demo8(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.fadeout);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
    }

    public void demo9(View view) {
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.movedown);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);
    }
}