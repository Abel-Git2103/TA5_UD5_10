import javax.swing.JOptionPane;

public class VentasAPP {

	public static void main(String[] args) {
		
		String ventas = JOptionPane.showInputDialog("Introduce el número de ventas:");
		int numVentas = Integer.parseInt(ventas);
		double sumaVentas = 0;
		for (int i = 0; i < numVentas; i++) {
			ventas = JOptionPane.showInputDialog("Introdce el precio de la venta " + (i + 1));
			double venta = Double.parseDouble(ventas);
			sumaVentas = sumaVentas + venta;
		}
		System.out.println("El valor total de la suma de las ventas es = " + sumaVentas);
	}
}
