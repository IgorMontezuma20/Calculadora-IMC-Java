/**
 * Este código visa calcular o IMC de acordo com os dados apresentados à ele
 * Ele irá seguir a seguinte lógica: IMC = peso(Kg) / (altura(M) * altura(M)
 * Autor: Igor Montezuma
 */
package calculadoraImc;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculadoraImc {

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Qual seu peso em (kg)?");
		String altura = JOptionPane.showInputDialog("Qual é sua altura em metros?");
		
		double pesoEmQuilos = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilos / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do peso ideal";
		msg = "IMC = "+imc + "\n" + msg;
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
}
