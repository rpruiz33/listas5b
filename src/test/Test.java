package test;

import java.util.ArrayList;
import java.util.List;

import model.Genero;
import model.Incaa;
import model.Pelicula;

public class Test {

	public static void main(String[] args) throws Exception {
		List<Pelicula> lisPeli = new ArrayList<Pelicula>();
		Incaa i=new Incaa(lisPeli);
		Genero g1=new Genero("ficcion");
		Genero g2=new Genero("fantasia");
		Genero g3=new Genero("aventura");
		i.agregarPelicula("aca1", g1);
		i.agregarPelicula("ac2",g2);
		i.agregarPelicula("harry",g3);
		System.out.println( i.traerPelicula(g3));
	}

}
