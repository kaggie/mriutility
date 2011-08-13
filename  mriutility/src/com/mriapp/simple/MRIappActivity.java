package com.mriapp.simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MRIappActivity extends Activity {
    /** Called when the activity is first created. */
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        

        
        final Button sim = (Button) findViewById(R.id.sim);
        final Button signal = (Button) findViewById(R.id.signal);
        final Button coils = (Button) findViewById(R.id.coils);
        final Button refs = (Button) findViewById(R.id.refs);
        
  

        

        
        sim.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(MRIappActivity.this, simulation.class);
				MRIappActivity.this.startActivity(myIntent);
				}});
        
        signal.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(MRIappActivity.this, signalcalculator.class);
				MRIappActivity.this.startActivity(myIntent);
				}});
        
        coils.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(MRIappActivity.this, coilcalculator.class);
				MRIappActivity.this.startActivity(myIntent);
				}});
        
        refs.setOnClickListener(new View.OnClickListener() {
			@Override
			 public void onClick(View v) {
				Intent myIntent = new Intent(MRIappActivity.this, reference.class);
				MRIappActivity.this.startActivity(myIntent);
				}});
        
        
    }
    
    
    public void toasty(String toastmessage){
        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
    }
}