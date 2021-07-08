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

public class UD6Exercice5App {

	public static String toBinary(String binary, int num) {
		while(2<=num) {
			binary = num%2+binary;
			num = num/2;
		}
		return 1+binary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "";
		String textNum = JOptionPane.showInputDialog("Introduce un numero:");
		int num = Integer.parseInt(textNum);
		JOptionPane.showMessageDialog(null, "El numero " + num + " en binario es: " + toBinary(text, num));
	}

}
