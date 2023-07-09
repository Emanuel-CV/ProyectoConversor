package proyectoConversor;

import javax.swing.JOptionPane;

public class Conversor {
	// Se crean las opciones del menú para que el usuario escoja.
	private static Object[] conversiones = { "Moneda", "Temperatura"};
	private static Object[] divisas = { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
			"De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
			"De Won Coreano a Pesos" };
	private static Object[] temperaturas = { "De Celsius a Fahrenheit", "De Celsius a Kelvin",
			"De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit" };

	private static Object conversionElegida;

	public Conversor() {
		try {
			// Código del menú (ComboBox)
			conversionElegida = JOptionPane.showInputDialog(null, "Escoja la conversión que desea utilizar", "Menú",
					JOptionPane.INFORMATION_MESSAGE, null, conversiones, conversiones[0]);

			// Selecciones del usuario
			if (conversionElegida == conversiones[0]) {
				JOptionPane.showMessageDialog(null, "Las conversiones se realizarán en Pesos Colombianos.");
				conversorMoneda();
			} else if (conversionElegida == conversiones[1]) {
				conversorTemperatura();
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
		} else if (divisaElegida == divisas[3]) {
			monedas.PesoToJpy();
		} else if (divisaElegida == divisas[4]) {
			monedas.PesoToKrw();
		} else if (divisaElegida == divisas[5]) {
			monedas.UsdToPeso();
		} else if (divisaElegida == divisas[6]) {
			monedas.EurToPeso();
		} else if (divisaElegida == divisas[7]) {
			monedas.GbpToPeso();
		} else if (divisaElegida == divisas[8]) {
			monedas.JpyToPeso();
		} else if (divisaElegida == divisas[9]) {
			monedas.KrwToPeso();
		}
	}

	private void conversorTemperatura() {
		Temperatura temperatura = new Temperatura();

		Object temperaturaElegida = JOptionPane.showInputDialog(null,
				"Escoja las conversiones de temperatura que desea calcular", "Temperatura",
				JOptionPane.INFORMATION_MESSAGE, null, temperaturas, temperaturas[0]);

		if (temperaturaElegida == temperaturas[0]) {
			temperatura.CelsiusToFahrenheit();
		} else if (temperaturaElegida == temperaturas[1]) {
			temperatura.CelsiusToKelvin();
		} else if (temperaturaElegida == temperaturas[2]) {
			temperatura.FahrenheitToCelsius();
		} else if (temperaturaElegida == temperaturas[3]) {
			temperatura.FahrenheitToKelvin();
		} else if (temperaturaElegida == temperaturas[4]) {
			temperatura.KelvinToCelsius();
		} else if (temperaturaElegida == temperaturas[5]) {
			temperatura.KelvinToFahrenheit();
		}

	}
}
