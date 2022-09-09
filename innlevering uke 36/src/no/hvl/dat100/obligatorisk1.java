package no.hvl.dat100;

import static javax.swing.JOptionPane.*; 
import static java.lang.Integer.*;

public class obligatorisk1 {
	
	
	public static void main(String[] args) {
	
	String inntekTxt = showInputDialog("HVa er inntekten din?");
	int lonn = parseInt(inntekTxt);
		
	
	double skatt;
	double brutto;
	
	if(lonn>=0&&lonn<=164100) {
		skatt = lonn*0;
		brutto = lonn-skatt;
		showMessageDialog(null,"Lønnen din etter skatt er "+brutto+"Kr");
	}
	else if (lonn >=164101&&lonn<=230950) {
		skatt = lonn *0.0093;
		brutto = lonn-skatt;
		showMessageDialog(null,"Lønnen din etter skatt er "+brutto+"Kr");
	}
	
	else if (lonn>=230951&&lonn<=580650) {
		skatt = lonn*0.0241;
		brutto = lonn-skatt;
		showMessageDialog(null,"Lønnen din etter skatt er "+brutto+"Kr");
	}
	
	 else if (lonn>=580651&&lonn<=934050) {
		skatt = lonn*0.1152;
		brutto = lonn-skatt;
		showMessageDialog(null,"Lønnen din etter skatt er "+brutto+"Kr");
	}
	
	else if (lonn>=934051) {
		skatt = lonn*0.1452;
		brutto = lonn-skatt;
		showMessageDialog(null,"Lønnen din etter skatt er "+brutto+"Kr");
	}
	else {
		showMessageDialog(null,"Skriv inn en gyldig sum");
	}
}}	
