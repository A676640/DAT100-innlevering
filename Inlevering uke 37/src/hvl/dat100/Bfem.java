package hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Bfem {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			String tallTxt = showInputDialog("Hvordan poengsum fikk du:");
			int poengsum = parseInt(tallTxt);

			String karrakter = "";

			if (poengsum >= 90 && poengsum <= 100) {
				karrakter = "A";
			} else if (poengsum >= 80 && poengsum <= 89) {
				karrakter = "B";
			} else if (poengsum >= 60 && poengsum <= 79) {
				karrakter = "C";
			} else if (poengsum >= 50 && poengsum <= 59) {
				karrakter = "D";
			} else if (poengsum >= 40 && poengsum <= 49) {
				karrakter = "E";
			} else if (poengsum >= 0 && poengsum <= 39) {
				karrakter = "F";
			} else {
				karrakter = "Poengsummen din er ikke gyldig";
				i--;

			}

			System.out.println(karrakter);
		}

	}
}
