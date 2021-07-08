import javax.swing.JOptionPane;

/***
 * 
 * @author rgonzalez
 * @version 08/07/2021
 * 
 *          CONTENT README.txt-->En esta UD6 veremos y practicaremos ciertos
 *          conceptos como metodos para trabajar de forma modular, en mi caso ya
 *          lo he trabajado en ejercicios anteriores, y tambien conceptos y usos
 *          practicos del uso de arrays(listas no dinamicas).<--CONTENT
 *          README.txt
 *
 */

public class UD6Exercice6App {
	
	public static int numCifras(String num) {
		return num.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textNum = "";
		do {
			textNum = JOptionPane.showInputDialog("Introduce un numero entero positivo:");
		} while (textNum.contains("-") || textNum.contains("."));
		
		JOptionPane.showMessageDialog(null, "El numero " + textNum + " tiene " + numCifras(textNum)+" cifra/as.");
	}

}
