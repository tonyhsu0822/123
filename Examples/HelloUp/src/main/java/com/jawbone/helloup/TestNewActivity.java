package com.jawbone.helloup;

import android.os.Bundle;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Tony on 2015/5/31.
 */
public class TestNewActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_new_activity);
        TextView tv = (TextView)findViewById(R.id.text);
        tv.setText(UpApiListActivity.str);
        //LinearLayout layout = (LinearLayout) findViewById(R.id.newActivity);
        //layout.addView(tv);
        //System.out.print(UpApiListActivity.str) ;
    }
}


