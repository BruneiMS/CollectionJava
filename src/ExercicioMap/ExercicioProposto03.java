package ExercicioMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informa��es  de id e contato, crie um dicion�rio e
ordene este dicion�rio exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
 */
public class ExercicioProposto03 {

	public static void main(String[] args) {
		System.out.println("--\tOrdem aleat�ria\t--");
		Map<Integer, Contato> agenda = new HashMap<>() {{
			put(1, new Contato("Br�nei", 98217));
			put(4, new Contato("Juliane", 98110));
			put(3, new Contato("Gabriel", 6787));
			put(6, new Contato("Gabriele", 6403));
		}};
		System.out.println(agenda);
		for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println();

		System.out.println("--\tOrdem Inser��o\t--");
		Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
			put(1, new Contato("Br�nei", 98217));
			put(4, new Contato("Juliane", 98110));
			put(3, new Contato("Gabriel", 6787));
			put(6, new Contato("Gabriele", 6403));
		}};
		System.out.println(agenda1);
		for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println();

		System.out.println("--\tOrdem id\t--");
		Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
		System.out.println(agenda2);
		for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println();

		System.out.println("--\tOrdem n�mero telefone\t--");
		//precisamos organizar os valores. Logo:
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
		set.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry: set) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
					": " +entry.getValue().getNome());
		}

		System.out.println();

		System.out.println("--\tOrdem nome contato\t--");
		//precisamos organizar os valores. Logo:
		Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
		set1.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry: set1) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
	}
}
