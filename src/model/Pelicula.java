package model;

public class Pelicula {
	//preguntar profe si se puede hacer lo del contador estatico
private static int contador=1;
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




public Pelicula( String pelicula, Genero genero) {
	super();
	this.idPelicula = contador++;
	this.pelicula = pelicula;
	this.genero = genero;
}

@Override
public String toString() {
	return "Pelicula= [idPelicula=" + idPelicula + ", pelicula=" + pelicula + ", genero=" + genero + "]";
}
public boolean equals(Pelicula p) {
	return p.getPelicula()== pelicula ;
}

}
