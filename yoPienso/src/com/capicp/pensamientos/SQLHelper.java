package com.capicp.pensamientos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLHelper extends SQLiteOpenHelper{
	
	public static final String NOMBRE = "pensamientos.db";
	
	
	public SQLHelper(Context context) {
		super(context, NOMBRE, null, 1);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String declaracion = "CREATE TABLE pensamientos (id INTEGER PRIMARY KEY, pensamiento TEXT, autor TEXT)"; 
		db.execSQL(declaracion);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	
}
