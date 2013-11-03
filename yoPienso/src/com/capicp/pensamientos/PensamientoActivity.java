package com.capicp.pensamientos;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class PensamientoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pensamiento);
		
		Intent i = getIntent();
		
		String pesamiento = (String) i.getCharSequenceExtra("pensamiento");
		
		TextView texto = (TextView) findViewById(R.id.pensamiento);
		texto.setText(pesamiento);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pensamiento, menu);
		return true;
	}

}
