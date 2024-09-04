package model;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	private List <Pelicula> catalogo;

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	public Incaa(List<Pelicula> catalogo) {
		super();
		this.catalogo = catalogo;
	}




	public boolean agregarPelicula(String pelicula, Genero genero)throws Exception {
		int i=0;
		while(i<catalogo.size()) {
			if(catalogo.get(i).getPelicula().equals(pelicula)) {
				throw new Exception("la pelicula ya existe");	
			}
			i++;
		}
		Pelicula p=new Pelicula(pelicula,genero);
		return catalogo.add(p);
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


	
}





