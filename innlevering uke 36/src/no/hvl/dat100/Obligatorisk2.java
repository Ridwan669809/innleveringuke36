package no.hvl.dat100;

import static javax.swing.JOptionPane.*; 
import static java.lang.Integer.*;

public class Obligatorisk2 {

	public static void main(String[] args) {
		
	
	for (int i=1;i<=10;i++) {
		
		String inntekTxt = showInputDialog("Hva er poeng summen din?");
		int poeng  = parseInt(inntekTxt);
		
	
if (poeng<=39&&poeng>=0) {
	showMessageDialog(null,"F");
	}
else if(poeng>=40&&poeng<=49) {
	showMessageDialog(null,"E");
}
else if (poeng>=50&&poeng<=59) {
	showMessageDialog(null,"D");

}
else if (poeng>=60&&poeng<=79) {
	showMessageDialog(null,"C");

}
else if (poeng>=80&&poeng<=89) {
	showMessageDialog(null,"B");

}
else if (poeng>=90&&poeng<=100) {
	showMessageDialog(null,"A");

}

else if (poeng<0||poeng>100) {
	showMessageDialog(null,"Legg inn en gyldig poeng sum");
	inntekTxt = showInputDialog("Hva er poeng summen din?");
	poeng = parseInt(inntekTxt);

	i--;
}

}}}
