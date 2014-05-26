package com.academicode.ourfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.tutorial.ourfirstapp.R;

/**
 * This is the first Activity the user sees when activating the application.
 * 
 * @author Marc J. McDougall
 */
public class Main extends Activity {

	private Button next;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
		
		next = (Button) findViewById(R.id.button1);
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO: This will be completed in a future lesson!
			}
		});
	}
}
