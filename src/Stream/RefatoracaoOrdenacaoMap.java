package Stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import ExercicioMap.Contato;

public class RefatoracaoOrdenacaoMap {
	public static void main(String[] args) {
//		System.out.println("--\tOrdem aleatória\t--");
		Map<Integer, Contato> agenda = new HashMap<>() {{
			put(1, new Contato("Brúnei", 98217));
			put(4, new Contato("Juliane", 98110));
			put(3, new Contato("Gabriel", 6787));
			put(6, new Contato("Gabriele", 6403));
		}};
//		System.out.println(agenda);
//		for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
//			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
//		}
//
//		System.out.println();

//		System.out.println("--\tOrdem Inserção\t--");
		Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
			put(1, new Contato("Brúnei", 98217));
			put(4, new Contato("Juliane", 98110));
			put(3, new Contato("Gabriel", 6787));
			put(6, new Contato("Gabriele", 6403));
		}};
//		System.out.println(agenda1);
//		for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
//			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
//		}
//
//		System.out.println();
//
//		System.out.println("--\tOrdem id\t--");
//		Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
//		System.out.println(agenda2);
//		for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
//			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
//		}
//
//		System.out.println();

		//utilizando o Stream 
		System.out.println("--\tOrdem número telefone\t--");
		//precisamos organizar os valores. Logo:
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {

			@Override
			public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
				return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
			}
		});
				
		set.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry: set) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
					": " +entry.getValue().getNome());
		}

		System.out.println();

		//utilizando o Stream 
		System.out.println("--\tOrdem nome contato\t--");
		
		//sem lambrida
//		Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, String>() {
//
//			@Override
//			public String apply(Entry<Integer, Contato> t) {
//				// TODO Auto-generated method stub
//				return t.getValue().getNome();
//			}
//		}));
		
		//com lambrida
		Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing( contato -> contato.getValue().getNome()));
				
		set1.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry: set1) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
	}
}
