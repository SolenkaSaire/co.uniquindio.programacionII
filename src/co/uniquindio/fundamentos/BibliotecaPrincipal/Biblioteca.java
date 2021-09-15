package co.uniquindio.fundamentos.BibliotecaPrincipal;
import javax.swing.JOptionPane;


public class Biblioteca {
	/**
	 * Metodo principal
	 * 
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String args[]) {
		String nombre, clasificacion, autor, editorial;
		int cantPaginas, id, edad;		
		boolean sexo=false;
        nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        clasificacion = JOptionPane.showInputDialog("Ingrese el nombre");
        autor = JOptionPane.showInputDialog("Ingrese el nombre");
        editorial = JOptionPane.showInputDialog("Ingrese el nombre");

        cantPaginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de paginas"));
		Biblioteca miBiblioteca; // miTriangulo es una referencia a un objeto de tipo
		miBiblioteca = new Biblioteca();
		miBiblioteca.setId(id); // método para fijar el atributo base
		miBiblioteca.setEdad(edad); // método para fijar el atributo altura
		area = miTriangulo.calcularArea(); // esto devolvería (15*4)/2=0
		System.out.println("El area es " + area);
	}
}
