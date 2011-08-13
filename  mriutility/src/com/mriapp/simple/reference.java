package com.mriapp.simple;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class reference extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reference);
        
        Double freqratio = 123.23/42.576;

        final TextView refstuff = (TextView) findViewById(R.id.refstuff);
        String[] nucleis = {"H","D","He","Li","C","N","N","O","F",
        		"Na","P","As","Xe"
        };

        int[] nucleip = {1, 2 , 3,7,13,14,15,17,19,23,31,75,129};
        Double[] nucleig = {42.576,6.53593,-32.434,16.546,10.705,3.0766,
        			-4.3156,-5.7716,40.5093,11.262,17.235,7.2919,-1.777};
        String a = "P \t Nuclei \tGyro ratio\tYour Freq\n";
        
        for (int i = 0; i < 13; i = i + 1) {
        a = a+String.valueOf(nucleip[i]) ;
        
        if(!(nucleis[i]=="Xe"))
        	a = a+"\t ";
        
        a = a+nucleis[i] + "\t\t";
        if(!(nucleis[i]=="Na"||nucleis[i]=="He"||nucleis[i]=="Xe")){//weird formatting issue
        	a = a + "\t "; 
        };
        a = a + String.valueOf(nucleig[i]) + "\t\t";
        
        Double yourfreq = nucleig[i]*freqratio;
        a = a+String.valueOf(truncate(yourfreq))+"\n";
        
        }
        

//        refstuff.setHintTextColor(0x00FF00);
//        refstuff.setTextColor(0xFFFFFF);
        refstuff.setText(a);
        
        
    }
    
    public void toasty(String toastmessage){
        Toast.makeText( getBaseContext(), toastmessage, Toast.LENGTH_SHORT).show();
    	
    }
    
    public static double truncate(double x)
    {
        long y=(long)(x*10000);
        return (double)y/10000;
    }
}