package com.example.mydiary.myapplication;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Home extends Activity{
private Button connect;
private EditText ipAdress;
@Override
protected void onCreate(Bundle savedInstanceState) {

	super.onCreate(savedInstanceState);
	setContentView(R.layout.home);
	ipAdress=(EditText) findViewById(R.id.editText1);
	connect=(Button)findViewById(R.id.button1);
	connect.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			String ip=ipAdress.getText().toString();
			Client.SERVERIP=ip; // IP provided by the end user
			// To open the main Activity page once IP is provided
			Intent intent = new Intent(getBaseContext(), MainActivity.class);
			
			//Log.e("ServerIP", Client.SERVERIP);
			// To start the Activity
			startActivity(intent);
		}
	});
}


}
