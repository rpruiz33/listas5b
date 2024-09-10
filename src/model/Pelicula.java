package model;

import java.util.Objects;

public class Pelicula {
	//preguntar profe si se puede hacer lo del contador estatico

private int idPelicula;
private String pelicula;
private Genero genero;



public Genero getGenero() {
	return genero;
}
public void setGenero(Genero genero) {
	this.genero = genero;
}
public int getIdPelicula() {
	return idPelicula;
}
public void setIdPelicula(int idPelicula) {
	this.idPelicula = idPelicula;
}
public String getPelicula() {
	return pelicula;
}
public void setPelicula(String pelicula) {
	this.pelicula = pelicula;
}




public Pelicula( int idPelicula,String pelicula, Genero genero) {
	super();
	this.idPelicula = idPelicula;
	this.pelicula = pelicula;
	this.genero = genero;
}

@Override
public String toString() {
	return "Pelicula= [idPelicula=" + idPelicula + ", pelicula=" + pelicula + ", genero=" + genero + "]";
}

//preguntar si asi esta bien el equals 


public boolean equals(Pelicula p) {
	return p.getIdPelicula()==(idPelicula) && p.getPelicula().equals(pelicula) && p.getGenero().equals(genero);
}



}