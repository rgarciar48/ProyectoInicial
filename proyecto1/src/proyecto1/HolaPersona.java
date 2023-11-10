package proyecto1;

import javax.swing.JOptionPane;

public class HolaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre=JOptionPane.showInputDialog("Dame tu nombre");
		JOptionPane.showMessageDialog(null, "Hola"+nombre);
	}

}
