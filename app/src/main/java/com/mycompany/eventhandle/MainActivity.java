package com.mycompany.eventhandle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    Button show,hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView)findViewById(R.id.image);
        show = (Button)findViewById(R.id.show);
        hide = (Button)findViewById(R.id.hide);




    }

    public void view1(View view) {
        image.setVisibility(View.INVISIBLE);
    }


    public void view2(View view) {
        image.setVisibility(View.VISIBLE);
    }
}
