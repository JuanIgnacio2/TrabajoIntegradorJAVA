package libreria;

import java.time.LocalDate;

public class Revista extends Producto{

	//Atributos
	private String nom;
	private int cant;
	
	//Constructor
	public Revista(int codigo, String editor, LocalDate publicacion, double costo, String nombre,int cantidad){
		super(codigo, editor, publicacion, costo);		//Llama por defecto al constructor de la clase superior
		this.nom = nombre;
		this.cant=cantidad;
	}
	
	//Metodos getters y setters
	public String getNombre() {
		return nom;}
	public void setNombre(String nombre) {
		this.nom = nombre;}
	public int getCantidad() {
		return cant;}
	public void setCantidad(int cantidad) {
		this.cant = cantidad;}

	//Metodo heredado de la clase Producto

	public double valorFinal(double valorInicial,int cantidad){
		return valorInicial * this.getCantidad();
	}



}
