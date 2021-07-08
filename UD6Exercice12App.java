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

public class UD6Exercice12App {

	public static void intOut(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				JOptionPane.showMessageDialog(null, "[" + i + "] -> " + array[i]);
		}
	}

	public static void intIn(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * (1 - (300 + 1)) + (300));
		}
	}

	public static void intOutSpecificNumber(int[] array, int num) {
		int newArray[] = new int[array.length];
		boolean hay = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%10 == num) {
				hay = true;
				newArray[i] = array[i];
			}
		}
		if (!hay) {
			JOptionPane.showMessageDialog(null, "No se ha encotrado ningun numero que acabe en " + num);

		} else
			JOptionPane.showMessageDialog(null, "Continuar para mostrar la array con los numeros especificos: ");
			intOut(newArray);// Mostrar la array con los numeros pedidos.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textSize1 = JOptionPane.showInputDialog("Introduce el size de la array:");
		int size1 = Integer.parseInt(textSize1);
		// declaramos la array con las variables que hemos introducido antes.
		int array1[] = new int[size1];
		String textNumber = JOptionPane.showInputDialog("Introduce un numero para buscar:");
		int number = Integer.parseInt(textNumber);
		if (number < 0)
			JOptionPane.showMessageDialog(null, "ERROR: Introduce un numero positivo");
		else {
			intIn(array1);
			intOutSpecificNumber(array1, number);
			// mostrar la primera array
			JOptionPane.showMessageDialog(null, "Continuar para mostrar la array principal: ");
			intOut(array1);
		}
	}
}
