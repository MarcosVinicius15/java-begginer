package list;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.*;

public class Exercicio1_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> temperatura = new ArrayList<>();
        List<String> mes = new ArrayList(){{
            add("Janeiro");
            add("Fevereiro");
            add("Março");
            add("Abril");
            add("Maio");
            add("Junho");
        }};

        temperatura.add(25.5);
        temperatura.add(18.7);
        temperatura.add(32.2);
        temperatura.add(25.8);
        temperatura.add(35.0);
        temperatura.add(10.5);

        /*System.out.print("Digite a temperatura média do mês de janeiro: ");
        temperatura.add(scan.nextDouble());

        System.out.print("\nDigite a temperatura média do mês de fevereiro: ");
        temperatura.add(scan.nextDouble());

        System.out.print("\nDigite a temperatura média do mês de março: ");
        temperatura.add(scan.nextDouble());

        System.out.print("\nDigite a temperatura média do mês de abril: ");
        temperatura.add(scan.nextDouble());

        System.out.print("\nDigite a temperatura média do mês de maio: ");
        temperatura.add(scan.nextDouble());

        System.out.print("\nDigite a temperatura média do mês de junho: ");
        temperatura.add(scan.nextDouble());*/

        System.out.println(temperatura);

        Double somaTemperatura = 0.0;
        Iterator<Double> iterator = temperatura.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            somaTemperatura += next;
        }

        System.out.println("\nA soma das temperaturas é: " + somaTemperatura);

        Double mediaTemperatura = somaTemperatura / temperatura.size();
        System.out.println(String.format("\nA média das temperaturas é: %.2f", mediaTemperatura));

        System.out.println("\nAs temperaturas acima da média são: ");
        Iterator<Double> iterator2 = temperatura.iterator();
        int indice = 0;
        while (iterator2.hasNext()){
            double next = iterator2.next();
            if(next > mediaTemperatura) System.out.println((indice+1) + " - " + mes.get(indice) + " : " + next);
            indice ++;
        }
    }
}
