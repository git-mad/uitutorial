package com.example.listviewexample;

import com.example.listviewexample.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        final Button locationListbutton = (Button) findViewById(R.id.listExampleButton);
        locationListbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
        		Log.d("Demo", "Location list button pressed");		
            	Intent i = new Intent(MainActivity.this, ListExampleActivity.class); //private intent
            	MainActivity.this.startActivity(i);
            }
        });
        
        final Button gridViewButton = (Button) findViewById(R.id.gridViewButton);
        gridViewButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
        		Log.d("Demo", "GridView button pressed");		
            	Intent i = new Intent(MainActivity.this, GridViewActivity.class); //private intent
            	MainActivity.this.startActivity(i);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
