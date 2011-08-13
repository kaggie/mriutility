package com.mriapp.simple;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sigsnr extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.varaboutab);
    
        

        final EditText varb = (EditText) findViewById(R.id.varb);
        final EditText vara = (EditText) findViewById(R.id.vara);
        final EditText outa = (EditText) findViewById(R.id.outa);
        final EditText outb = (EditText) findViewById(R.id.outb);

        final Button solve = (Button) findViewById(R.id.solve);
        
        
        final TextView varatext = (TextView) findViewById(R.id.varatext);
        final TextView varbtext = (TextView) findViewById(R.id.varbtext);
        final TextView outbtext = (TextView) findViewById(R.id.outbtext);
        final TextView outatext = (TextView) findViewById(R.id.outatext);

        
        varatext.setText("Signal");
        vara.setHint("signal");
        varbtext.setText("Noise");
        varb.setHint("noise");
        outatext.setText("SNR (S/N)");
        outa.setHint("snr");

        
        outb.setVisibility(View.GONE);
        outbtext.setVisibility(View.GONE);
        
        
        solve.setOnClickListener(new View.OnClickListener() {
			
			@Override
			 public void onClick(View v) {
				
				double varB = new Double(0);
				double varA = new Double(0);
				double outA = new Double(0);

				if(varb.getText().length()>0)
				varB = new Double(varb.getText().toString());
				if(vara.getText().length()>0){
					varA = new Double(vara.getText().toString());}
				
				outA = varA/varB;
				
				outa.setText(String.valueOf(outA));

			
			}});
        
        
        
        varb.setOnKeyListener(new View.OnKeyListener() {

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				double varB = new Double(0);
				double varA = new Double(0);
				double outA = new Double(0);

				if(varb.getText().length()>0)
				varB = new Double(varb.getText().toString());
				if(vara.getText().length()>0){
					varA = new Double(vara.getText().toString());}
				
				outA = varA/varB;
				
				outa.setText(String.valueOf(outA));
				
return false;		        
			}});
			
        	
        
        
        
    }
    
    public void toasty(String toastmessage){
        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
    	
    }}
