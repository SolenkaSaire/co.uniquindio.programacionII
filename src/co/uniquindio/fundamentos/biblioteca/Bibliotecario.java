package co.uniquindio.fundamentos.biblioteca;

public class Bibliotecario {
	/**
	 * Son los atributos del triangulo
	 */

	private int id, edad;
	private String nombre;
	private boolean sexo=false;

	
	/**
	 * Metodo modificador
	 * @param base Es la base del triangulo
	 */
	public void id(int id) {
		this.id = id;
}
	
	public void edad(int edad) {
		this.edad = edad;
}
	
	public void nombre(String nombre) {
		this.nombre = nombre;
}
	
	public void sexo(boolean sexo) {
		this.sexo = sexo;
}
	
	/**
	 * Permite calcular el area del triangulo
	 * @return el area
	 */
	public int buscarLibro() {
		int area;
		area = id;
		return area;
		
	}
	
	public int verificarEstadoLibro() {
		int area;
		area = edad;
		return area;
		
	}
	
}
