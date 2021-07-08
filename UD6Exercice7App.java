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

public class UD6Exercice7App {
	private static final double LIBRAS = 0.86;
	private static final double DOLARES = 1.28611;
	private static final double YENES = 129.852;
	
	public static void changeCoin (String coin, double money) {
		coin=coin.toUpperCase();
		if(coin.equals("LIBRAS"))
			JOptionPane.showMessageDialog(null, money + " Euros son " + LIBRAS*money +" libras.");
		else if(coin.equals("DOLARES"))
			JOptionPane.showMessageDialog(null, money + " Euros son " + DOLARES*money +" dolares.");
		else if(coin.equals("YENES"))
			JOptionPane.showMessageDialog(null, money + " Euros son " + YENES*money +" yenes.");
		else
			JOptionPane.showMessageDialog(null,"Introduce una de las monedas seleccionadas, gracias.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textMoney = JOptionPane.showInputDialog("Introduce una cantidad de dinero:");
		double money = Double.parseDouble(textMoney);
		String coin = JOptionPane.showInputDialog("Selecciona la moneda (dolares, yenes o libras):");
		changeCoin(coin,money);
	}

}
