package hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Gfire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double skatt = 0;
		double fradrag = 0;
		String tallTxt = showInputDialog("Hvor mye inntekt har du?:");
		int inntekt = parseInt(tallTxt);

		if (inntekt <= 164100) {
			System.out.print("Med brutolønn på " + inntekt + ", Har du en skatt på 0kr");
		} else if (inntekt > 164100 && inntekt <= 230950) {
			skatt = 0.0093;
			fradrag = inntekt * skatt;
			int avrundetfradrag = (int) fradrag;
			System.out.print("Med brutolønn på " + inntekt + ", men du blir skattet med " + avrundetfradrag + "kr.");
		} else if (inntekt > 230950 && inntekt <= 580650) {
			skatt = 0.0241;
			fradrag = inntekt * skatt;
			int avrundetfradrag = (int) fradrag;
			System.out.print("Med brutolønn på " + inntekt + ", men du blir skattet med " + avrundetfradrag + "kr.");
		} else if (inntekt > 580650 && inntekt <= 934050) {
			skatt = 0.1152;
			fradrag = inntekt * skatt;
			int avrundetfradrag = (int) fradrag;
			System.out.print("Med brutolønn på " + inntekt + ", men du blir skattet med " + avrundetfradrag + "kr.");
		} else if (inntekt > 934050) {
			skatt = 0.1452;
			fradrag = inntekt * skatt;
			int avrundetfradrag = (int) fradrag;
			System.out.print("Med brutolønn på " + inntekt + ", men du blir skattet med " + avrundetfradrag + "kr.");
		}

	}

}
