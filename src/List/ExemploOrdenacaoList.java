package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
	public static void main(String[] args) {

		List<Gato> gatos = new ArrayList<Gato>() {{
			add(new Gato("Jonh", 18, "preto"));
			add(new Gato("Simba", 6, "tigrado"));
			add(new Gato("Jonh", 12, "amarelo"));
		}};
		
		System.out.println(gatos);
		
		System.out.println("Ordem aleatório");
		Collections.shuffle(gatos);
		System.out.println(gatos);
		
		System.out.println("Ordem Natural (nome)");
		Collections.sort(gatos);
		System.out.println(gatos);
		
		System.out.println("Ordem Idade");
		Collections.sort(gatos, new ComparatorIdade());
		System.out.println(gatos);
		
		System.out.println("Ordem Cor");
		gatos.sort(new ComparatorCor());
		System.out.println(gatos);
		
		System.out.println("Ordenar Nome/Cor/Idade");
		//Collections.sort(gatos, new ComparatorNomeCorIdade());
		gatos.sort(new ComparatorNomeCorIdade());
		System.out.println(gatos);
	}
}

class Gato implements Comparable<Gato>{
	private String nome;
	private int idade;
	private String cor;
	
	public Gato(String nome, int idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
}

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if(cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}