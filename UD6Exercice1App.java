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
public class UD6Exercice1App {
	
	public static double circle(double rad) {
		return Math.PI * (Math.pow(rad, 2));
	}
	
	public static double triangle(double base, double high) {
		return (base*high)/2;
	}
	
	public static double square(double side1, double side2) {
		return side1*side2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String geoForm = JOptionPane.showInputDialog("Introduce una forma geometrica: (circulo, cuadrado o triangulo)");
		// iniciamos la estructura switch case porque creo que es la que mejor se adapta
		// a lo que requiere el ejercicio
		switch (geoForm.toUpperCase()) {

		case "CIRCULO":
			// pedimos por pantalla el valor necesario del area del circulo
			String textRad = JOptionPane.showInputDialog("Introduce el radio del circulo: ");
			double rad = Double.parseDouble(textRad);
			// mostramos el resultado de la funcion con el valor introducido anteriormente
			JOptionPane.showMessageDialog(null, "El area del circulo introducido es: "+circle(rad));
			break;

		case "TRIANGULO":
			// pedimos por pantalla los valores necesarios del area del triangulo
			String textBase = JOptionPane.showInputDialog("Introduce la base del triangulo: ");
			double base = Double.parseDouble(textBase);
			String textHigh = JOptionPane.showInputDialog("Introduce la altura del triangulo: ");
			double high = Double.parseDouble(textHigh);
			// mostramos el resultado de la funcion con los valores introducidos anteriormente
			JOptionPane.showMessageDialog(null, "El area del triangulo introducido es: "+triangle(base, high));
			break;

		case "CUADRADO":
			// pedimos por pantalla los valores necesarios del area del cuadrado
			String textSide1 = JOptionPane.showInputDialog("Introduce uno de los lados del cuadrado: ");
			double side1 = Double.parseDouble(textSide1);
			String textSide2 = JOptionPane.showInputDialog("Introduce otro de los lados del cuadrado: ");
			double side2 = Double.parseDouble(textSide2);
			// mostramos el resultado de la funcion con los valores introducidos anteriormente
			JOptionPane.showMessageDialog(null, "El area del cuadrado introducido es: "+square(side1, side2));
			break;

		default:
			//error message
			JOptionPane.showMessageDialog(null, "Por favor, introduce una de las opciones de las figuras");
			break;
		}
	}

}
