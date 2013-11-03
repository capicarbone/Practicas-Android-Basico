package com.example.asynctaskexample;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.AsyncTaskLoader;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	
	

	@Override
	protected void onResume() {	
		super.onResume();
						
		TextView contador = (TextView) findViewById(R.id.contador);
		
		Tarea t = new Tarea(contador);
		t.execute("");
	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);			
				
		return true;
	}

}
