package hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class fakultertTall {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Skriv et tall:");
		int tall = parseInt(tallTxt);
		int n = 1;

		if (tall <= 0) {
			System.out.print("Du må skrive et tall som er større enn 0");
		} else {
			for (int i = tall; i > 0; i--) {
				n = i * n;
			}
			System.out.print(tall + "!" + " = " + n);
		}

	}

}
