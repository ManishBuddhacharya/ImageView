package com.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioButton rdbKaori, rdbKotaro, rdbShiro;
    private ImageView imgShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdbKaori = findViewById(R.id.rdbKaori);
        rdbKotaro = findViewById(R.id.rdbKotaro);
        rdbShiro= findViewById(R.id.rdbShiro);
        imgShow = findViewById(R.id.imgShow);
        rdbShiro.setOnClickListener(this);
        rdbKotaro.setOnClickListener(this);
        rdbKaori.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.rdbKaori:
//                Toast obj = Toast.makeText(this, "Kaori Chan", Toast.LENGTH_LONG);
//                obj.show();
                imgShow.setImageResource(R.drawable.april);
                break;

                case R.id.rdbKotaro:
//                    Toast toast = Toast.makeText(this, "Kotaro Kun", Toast.LENGTH_LONG);
//                    toast.show();
                    imgShow.setImageResource(R.drawable.april1);
                break;

                case R.id.rdbShiro:
//                    Toast objs = Toast.makeText(this, "Shiro Chan", Toast.LENGTH_LONG);
//                    objs.show();
                    imgShow.setImageResource(R.drawable.april2);
                break;
        }
    }
}
