package com.example.valuepassing_edittext_usingintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity 
{
	TextView tv1,tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		//String receivedvalue=getIntent().getExtras().getString("Key");
		
		Intent i=getIntent();
		
		String receivedvalue1=i.getStringExtra("Key_St");
		String receivedvalue2=i.getStringExtra("Key_No");
		
		tv1.setText(receivedvalue1);
		tv2.setText(receivedvalue2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
