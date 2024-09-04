package model;

public class Genero {
private int idGenero;
private String genero;
private static int contador=1;

public int getIdGenero() {
	return idGenero;
}
public void setIdGenero(int idGenero) {
	this.idGenero = idGenero;
}
public String getGenero() {
	return genero;
}
@Override
public String toString() {
	return " [idGenero=" + idGenero + ", genero=" + genero + "]";
}
public void setGenero(String genero) {
	this.genero = genero;
}
public Genero(String genero) {
	super();
	this.idGenero = contador++;
	this.genero = genero;
} 




}
