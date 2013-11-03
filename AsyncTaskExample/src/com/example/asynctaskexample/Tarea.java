package com.example.asynctaskexample;

import android.os.AsyncTask;
import android.widget.TextView;

public class Tarea extends AsyncTask<String, String, String>{
	
	private TextView contador;
	
	Tarea(TextView contador){
		
		this.contador = contador;
	}
		

	@Override
	protected void onPreExecute() {	
		super.onPreExecute();
	}

	@Override
	protected String doInBackground(String... arg0) {
		
		
		int i = 0;
		
		for ( ; i < 50; i++){					
			
			this.publishProgress(Integer.toString(i));
		}
					
		return "";
	}
	
	
	
	@Override
	protected void onProgressUpdate(String... valores) {
		super.onProgressUpdate(valores);
		
		contador.setText(valores[0]);
	}

	@Override
	protected void onPostExecute(String result) {		
		super.onPostExecute(result);
	}
	
	

}
