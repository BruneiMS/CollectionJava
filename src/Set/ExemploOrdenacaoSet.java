package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class ExemploOrdenacaoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ordem aleatório: ");
		Set<Serie> minhasSeries = new HashSet<Serie>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70 show", "comédia", 25));
		}};		 
		for (Serie serie : minhasSeries) System.out.println(serie.getNome() + ", " + serie.getGenero() + ", " + serie.getTempoDeEpsodio());
		System.out.println();
		
		System.out.println("Ordem de inserção: ");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70 show", "comédia", 25));
		}};		 
		for (Serie serie1 : minhasSeries1) System.out.println(serie1.getNome() + ", " + serie1.getGenero() + ", " + serie1.getTempoDeEpsodio());
		System.out.println();
		
		System.out.println("Ordem Natural (TempoDeEpsodio)");
		Set<Serie> minhasSeries2 = new TreeSet<Serie>(minhasSeries1);
		for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + ", " + serie.getGenero() + ", " + serie.getTempoDeEpsodio());
		System.out.println();
		
		System.out.println("Ordenar Nome/Genero/TempoDeEpisodio");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoDeEpisodio());
		minhasSeries3.addAll(minhasSeries);
		for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + ", " + serie.getGenero() + ", " + serie.getTempoDeEpsodio());
		System.out.println();
		
	}

}

