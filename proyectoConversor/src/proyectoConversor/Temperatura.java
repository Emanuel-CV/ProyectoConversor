package proyectoConversor;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Temperatura {
//	private static Object[] temperaturas = { "De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius",
//			"De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit" };
	
	private Object valorTemperatura;
	private Object valorConversion;
	
	private DecimalFormat decimal = new DecimalFormat("#.00");
	public void validarNumeros() {
		
	}
	
	public void CelsiusToFahrenheit() {
		this.valorTemperatura = Integer.parseInt(JOptionPane
				.showInputDialog("Ingresa la cantidad de Grados C° que deseas convertir a F°"));
		this.valorConversion = (int) this.valorTemperatura * 9/5 + 32;
		JOptionPane.showMessageDialog(null, this.valorConversion.toString().replace(",", ".") + " F°");
	}
	
	public void CelsiusToKelvin() {
		this.valorTemperatura = Integer.parseInt(JOptionPane
				.showInputDialog("Ingresa la cantidad de Grados C° que deseas convertir a K°"));
		this.valorConversion = (int) this.valorTemperatura + 273.15;
		JOptionPane.showMessageDialog(null, this.valorConversion.toString().replace(",", ".") + " K°");
	}
	
	public void FahrenheitToCelsius() {
		this.valorTemperatura = Integer.parseInt(JOptionPane
				.showInputDialog("Ingresa la cantidad de Grados F° que deseas convertir a C°"));
		this.valorConversion = (int) ((int) this.valorTemperatura - 32) * 5/9;
		JOptionPane.showMessageDialog(null, this.valorConversion.toString().replace(",", ".") + " C°");
	}
	
	public void FahrenheitToKelvin() {
		this.valorTemperatura = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de Grados F° que deseas convertir a K°"));
		this.valorConversion = (double) ((double) this.valorTemperatura + 459.67) * 5/9;
		JOptionPane.showMessageDialog(null, this.valorConversion.toString().replace(",", ".") + " K°");
	}
	
	public void KelvinToCelsius() {
		DecimalFormat df = new DecimalFormat("#.00");
		this.valorTemperatura = Integer.parseInt(JOptionPane
				.showInputDialog("Ingresa la cantidad de Grados K° que deseas convertir a C°"));
		this.valorConversion = (int) this.valorTemperatura - 273.15;
		JOptionPane.showMessageDialog(null, decimal.format(this.valorConversion).replace(",", ".") + " C°");
	}
	
	public void KelvinToFahrenheit() {
		DecimalFormat df = new DecimalFormat("#.00");
		
		this.valorTemperatura = Integer.parseInt(JOptionPane
				.showInputDialog("Ingresa la cantidad de Grados K° que deseas convertir a F°"));
		this.valorConversion = (int) this.valorTemperatura * 9/5 - 459.67;
		JOptionPane.showMessageDialog(null, decimal.format(this.valorConversion).replace(",", ".") + " F°");
	}
}
