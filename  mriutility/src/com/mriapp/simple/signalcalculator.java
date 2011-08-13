package com.mriapp.simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signalcalculator extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signalcalculator);

        final Button sigsnr = (Button) findViewById(R.id.sigsnr);
        final Button sigt1 = (Button) findViewById(R.id.sigt1);
        final Button sigt2 = (Button) findViewById(R.id.sigt2);
        

        
        sigsnr.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(signalcalculator.this, sigsnr.class);
				signalcalculator.this.startActivity(myIntent);
				}});
        
        sigt1.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(signalcalculator.this, sigt1.class);
				signalcalculator.this.startActivity(myIntent);
				}});
        
        sigt2.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(signalcalculator.this, sigt2.class);
				signalcalculator.this.startActivity(myIntent);
				}});
        

        
        
        
    }
    
    public void toasty(String toastmessage){
        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
    	
    }
}