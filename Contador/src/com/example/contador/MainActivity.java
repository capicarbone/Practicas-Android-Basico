package com.example.contador;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void contar_derecho(View vista){
		
		TextView numero = (TextView) findViewById(R.id.texo_derecha);
		
		int cuenta = Integer.parseInt(numero.getText().toString());
		
		cuenta++;		
		
		numero.setText(Integer.toString(cuenta));
			
	}
	
	public void contar_izquierdo(View vista){
		
		TextView numero = (TextView) findViewById(R.id.texto_izquierda);
		
		int cuenta = Integer.parseInt(numero.getText().toString());
		
		cuenta++;
		
		numero.setText(Integer.toString(cuenta));
		
	
	}

}
