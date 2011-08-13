package com.mriapp.simple;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class coilc_newc extends Activity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  setContentView(R.layout.varabc);
        

  		final EditText varc = (EditText) findViewById(R.id.varc);
        final EditText varb = (EditText) findViewById(R.id.varb);
        final EditText vara = (EditText) findViewById(R.id.vara);
        final EditText outa = (EditText) findViewById(R.id.outa);

        final Button solve = (Button) findViewById(R.id.solve);
        
        
        final TextView varatext = (TextView) findViewById(R.id.varatext);
        final TextView varbtext = (TextView) findViewById(R.id.varbtext);
        final TextView varctext = (TextView) findViewById(R.id.varctext);
        final TextView outatext = (TextView) findViewById(R.id.outatext);
    
        varatext.setText("Desired Frequency (MHz)");
        vara.setHint("desired frequency");
        varbtext.setText("Current Frequency (MHz)");
        varb.setHint("current frequency");
        varctext.setText("Current Capacitance (pF)");
        varc.setHint("capacitance");
        outatext.setText("New Capacitance (pF)");
        outa.setHint("new capacitance");
        
        
        
        solve.setOnClickListener(new View.OnClickListener() {
			
			@Override
			 public void onClick(View v) {
				
				double varB = new Double(0);
				double varC = new Double(0);
				double freq;
				double outA = new Double(0);

				if(varc.getText().length()>0)
					varC = new Double(varc.getText().toString());
				if(varb.getText().length()>0)
				varB = new Double(varb.getText().toString());
				if(vara.getText().length()>0){
					freq = new Double(vara.getText().toString());}
				else{
					freq = 123.23;
					vara.setText("123.23");
				};
				outA = varC*varB*varB/freq/freq;
				outa.setText(String.valueOf(outA));

			}});
        
        
        
        varc.setOnKeyListener(new View.OnKeyListener() {

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				double outA = new Double(0);
				double varB = new Double(0);
				double varC = new Double(0);
				double freq;
				

				if(varc.getText().length()>0)
					varC = new Double(varc.getText().toString());
				if(varb.getText().length()>0)
				varB = new Double(varb.getText().toString());
				if(vara.getText().length()>0){
					freq = new Double(vara.getText().toString());}
				else{
					freq = 123.23;
					vara.setText("123.23");
				};
				
				outA = varC*varB*varB/freq/freq;
				outa.setText(String.valueOf(outA));
				
				
return false;		        
			}});
        
    }
    
    public void toasty(String toastmessage){
        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
    	
    }
    

    
    
}

