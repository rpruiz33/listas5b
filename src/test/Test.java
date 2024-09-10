package test;

import java.util.ArrayList;
import java.util.List;

import model.Genero;
import model.Incaa;
import model.Pelicula;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Incaa i=new Incaa();
		
		Genero g1=new Genero(1,"ficcion");
		Genero g2=new Genero(2,"fantasia");
		Genero g3=new Genero(3,"aventura");
		i.agregarPelicula("aca1", g2);
		i.agregarPelicula("ac2",g1);
		i.agregarPelicula("harry",g3);
		i.agregarPelicula("222",g3);
		//aca no habria que traer no solo una pelicula sino una lista copn las pelis de ese genero
		System.out.println("traer pelicula por genero----\n");
      System.out.println( i.traerPelicula(g1).toString());
		System.out.println( i.traerPelicula(g2).toString());
		System.out.println( i.traerPelicula(g3).toString());
		System.out.println("traer pelicula por nombre----\n");
		  System.out.println( i.traerPeliculaXnombre("aca1").toString());
			System.out.println( i.traerPeliculaXnombre("ac2").toString());
			System.out.println( i.traerPeliculaXnombre("harry").toString());
	}

}
