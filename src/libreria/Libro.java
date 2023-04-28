package libreria;

import java.time.LocalDate;

public class Libro extends Producto {
	
	//Atributos de la clase libro
	private String titulo;
	private String autor;
	private int cant;
	
	//Constructor de la clase libro
	public Libro(int codigo, String editor, LocalDate publicacion, double costo, String titulo, String autor,int cantidad){
		super(codigo, editor, publicacion, costo);			//Llama por defecto al constructor de la clase superior
		this.titulo = titulo;
		this.autor = autor;
		this.cant=cantidad;
	}
	
	//Metodos getters y setters
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getAutor(){
		return autor;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
		
	public int getcantidad(){
		return cant;
	}
	
	public void setAutor(int cantidad){
		this.cant = cantidad;
	}
		
	//Metodo heredado de la clase Producto
	public double valorFinal(double valorInicial,int cantidad){
		return valorInicial * this.getcantidad();
	}
}
