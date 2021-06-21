package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
	public static void main(String[] args) {

/*Dadas as seguintes informa��es sobre meus livros favoritos e seus autores,
	crie um dicion�rio e ordene este dicion�rio:
	exibindo (Nome Autor - Nome Livro);
	Autor = Hawking, Stephen  - Livro = nome: Uma Breve Hist�ria do Tempo. p�ginas: 256
	Autor = Duhigg, Charles - Livro = nome: O Poder do H�bito, paginas: 408
	Autor = Harari, Yuval Noah  - Livro = 21 Li��es Para o S�culo 21, p�ginas: 432
*/		
		
		
        System.out.println("--\tOrdem aleat�ria\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma Breve Hist�ria do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do H�bito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Li��es Para o S�culo 21", 432));
            put(" J.K. Rowling", new Livro("Harry Potter e a c�mara secreta", 224));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
        
        System.out.println("--\tOrdem Inser��o\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma Breve Hist�ria do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do H�bito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Li��es Para o S�culo 21", 432));
            put(" J.K. Rowling", new Livro("Harry Potter e a c�mara secreta", 224));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
        
        System.out.println("--\tOrdem alfab�tica autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
                
        System.out.println("--\tOrdem alfab�tica nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println();
        
        System.out.println("--\tOrdem n�mero de p�gina\t--"); //Pra voc�
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro1 : meusLivros4)
        System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome() + " - " + livro1.getValue().getPaginas());
    }
}