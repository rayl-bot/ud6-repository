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

public class UD6Exercice3App {

	public static boolean isPrimo(int num) {
		int contador = 2;// numero por el cual dividimos
		boolean primo = true;

		while (contador < num && primo) {
			if (num % contador == 0) {
				primo = false;
				return primo;
			}else
				contador++;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textNum = JOptionPane.showInputDialog("Introduce un numero:");
		int num = Integer.parseInt(textNum);
		//condicion para mostrar por pantalla si es o no primo.
		if(isPrimo(num))
			JOptionPane.showMessageDialog(null, "El numero "+num+" es un numero primo");
		else
			JOptionPane.showMessageDialog(null, "El numero "+num+" no es un numero primo");
	}

}
