package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
	public static void main(String[] args) {

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
	crie um dicionário e ordene este dicionário:
	exibindo (Nome Autor - Nome Livro);
	Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
	Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
	Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/		
		
		
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            put(" J.K. Rowling", new Livro("Harry Potter e a câmara secreta", 224));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
        
        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            put(" J.K. Rowling", new Livro("Harry Potter e a câmara secreta", 224));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
        
        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
                
        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
        
        System.out.println("--\tOrdem número de página\t--"); //Pra você
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro1 : meusLivros4)
        System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome() + " - " + livro1.getValue().getPaginas());
    }
}