package map;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> nordeste = new HashMap(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("\t" + nordeste);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        nordeste.put("RN", 3534165);
        System.out.println("\t" + nordeste);

        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione PB - 4.039.277: ");
        if (!nordeste.containsKey("PB")) nordeste.put("PB", 4039277);

        System.out.println("\t" + nordeste);

        System.out.println("\nExiba a população do estado PE: ");
        System.out.println("\t" + nordeste.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> nordeste2 = new LinkedHashMap<>();
        nordeste2.put("PE", 9616621);
        nordeste2.put("AL", 3351543);
        nordeste2.put("CE", 9187103);
        nordeste2.put("RN", 3534165);
        nordeste2.put("PB", 4039277);

        System.out.println("\t" + nordeste2);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> nordeste3 = new TreeMap<>();

        nordeste3.put("PE", 9616621);
        nordeste3.put("AL", 3351543);
        nordeste3.put("CE", 9187103);
        nordeste3.put("RN", 3534165);
        nordeste3.put("PB", 4039277);

        System.out.println("\t" + nordeste3);

        int maiorPopulacao = Collections.max(nordeste.values());
        int menorPopulacao = Collections.min(nordeste.values());

        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";

        for(Map.Entry<String, Integer> entry : nordeste.entrySet()){
            if (entry.getValue() == maiorPopulacao) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue() == menorPopulacao) estadoMenorPopulacao = entry.getKey();
        }

        System.out.println("\n Exiba o estado com o menor população e seu respectivo valor ");
        System.out.println("\t" + estadoMenorPopulacao + " : " + menorPopulacao);

        System.out.println("\nExiba o estado com a maior população e seu respectivo valor: ");
        System.out.println("\t" + estadoMaiorPopulacao + " : " + maiorPopulacao);

        System.out.println("\nExiba a soma da população desses estados: ");
        int soma = 0;

        Iterator<Integer> iterator = nordeste.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\t" + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: ");
        System.out.println("\t" + ((double)soma / (nordeste.size())));

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = nordeste.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println("\t" + nordeste);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        nordeste.clear();
        System.out.println("\t" + nordeste);

        System.out.println("\nConfira se a lista está vazia: ");
        System.out.println("\t" + nordeste.isEmpty());
    }
}


