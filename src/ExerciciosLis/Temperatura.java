package ExerciciosLis;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Temp> temp = new ArrayList<Temp>();

		System.out.println("A previa de temperaura vai ser de quantos meses? ");
		Integer n = sc.nextInt();

		double soma = 0.0;
		for(int i=1; i<=n; i++) {
			System.out.print("Qual é o " + i + " Mês? ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Qual foi a temperatura: ");
			Double graus = sc.nextDouble();

			temp.add(new Temp(nome, graus));
			
			soma += graus;
		}
		
		double mediaTemp = soma/temp.size();
		
		System.out.println();
		System.out.println("Temperatura: ");
		for (Temp temp2 : temp) System.out.println(temp2);
				
		System.out.println();
		
		System.out.println("A média da temperatura nesses meses foi de: " + mediaTemp);
			
		sc.close();
	}
}
class Temp {
	private String nome;
	private Double graus;

	public Temp(String nome, Double graus) {
		super();
		this.nome = nome;
		this.graus = graus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getGraus() {
		return graus;
	}

	public void setGraus(Double graus) {
		this.graus = graus;
	}

	@Override
	public String toString() {
		return "Mes= " + nome + ", temp= " + graus;
	}
}
