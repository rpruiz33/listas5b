package model;

import java.util.ArrayList;
import java.util.List;

import model.Pelicula;

public class Incaa {
	private List <Pelicula> catalogo;

	

	public Incaa() {
		super();
		this.catalogo = new ArrayList<Pelicula>();
	}


public Pelicula traerPeliculaXnombre(String pelicula) {
	int i = 0;
	Pelicula p = null;
	while (i < catalogo.size() && p == null) {
		if (catalogo.get(i).getPelicula().equals(pelicula)) {
			p = catalogo.get(i);
		}
		
		i++;
	}
	return p;
	
}

	public boolean agregarPelicula(String pelicula, Genero genero){
	
		int id=1;
		if (catalogo.size()>0){
			id =catalogo.get(catalogo.size() - 1).getIdPelicula() + 1;
		}
		return catalogo.add(new Pelicula(id, pelicula,genero));

	}

	
	public Pelicula traerPelicula(Genero genero) {
		int i = 0;
		Pelicula p = null;
		while (i < catalogo.size() && p == null) {
			if (catalogo.get(i).getGenero() != genero) {
				p = null;

			} else {
				p = catalogo.get(i);

			}
			i++;
		}
		return p;
	}

	@Override
	public String toString() {
		return "Incaa [catalogo=" + catalogo + ", getCatalogo()=" + ", toString()=" + super.toString()
				+ "]";
	}
	
}





