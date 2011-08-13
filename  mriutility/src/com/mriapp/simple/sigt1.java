package com.mriapp.simple;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sigt1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.simulation);
        

        final TextView refstuff = (TextView) findViewById(R.id.refstuff);
        
        refstuff.setText("Not quite done yet..");
        
        
    }}
//      setContentView(R.layout.varaboutab);
//        
//
//        final EditText varb = (EditText) findViewById(R.id.varb);
//        final EditText vara = (EditText) findViewById(R.id.vara);
//        final EditText outa = (EditText) findViewById(R.id.outa);
//        final EditText outb = (EditText) findViewById(R.id.outb);
//
//        final Button solve = (Button) findViewById(R.id.solve);
//        
//        
//        final TextView varatext = (TextView) findViewById(R.id.varatext);
//        final TextView varbtext = (TextView) findViewById(R.id.varbtext);
//        final TextView outbtext = (TextView) findViewById(R.id.outbtext);
//        final TextView outatext = (TextView) findViewById(R.id.outatext);
//
//        
//        varatext.setText("Frequency (MHz)");
//        vara.setHint("frequency");
//        varbtext.setText("Inductance (nH)");
//        varb.setHint("inductance");
//        outatext.setText("Capacitance (pF)");
//        outa.setHint("capacitance");
//        outbtext.setText("Inductance Impedance (Z=jwL)");
//        outb.setHint("inductance impedance");
//        
//        solve.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			 public void onClick(View v) {
//				
//				double varB = new Double(0);
//				double freq;
//				double omega;
//				double lorc = new Double(0);
//
//				if(varb.getText().length()>0)
//				varB = new Double(varb.getText().toString());
//				if(vara.getText().length()>0){
//					freq = new Double(vara.getText().toString());}
//				else{
//					freq = 123.23;
//					vara.setText("123.23");
//				};
//				omega = 2*3.141596*freq;
//				lorc = 1/omega/omega/varB*1000000000;
//				
//				outa.setText(String.valueOf(lorc));
//				
//				double outB = (omega*varB)*0.001;
//				outb.setText("j" + String.valueOf(outB));
//				
//			}});
//        
//        
//        
//        varb.setOnKeyListener(new View.OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				double varB = new Double(0);
//				double freq;
//				double omega;
//				double lorc = new Double(0);
//
//				if(varb.getText().length()>0)
//				varB = new Double(varb.getText().toString());
//				if(vara.getText().length()>0){
//					freq = new Double(vara.getText().toString());}
//				else{
//					freq = 123.23;
//					vara.setText("123.23");
//				};
//				omega = 2*3.141596*freq;
//				lorc = 1/omega/omega/varB*1000000000;
//				
//				outa.setText(String.valueOf(lorc));
//				
//				double outB = (omega*varB*0.001);
//				outb.setText("j" + String.valueOf(outB));
//				
//return false;		        
//			}});
//			
//        	
//        
//        
//        
//    }
//    
//    public void toasty(String toastmessage){
//        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
//    	
//    }
//}