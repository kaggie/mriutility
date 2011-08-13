package com.mriapp.simple;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class coilc_z0 extends Activity {
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
  final TextView outatext = (TextView) findViewById(R.id.outatext);
  final TextView outbtext = (TextView) findViewById(R.id.outbtext);
  varatext.setText("Frequency (MHz)");
  vara.setHint("frequency");
  varbtext.setText("Desired Impedance (Z0)");
  varb.setHint("impedance");
  outatext.setText("Inductance (nH)");
  outa.setHint("inductance");
  outbtext.setText("Capacitance (pF)");
  outb.setHint("capacitance");
  
  
  
  
  
        
        solve.setOnClickListener(new View.OnClickListener() {
			
			@Override
			 public void onClick(View v) {
				
				double Z0 = new Double(0);
				double freq;
				double omega;
				double outA = new Double(0);
				double outB = new Double(0);

				if(varb.getText().length()>0)
				Z0 = new Double(varb.getText().toString());
				if(vara.getText().length()>0){
					freq = new Double(vara.getText().toString());}
				else{
					freq = 123.23;
					vara.setText("123.23");
				};
				omega = 2*3.141596*freq;
				outA = Z0/omega*1000;
				
				outa.setText(String.valueOf(outA));
				outB = 1/omega*1000000/Z0;
				outb.setText(String.valueOf(outB));
			}});
        
        
        
        varb.setOnKeyListener(new View.OnKeyListener() {

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				double Z0 = new Double(0);
				double freq;
				double omega;
				double outA = new Double(0);
				double outB = new Double(0);

				if(varb.getText().length()>0)
				Z0 = new Double(varb.getText().toString());
				if(vara.getText().length()>0){
					freq = new Double(vara.getText().toString());}
				else{
					freq = 123.23;
					vara.setText("123.23");
				};
				omega = 2*3.141596*freq;
				outA = Z0/omega*1000;
				
				outa.setText(String.valueOf(outA));
				outB = 1/omega*1000000/Z0;
				outb.setText(String.valueOf(outB));
				
				
return false;		        
			}});
			
        	
        
        
        
    }
    
    public void toasty(String toastmessage){
        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
    	
    }
}