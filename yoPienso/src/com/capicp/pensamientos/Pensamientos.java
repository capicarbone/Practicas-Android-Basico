package com.capicp.pensamientos;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pensamientos extends Activity {
	
	ArrayList<String> lista = new ArrayList<String>();		

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pensamientos);
		
		ListView lista_vista = (ListView) findViewById(R.id.lista_pensamientos);
		
		String[] columnas = new String[2];
		columnas[0] = "pensamiento";
		columnas[1] = "autor";		
		
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
		
		
		
		lista_vista.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View vista, int posicion,
					long id) {
				
					Intent pensamiento_intento = new Intent( vista.getContext(), PensamientoActivity.class);
					pensamiento_intento.putExtra("pensamiento", (String) lista.get(posicion));
					startActivity(pensamiento_intento);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pensamientos, menu);
		return true;
	}

}
