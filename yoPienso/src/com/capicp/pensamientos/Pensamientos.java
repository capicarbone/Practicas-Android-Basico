package com.capicp.pensamientos;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pensamientos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pensamientos);
		
		ListView lista_vista = (ListView) findViewById(R.id.lista_pensamientos);
		
		String[] columnas = new String[2];
		columnas[0] = "pensamiento";
		columnas[1] = "autor";
		
		ArrayList<String> lista = new ArrayList<String>();		
		
		SQLHelper helper = new SQLHelper(this);
		SQLiteDatabase bd = helper.getReadableDatabase();
		
		Cursor c = bd.query(false, "pensamientos", columnas, null, null, null, null, null, null);		
		c.moveToFirst();
		
		while(!c.isLast()){			
			lista.add(c.getString(0));
			c.moveToNext();
		}
		
		bd.close();
		
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
		
		
		lista_vista.setAdapter(adaptador);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pensamientos, menu);
		return true;
	}

}
