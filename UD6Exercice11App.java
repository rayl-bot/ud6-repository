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

public class UD6Exercice11App {
	
	public static int[] multiArray(int[] array1, int[] array2) {
		int arrayT[] = new int [array1.length];
		for (int i = 0; i < arrayT.length; i++) {
			arrayT[i] = array1[i]*array2[i];
		}
		return arrayT;
	}
	
	public static void intOut(int[] array) {
		for (int i = 0; i < array.length; i++) {
			JOptionPane.showMessageDialog(null, "[" + i + "] -> " + array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textSize1 = JOptionPane.showInputDialog("Introduce las filas de la array:");
		int size1 = Integer.parseInt(textSize1);
		String textSize2 = JOptionPane.showInputDialog("Introduce las filas de la array:");
		int size2 = Integer.parseInt(textSize2);
		//declaramos la array con las variables que hemos introducido antes.
		int array1[] = new int [size1];
		int array2[] = new int [size2];
		int arrayT[] = multiArray(array1, array2);
		intOut(array1);
		intOut(array2);
		intOut(arrayT);
		
	}

}
