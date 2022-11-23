package list;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio1_List2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<TemperaturaSemestre> temperatura = new ArrayList<>();

        temperatura.add(new TemperaturaSemestre("Janeiro", 25.5));
        temperatura.add(new TemperaturaSemestre("Fevereiro", 18.7));
        temperatura.add(new TemperaturaSemestre("Março", 32.2));
        temperatura.add(new TemperaturaSemestre("Abril", 25.8));
        temperatura.add(new TemperaturaSemestre("Maio", 35.0));
        temperatura.add(new TemperaturaSemestre("Junho", 10.5));

        /*System.out.print("Digite a temperatura média do mês de janeiro: ");
        temperatura.add(new TemperaturaSemestre("Janeiro", scan.nextDouble()));

        System.out.print("\nDigite a temperatura média do mês de fevereiro: ");
        temperatura.add(new TemperaturaSemestre("Fevereiro", scan.nextDouble()));

        System.out.print("\nDigite a temperatura média do mês de março: ");
        temperatura.add(new TemperaturaSemestre("Março", scan.nextDouble()));

        System.out.print("\nDigite a temperatura média do mês de abril: ");
        temperatura.add(new TemperaturaSemestre("Abril", scan.nextDouble()));

        System.out.print("\nDigite a temperatura média do mês de maio: ");
        temperatura.add(new TemperaturaSemestre("Maio", scan.nextDouble()));

        System.out.print("\nDigite a temperatura média do mês de junho: ");
        temperatura.add(new TemperaturaSemestre("Junho", scan.nextDouble()));*/

        System.out.println(temperatura);

        Iterator<TemperaturaSemestre> iterator = temperatura.iterator();
        Double somaTemperatura = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next().getTemperatura();
            somaTemperatura += next;
        }

        System.out.println("\nA soma das temperaturas é: " + somaTemperatura);

        Double mediaTemperatura = somaTemperatura / temperatura.size();

        System.out.println("A média das temperaturas é de: " + mediaTemperatura);

        System.out.println("\nAs temperaturas acima da média são: ");
        Iterator<TemperaturaSemestre> iterator2 = temperatura.iterator();
        while (iterator2.hasNext()) {
            TemperaturaSemestre next = iterator2.next();
            if(next.getTemperatura() > mediaTemperatura)
                System.out.println("\t" + (temperatura.indexOf(next)+1) + " - " + next.getMes() + " : " + next.getTemperatura());
        }

    }


}

class TemperaturaSemestre {
    private String mes;
    private Double temperatura;

    public TemperaturaSemestre(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        //return String.format("{mes: \'%s\', temperatura: %.2f}", mes, temperatura);
        return "{mes: \'" + mes + "\', temperatura: " + temperatura + "}";
    }

}
