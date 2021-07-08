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

public class UD6Exercice9App {
	
	public static void intIn(int[] array, int num1, int num2) {
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
		}
	}
	
	public static void intOut(int[] array) {
		for (int i = 0; i < array.length; i++) {
			JOptionPane.showMessageDialog(null, "[" + i + "] -> " + array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedimos el valor para asignar el limite de la array
		String textSize = JOptionPane.showInputDialog("Introduce el size de la array:");
		int size = Integer.parseInt(textSize);
		int numArray[] = new int[size];
		//pedimos los valores para el rango de los numero aleatorios de la array
		String textrange1 = JOptionPane.showInputDialog("Introduce entre que valores quieres que esten los numero (valor 1)");
		int range1 = Integer.parseInt(textrange1);
		String textrange2 = JOptionPane.showInputDialog("Introduce entre que valores quieres que esten los numero (valor 2)");
		int range2 = Integer.parseInt(textrange2);
		//llamamos a la funcion para rellenar la array
		intIn(numArray, range1, range2);
		//llamamos a la funcion para mostrar la array
		intOut(numArray);
	}

}
