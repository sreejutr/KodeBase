package com.example.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GetName extends Activity  {

	Button button2;
	TextView txtView;
	//EditText editText;
	
		
		public  void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				
				this.setContentView(R.layout.second_page);
				System.out.println("in GetName");
				/*
				this.setContentView(R.layout.activity_lab1);
				//button2 = (Button) findViewById(R.id.button2); 
				System.out.println("in GetName");
				txtView = (TextView) findViewById(R.id.txtView1); 
				String st = txtView.toString();
				System.out.println(st);
				*/
				txtView = (TextView) findViewById(R.id.textView1);
				Bundle extras = getIntent().getExtras();
				String actualtxt = txtView.getText().toString();
				if (extras != null)
				{
					String s = extras.getString("txtValue");
					s = actualtxt + s;
					System.out.println("Ready to setText.."+ s);
					txtView.setText(new String(s));
					
				} 
		}
}
