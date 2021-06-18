package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Detetive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String>evidencias = new ArrayList<String>();

		System.out.println("Responda as Perguntas com s/n: ");
		System.out.print("\nTelefonou para a vítima? ");
		String resposta = sc.next();
		evidencias.add(resposta.toLowerCase());
		System.out.print("Esteve no local do crime? ");
		String resposta2 = sc.next();
		evidencias.add(resposta2.toLowerCase());
		System.out.print("Mora perto da vítima? ");
		String resposta3 = sc.next();
		evidencias.add(resposta3.toLowerCase());
		System.out.print("Devia para a vítima? ");
		String resposta4 = sc.next();
		evidencias.add(resposta4.toLowerCase());
		System.out.print("Trabalhou para a vítima? ");
		String resposta5 = sc.next();
		evidencias.add(resposta5.toLowerCase());

		System.out.println(evidencias);
		System.out.println();

		int cont = 0;
		Iterator<String> contador = evidencias.iterator();
		while(contador.hasNext()) {
			String resp = contador.next();
			if(resp.contains("s")) {
				cont ++;
			}
		}

		switch (cont) {
		case 2: 
			System.out.println(">> SUSPEITO <<"); break;
		case 3: 
		case 4:
			System.out.println(">> CÚMPLICE <<"); break;
		case 5:
			System.out.println(">> ASSASSINO <<"); break;
		default:
			System.out.println(">> INOCENTE <<"); break;

		}
	}
}
