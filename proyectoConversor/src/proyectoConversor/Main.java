package proyectoConversor;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		int continuar = 0;

		while (continuar == 0) {
			try {
				Conversor conversor = new Conversor();
				continuar = JOptionPane.showConfirmDialog(null, "¿Deseas volver a convertir?", "Selecciona una opción",
						JOptionPane.YES_NO_CANCEL_OPTION);
			} catch (NumberFormatException nf) {
				JOptionPane.showMessageDialog(null, "Solo se permiten valos numéricos.");
			}
		}
	}
}