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

public class UD6Exercice4App {
	
	//funcion que va recorriendo los numeros a la inversa y se van multiplicando entre si
	public static int factorial(int num) {
		int total = 1;
		for (int i = num; i > 0; i--) {
			total*=i;
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textNum = JOptionPane.showInputDialog("Introduce un numero:");
		int num = Integer.parseInt(textNum);
		JOptionPane.showMessageDialog(null, "El numero factorial de "+num+" es "+factorial(num));
	}

}
