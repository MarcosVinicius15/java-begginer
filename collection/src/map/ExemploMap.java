package map;

import java.util.Collections;

import java.util.*;

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

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("gol", 14.4);
        carrosPopulares.put("uno", 15.6);
        carrosPopulares.put("mobi", 16.1);
        carrosPopulares.put("hb20", 14.5);
        carrosPopulares.put("kwid", 15.6);

        System.out.println("\t" + carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println("\t" + carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: ");
        System.out.println("\t" + carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: ");
        System.out.println("\t" + carrosPopulares.get("uno"));

//        System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("\t" + modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("\t" + consumos);

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double melhorConsumo = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMelhorConsumo = "";

        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(melhorConsumo)){
                modeloMelhorConsumo = entry.getKey();
                System.out.println("\tModelo mais eficiente: " + modeloMelhorConsumo + " - " + melhorConsumo);
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo: " );
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String modeloPiorConsumo = "";

        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(piorConsumo)){
                modeloPiorConsumo = entry.getKey();
                System.out.println("\t" + modeloPiorConsumo + " - " + piorConsumo);
            }
        }

        System.out.println("\nExiba a soma dos consumos: " );
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\t" + soma);

        System.out.println("\nExiba a média dos consumos deste dicionário de carros: ");
        System.out.println("\t" + (soma/carrosPopulares.size()));

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() == 15.6) iterator1.remove();
        }
        System.out.println("\t" + carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};//Ordenado de acordo com a ordem de inserção
        System.out.println("\t" + carrosPopulares2);

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);//Ordenado de acordo com as chaves

        System.out.println("\t" + carrosPopulares3);

        System.out.println("\nApague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println("\t" + carrosPopulares);

        System.out.println("\nConfira se o dicionário está vazio: ");
        System.out.println("\t" + carrosPopulares.isEmpty());

    }
}
