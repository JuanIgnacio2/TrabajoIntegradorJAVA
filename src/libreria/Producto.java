package libreria;

import java.time.LocalDate;

public abstract class Producto {
	
	//Declaración de los atributos de la clase producto
	private int  codigo;
	private String editor;
	private LocalDate publicacion;
	private double costo;
			
	//Constructor
	public Producto(int codigo, String editor, LocalDate publicacion, double costo) {
		this.codigo = codigo;
		this.editor = editor;
		this.publicacion = publicacion;
		this.costo = costo;
	}
	
	//Metodos setters y getters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public LocalDate getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(LocalDate publicacion) {
		this.publicacion = publicacion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
			
	public abstract double valorFinal(double valorInicial, int cantidad);
}
