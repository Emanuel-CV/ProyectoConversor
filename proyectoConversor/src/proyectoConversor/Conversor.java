package proyectoConversor;

import javax.swing.JOptionPane;

public class Conversor {
	// Se crean las opciones del menú para que el usuario escoja.
	private static Object[] conversiones = { "Moneda", "Temperatura", "Distancia" };
	private static Object[] divisas = { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
			"De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
			"De Won Coreano a Pesos" };

	private static Object conversionElegida;

	public Conversor() {
		try {
			// Código del menú (ComboBox)
			conversionElegida = JOptionPane.showInputDialog(null, "Escoja la conversión que desea utilizar", "Menú",
					JOptionPane.INFORMATION_MESSAGE, null, conversiones, conversiones[0]);
			
			//Selecciones del usuario
			if (conversionElegida == conversiones[0]) {
				JOptionPane.showMessageDialog(null, "Las conversiones se realizarán en Pesos Colombianos.");
				conversorMoneda();
			} else if (conversionElegida == conversiones[1]) {
				conversorTemperatura();
			} else if (conversionElegida == conversiones[2]){
				conversorDistancia();
			}
		} catch (NullPointerException npe) {
			JOptionPane.showMessageDialog(null, "Operación cancelada");
		}
	}

	private void conversorMoneda() {
		Monedas monedas = new Monedas();
		
		Object divisaElegida = JOptionPane.showInputDialog(null, "Escoja las divisas que desea calcular", "Divisas",
				JOptionPane.INFORMATION_MESSAGE, null, divisas, divisas[0]);
		
		if (divisaElegida == divisas[0]) {			
			monedas.PesoToUsd();
		} 
		
		else if (divisaElegida == divisas[1]) {
			monedas.PesoToEur();
		}
		
		else if (divisaElegida == divisas[2]) {
			monedas.PesoToGbp();
		}
		else if (divisaElegida == divisas[3]) {
			monedas.PesoToJpy();
		}
		else if (divisaElegida == divisas[4]) {
			monedas.PesoToKrw();
		}
		else if (divisaElegida == divisas[5]) {
			monedas.UsdToPeso();
		}
		else if (divisaElegida == divisas[6]) {
			monedas.EurToPeso();
		}
		else if (divisaElegida == divisas[7]) {
			monedas.GbpToPeso();
		}
		else if (divisaElegida == divisas[8]) {
			monedas.JpyToPeso();
		}
		else if (divisaElegida == divisas[9]) {
			monedas.KrwToPeso();
		}
	}
	
	private void conversorTemperatura(){
		JOptionPane.showMessageDialog(null, "Temperatura");
	}
	
	private void conversorDistancia() {
		JOptionPane.showMessageDialog(null, "Distancia");
	}
	
	private void convertirMoneda(Monedas moneda) {
		
	}
}
