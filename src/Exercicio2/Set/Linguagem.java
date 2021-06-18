package Exercicio2.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Linguagem {
	public static void main(String[] args) {

		Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
		minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
		minhasLinguagensFavoritas.add(new LinguagemFavorita("CSS 3", 2010, "Visual Studio Code"));
		minhasLinguagensFavoritas.add(new LinguagemFavorita("HTML5", 1995, "VS Code"));


		System.out.println("--------\tOrdem de Inserção\t--------");
		Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
				Arrays.asList(
						new LinguagemFavorita("Java", 1991, "Eclipse"),
						new LinguagemFavorita("CSS 3", 2010, "Visual Studio Code"),
						new LinguagemFavorita("HTML5", 2008, "VS Code")

						)
				);
		for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);

		System.out.println("--------\tOrdem Natural: Nome\t--------");
		Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
		for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);

		System.out.println("--------\tOrdem IDE\t--------");
		Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
		minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
		for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem);

		System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
		Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
		minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
		for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

		System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
		Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
		minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
		for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);

	}
}
