package com.mriapp.simple;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class simulation extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simulation);
        

        final TextView refstuff = (TextView) findViewById(R.id.refstuff);
        
        refstuff.setText("Not quite done yet..");
        
        
    }
    
    public void toasty(String toastmessage){
        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
    	
    }
}