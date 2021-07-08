import java.util.Iterator;

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

public class UD6Exercice2App {
	
	public static int randomNumber(int num1, int num2) {
		//con estas funcionalidades de Math podemos sacar un numero random entre un rango que nosotros le pasamos.
		return (int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textNum = JOptionPane.showInputDialog("Introduce la cantidad de numeros aleatorios que deseas");
		int num = Integer.parseInt(textNum);
		String textrange1 = JOptionPane.showInputDialog("Introduce entre que valores quieres que esten los numero (valor 1)");
		int range1 = Integer.parseInt(textrange1);
		String textrange2 = JOptionPane.showInputDialog("Introduce entre que valores quieres que esten los numero (valor 2)");
		int range2 = Integer.parseInt(textrange2);
		
		for (int i = 0; i < num; i++) {
			JOptionPane.showMessageDialog(null, "Numero "+(i+1)+": "+randomNumber(range1, range2));
		}
	}
	
}
