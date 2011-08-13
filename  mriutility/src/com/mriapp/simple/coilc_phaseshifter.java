package com.mriapp.simple;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class coilc_phaseshifter extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.varaboutaboptab);
    
      //pi
      // Z1 = jZ0sin theta
      // Z2 = -jZ0cottheta/2
      //
      // T
      // Z1 = jZ0 tan theta/2
      // Z2 = -j Z0 /sin theta
      // 
      //Z2 is the shunt element
      


        final EditText varb = (EditText) findViewById(R.id.varb);
        final EditText vara = (EditText) findViewById(R.id.vara);
        final EditText outa = (EditText) findViewById(R.id.outa);
        final EditText outb = (EditText) findViewById(R.id.outb);
        final RadioButton radioa = (RadioButton) findViewById(R.id.radioa);
        final RadioButton radiob = (RadioButton) findViewById(R.id.radiob);

        final Button solve = (Button) findViewById(R.id.solve);
        
        
        final TextView varatext = (TextView) findViewById(R.id.varatext);
        final TextView varbtext = (TextView) findViewById(R.id.varbtext);
        final TextView outbtext = (TextView) findViewById(R.id.outbtext);
        final TextView outatext = (TextView) findViewById(R.id.outatext);

        
        varatext.setText("Phase (degrees)");
        vara.setHint("phase");
        varbtext.setText("Impedance (Z0)");
        varb.setHint("impedance");
        outatext.setText("Z1 ");
        outa.setHint("z1");
        outbtext.setText("Z2 ");
        outb.setHint("z2");
//        toasty("Currently a PI shifter... more work will be done on this.");
        
        
        
        
        solve.setOnClickListener(new View.OnClickListener() {
			
			@Override
			 public void onClick(View v) {
				
				double varB = new Double(0);
				double varA = new Double(0);
				double outA = new Double(0);
				double outB = new Double(0);

				if(varb.getText().length()>0)
				varB = new Double(varb.getText().toString());
				if(vara.getText().length()>0){
					varA = new Double(vara.getText().toString());}
				
				double theta = varA*Math.PI/180;
				
				if(radiob.isChecked()){ // T network
				outA = -varB*Math.tan(theta/2);
				outB = -varB/Math.tan(theta);}
				else{  //PI network
					outA = varB*Math.sin(theta);
					outB = varB/Math.tan(theta/2);}
				
				
				
				outa.setText("j"+String.valueOf(outA));
				outb.setText("-j"+String.valueOf(outB));
			
			}});
        
        
        
        varb.setOnKeyListener(new View.OnKeyListener() {

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				
				double varB = new Double(0);
				double varA = new Double(0);
				double outA = new Double(0);
				double outB = new Double(0);

				if(varb.getText().length()>0)
				varB = new Double(varb.getText().toString());
				if(vara.getText().length()>0){
					varA = new Double(vara.getText().toString());}
				
				double theta = varA*Math.PI/180;
				
				if(radiob.isChecked()){ // T network
				outA = -varB*Math.tan(theta/2);
				outB = -varB/Math.tan(theta);}
				else{  //PI network
					outA = varB*Math.sin(theta);
					outB = varB/Math.tan(theta/2);}
				
				outa.setText("j"+String.valueOf(outA));
				outb.setText("-j"+String.valueOf(outB));				
return false;		        
			}});
			
        	
        
        
        
    }
    
    public void toasty(String toastmessage){
        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
    	
    }}
