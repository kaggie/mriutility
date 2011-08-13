package com.mriapp.simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class coilcalculator extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coilcalculator);
        

        final Button coilc_cl = (Button) findViewById(R.id.coilc_cl);
        final Button coilc_lc = (Button) findViewById(R.id.coilc_lc);
        final Button coilc_newc = (Button) findViewById(R.id.coilc_newc);
        final Button coilc_z0 = (Button) findViewById(R.id.coilc_z0);
        final Button coilc_phaseshifter = (Button) findViewById(R.id.coilc_phaseshifter);
        
  

        coilc_cl.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(coilcalculator.this, coilc_cl.class);
				coilcalculator.this.startActivity(myIntent);
				}});
        
        coilc_lc.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(coilcalculator.this, coilc_lc.class);
				coilcalculator.this.startActivity(myIntent);
				}});
        
        coilc_newc.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(coilcalculator.this, coilc_newc.class);
				coilcalculator.this.startActivity(myIntent);
				}});
        
        coilc_z0.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(coilcalculator.this,coilc_z0.class);
				coilcalculator.this.startActivity(myIntent);
				}});
        
        coilc_phaseshifter.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(coilcalculator.this,coilc_phaseshifter.class);
				coilcalculator.this.startActivity(myIntent);
				}});
        
        
        
    }
    
    public void toasty(String toastmessage){
        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
    	
    }
}