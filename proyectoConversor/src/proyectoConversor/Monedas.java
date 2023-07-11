package proyectoConversor;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Monedas{
	
	private Object valor;
	private double resultado;
	
	private double valorCopToUSD = 0.000242090;
	private double valorUSDToCop = 4130.6954;
	
	private double valorCopToEur = 0.000223159;
	private double valorEurToCop = 4481.1126;
	
	private double valorCopToGbp = 0.000190525;
	private double valorGbpToCop = 5247.8174;

	private double valorCopToJpy = 0.0349224;
	private double valorJpyToCop = 28.634936;
	
	private double valorCopToKrw = 0.315341;
	private double valorKrwToCop = 3.1709372;
	
	private DecimalFormat decimal = new DecimalFormat("#.00");
	
	public void PesoToUsd() {
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de COP a USD"));
			this.resultado = (double) this.valor * valorCopToUSD;
			JOptionPane.showMessageDialog(null, "Tienes: $" + decimal.format(this.resultado).replace(",", ".").replace(",", ".") + " USD");
	}
	
	public void UsdToPeso() {
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de USD a COP"));
			this.resultado = (double) this.valor * valorUSDToCop;
			JOptionPane.showMessageDialog(null, "Tienes: $" + decimal.format(this.resultado).replace(",", ".") + " COP");
	}
	
	public void PesoToEur() {
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de COP a EUR"));
			this.resultado = (double) this.valor * valorCopToEur;
			JOptionPane.showMessageDialog(null, "Tienes: €" + decimal.format(this.resultado).replace(",", ".") + " EUR");
	}
	
	public void EurToPeso() {
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de EUR a COP"));
			this.resultado = (double) this.valor * valorEurToCop;
			JOptionPane.showMessageDialog(null, "Tienes: $" + decimal.format(this.resultado).replace(",", ".") + " COP");
	}
	
	public void PesoToGbp() {
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de COP a GBP"));
			this.resultado = (double) this.valor * valorCopToGbp;
			JOptionPane.showMessageDialog(null, "Tienes: £" + decimal.format(this.resultado).replace(",", ".") + " GBP");
	}
	
	public void GbpToPeso(){
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de BGP a COP"));
			this.resultado = (double) this.valor * valorGbpToCop;
			JOptionPane.showMessageDialog(null, "Tienes: $" + decimal.format(this.resultado).replace(",", ".") + " COP");
	}
	
	public void PesoToJpy() {
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de COP a JPY"));
			this.resultado = (double) this.valor * valorCopToJpy;
			JOptionPane.showMessageDialog(null, "Tienes: ¥" + decimal.format(this.resultado).replace(",", ".") + " JPY");
	}
	
	public void JpyToPeso() {
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de JPY a COP"));
			this.resultado = (double) this.valor * valorJpyToCop;
			JOptionPane.showMessageDialog(null, "Tienes: $" + decimal.format(this.resultado).replace(",", ".") + " COP");
	}
	
	public void PesoToKrw() {
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de COP a KRW"));
			this.resultado = (double) this.valor * valorCopToKrw;
			JOptionPane.showMessageDialog(null, "Tienes: ₩" + decimal.format(this.resultado).replace(",", ".") + " KRW");
	}
	
	public void KrwToPeso() {
		this.valor = Double.parseDouble(JOptionPane
				.showInputDialog("Ingresa la cantidad de dinero que " + "deseas convertir de KRW a COP"));
			this.resultado = (double) this.valor * valorKrwToCop;
			JOptionPane.showMessageDialog(null, "Tienes: $" + decimal.format(this.resultado).replace(",", ".") + " COP");
	}
}
