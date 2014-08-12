package com.example.openalpr;

import com.example.testapp.R;

import android.app.Activity;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Open Alpr Version");
        NativeAlpr nativeAlpr = new NativeAlpr();
        alertDialogBuilder.setMessage(
        		String.format("Version: %s", nativeAlpr.stringFromJNI()))
        		.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						MainActivity.this.finish();
						
					}
				});
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
