package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {

		/*
		 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
		 modelo = gol - consumo = 14,4km/l
		 modelo = uno - consumo = 15,6 km/l
		 modelo = mobi - consumo = 16,1 km/l
		 modelo = hb20 - consumo = 14,5 km/l
		 modelo = kwid - consumo = 15,6 km/l
		 */

		//		        Map carrosPopulares2020 = new HashMap(); //antes do java 5
		//		        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
		//		        HashMap<String, Double> carrosPopulares = new HashMap<>();
		//		        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
		
		Map<String, Double> carrosPopulares = new HashMap<String, Double>(){{
			put("Gol", 14.4);
			put("Uno", 15.6);
			put("Mobi", 16.1);
			put("Hb20", 14.5);
			put("Kwid", 15.6);
		}};
		System.out.println(carrosPopulares);

		System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
		carrosPopulares.put("Gol", 15.2);
		System.out.println(carrosPopulares);

		System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("Uno"));

//		System.out.println("Exiba o terceiro modelo adicionado: ");

		System.out.println("Exiba os modelos: ");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);

		System.out.println("Exiba os consumos dos carros: ");
		Collection<Double> consumo = carrosPopulares.values();
		System.out.println(consumo);

		System.out.println("Exiba o modelo mais econômico e seu consumo: ");
		
		Double menorConsumo = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entrySet = carrosPopulares.entrySet();
		String modeloMenorConsumo = "";
		for (Map.Entry<String, Double> entry : entrySet) {
			if (entry.getValue().equals(menorConsumo)) {
				modeloMenorConsumo = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMenorConsumo + " - " + menorConsumo);			
			}
		}
		
		System.out.println("Exiba o modelo menos econômico e seu consumo: ");
		Double piorConsumo = Collections.min(carrosPopulares.values());
		String modeloPiorConsumo = "";
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if(entry.getValue().equals(piorConsumo)) {
				modeloPiorConsumo = entry.getKey();
				System.out.println("Modelo menos eficiente: " + modeloPiorConsumo + " - " + piorConsumo);
			}
		} 
		
		System.out.print("Exiba a soma dos consumos: " );
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0.0;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		
		System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
		
		System.out.println(carrosPopulares);
		System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while (iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) iterator1.remove();
		}
		System.out.println(carrosPopulares);

		System.out.println("Exiba todos os carros na ordem em que foram informados: ");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
			put("Gol", 14.4);
			put("Uno", 15.6);
			put("Mobi", 16.1);
			put("Hb20", 14.5);
			put("Kwid", 15.6);
		}};
		System.out.println(carrosPopulares1);

		System.out.println("Exiba o dicionário ordenado pelo modelo: ");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2);

		System.out.println("Apague o dicionario de carros: ");
		carrosPopulares.clear();
	
		System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
	}

}
