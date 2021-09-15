package co.uniquindio.fundamentos.biblioteca;

public class Libro {
	/**
	 * Son los atributos del triangulo
	 */

	private int cantPaginas;
	private String nombre, clasificacion, autor, editorial;

	
	/**
	 * Metodo modificador
	 * @param base Es la base del triangulo
	 */
	public void cantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
}
	public void nombre(String nombre) {
		this.nombre = nombre;
}
	public void clasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
}
	public void autor(String autor) {
		this.autor = autor;
}
	public void editorial(String editorial) {
		this.editorial = editorial;
}
	
	
	
	/**
	 * Permite calcular el area del triangulo
	 * @return el area
	 */
	public double isPrestado() {
		double area;
		area = cantPaginas;
		return area;
		
	}

}
