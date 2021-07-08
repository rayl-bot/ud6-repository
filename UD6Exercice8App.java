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

public class UD6Exercice8App {

	// creamos un metodo que cree una array e introduzca los valores por pantalla.
	public static int[] intIn() {
		int arrayNum[] = new int[10];
		for (int i = 0; i < arrayNum.length; i++) {
			String textNum = JOptionPane.showInputDialog("Introduce un numero en la posicion " + i + " de la array");
			arrayNum[i] = Integer.parseInt(textNum);
		}
		return arrayNum;
	}

	// funcion que mediante un bucle, muestra por consola los datos de dentro de la
	// array con su iterador.
	public static void intOut(int arrayNum[]) {
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println("[" + i + "] -> " + arrayNum[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaracion de la array
		int arrayNum[] = intIn();
		intOut(arrayNum);
	}

}
