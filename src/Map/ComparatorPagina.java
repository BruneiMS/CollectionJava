package Map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
	}
}