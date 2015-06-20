package com.jawbone.helloup;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Tony on 2015/5/31.
 */
public class TestNewActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_time);
    }

    public void setNewTimeValue(View view){
        EditText et = (EditText)findViewById(R.id.editText);
        int time = Integer.parseInt(et.getText().toString());
    }
}


