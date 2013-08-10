package com.cpinelly.saludame;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.activity_main);
	}
	
	
	public void saludar(View vista){
		
		EditText editor;
		
		editor = (EditText) findViewById(R.id.entrada);
		
		String nombre = editor.getText().toString();
		
		TextView texto = (TextView) findViewById(R.id.texto);
		
		
		texto.setText("Hola, " + nombre);
		
	}


}
