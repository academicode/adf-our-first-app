package com.academicode.ourfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.tutorial.ourfirstapp.R;

public class Next extends Activity {

	private Button send;
	private EditText et;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.next);
		
		et = (EditText) findViewById(R.id.editText1);
		send = (Button) findViewById(R.id.button1);
		
		send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				// TODO: This will be completed in a future lesson!
			}
		});
	}
}
