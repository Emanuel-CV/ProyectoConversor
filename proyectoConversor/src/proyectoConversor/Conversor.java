package proyectoConversor;

import javax.swing.JOptionPane;

public class Conversor {
	private Object valor;
	private double valorUSD = 4.177;
	private boolean continuar = true;
	private double resultado;

	public Conversor() {

		// Se crean las opciones del menú para que el usuario escoja.
		
		try {
			String conversiones[] = { "Moneda", "Temperatura", "Distancia" };
			String divisas[] = { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
					"De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
					"De Won Coreano a Pesos" };

			// Código del menú (ComboBox)
			Object conversionElegida = JOptionPane.showInputDialog(null, "Escoja la conversión que desea utilizar", "Menú",
					JOptionPane.INFORMATION_MESSAGE, null, conversiones, conversiones[0]);

			if (conversionElegida == conversiones[0]) {
//				

				Object divisaElegida = JOptionPane.showInputDialog(null, "Escoja la conversión que desea utilizar", "Menú",
						JOptionPane.INFORMATION_MESSAGE, null, divisas, divisas[0]);

				if (divisaElegida == divisas[0]) {
					JOptionPane.showMessageDialog(null, "1 USD = 4.177 COP al 03/07/2023");
					this.valor = Double.parseDouble(JOptionPane
							.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de COP  a USD"));
					resultado = (double) this.valor * valorUSD;
					JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " COP");
				}
			}
		} catch (NullPointerException npe) {
			JOptionPane.showMessageDialog(null, "Operación cancelada");
		}
		
	}
}
