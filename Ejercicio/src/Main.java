import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Acá empieza el programa");
		
		Autor cortazar = new Autor ("Julio", "Cortazar", "1914", "Masculino", "Cortazar2008xd@gmail.com");
		
		Editorial sudamericana = new Editorial ("Sudamericana", "123", "Humberto Primo 555", "Capital Federal", "sud123@gmail.com", "456");
		
		Libro finalDelJuego = new Libro ("Final del juego", "1956", 20, 5000, cortazar, sudamericana);
		
		JOptionPane.showMessageDialog(null, "El libro es: " + finalDelJuego);
		JOptionPane.showMessageDialog(null, "Su autor es: " + cortazar.getNombre() + cortazar.getApellido());
		JOptionPane.showMessageDialog(null, "Editorial del libro: " + sudamericana);
		
		
		

	}

}
