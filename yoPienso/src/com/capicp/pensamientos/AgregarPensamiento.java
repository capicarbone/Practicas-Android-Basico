package com.capicp.pensamientos;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class AgregarPensamiento extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_agregar_pensamiento);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.agregar_pensamiento, menu);
		return true;
	}
	
	public void guardar_pensamiento(View view){
		
		String pensamiento = "Esto es una prueba";
		String autor = "Carlos";
				
		SQLHelper helper = new SQLHelper(this);
		SQLiteDatabase bd = helper.getWritableDatabase();
		
		ContentValues cv = new ContentValues();
		cv.put("pensamiento", pensamiento);
		cv.put("autor", autor);
		
		bd.insert("pensamientos", null, cv);
		
		bd.close();
		
		Toast toast = Toast.makeText(this, "Saber que? Se guardó", Toast.LENGTH_SHORT);
		toast.show();
		
		finish();
		
	}

}
