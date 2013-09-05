package com.example.lab1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Lab1Activity extends Activity {

	EditText name;
	Button button1;
	OnClickListener mListener;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.name_getter);
	
		//this.setContentView(R.layout.second_page);
		System.out.println("1.In onCreate");
		Log.i("System.out","1.In onCreate");
		
		name = (EditText) this.findViewById(R.id.editText1);
		button1 = (Button) this.findViewById(R.id.button1);
		//button1.setOnClickListener(mListener);
		System.out.println("2. after setting click listener");
		Log.i("System.out","2. after setting click listener");
		//String txtValue = "";	
		
				
		//mListener = new OnClickListener() {
/*
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				System.out.println("2. In onClick");
				Log.d("System.out","2. In onClick");
				Log.i("System.out","2.1.onClick Value" + name.getText().toString());
				switch (v.getId()) {
				case R.id.button1:
					System.out.println("In onclick switch case of Lab1Activity");
					Log.i("System.out","In onclick switch case of Lab1Activity");
					Intent i = new Intent(Lab1Activity.this, GetName.class);
					i.putExtra("txtValue", name.getText());
					startActivity(i);
					//startActivityForResult(i, 0);
					break;
				}
			}
		};
	*/
		
	}	
		public void onButton1Click(View v) {
			
			System.out.println("2. In onButton1Click");
			Log.d("System.out","2. In onButton1Click");
			Log.i("System.out","2.1.onButton1Click Value" + name.getText().toString());
			switch (v.getId()) {
			case R.id.button1:
				System.out.println("In onButton1Click switch case of Lab1Activity");
				Log.i("System.out","In onButton1Click switch case of Lab1Activity");
				Intent i = new Intent(Lab1Activity.this, GetName.class);
				i.putExtra("txtValue", name.getText().toString());
				startActivity(i);
				//startActivityForResult(i, 0);
				break;
			}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lab1, menu);
		return true;
	}

}
