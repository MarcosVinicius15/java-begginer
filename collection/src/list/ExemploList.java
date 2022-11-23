package list;


import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
 //       Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça
   //     List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("\nExiba a poisição da nota 5: ");
        System.out.println(notas.indexOf(5.0));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 esta na lista: " + notas.contains(5.0));

        System.out.println("\nExiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("\nExiba a terceira nota adicionada: " );
        System.out.println(notas.get(2));

        System.out.println("\nExiba a menor nota: ");
        System.out.println("A menor nota é: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " );
        System.out.println("A maior nota é: " + Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: " );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
           Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas será: " + soma);

        System.out.println("\nExiba a média das notas: " );
        System.out.println("A média dsass notas será: " + (soma / notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        /*Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next =iterator1.next();
            if(next < 7) iterator1.remove();
        }*/
        System.out.println(notas);

        /*System.out.println("\n Apague toda a lista");
        notas.clear();
        System.out.println(notas);*/

        System.out.println("\n Confira se a lista esta vazia: " + notas.isEmpty());



//Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("\nCrie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.addAll(notas);
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("A primeira nota da lista é: " + notas2.get(0));
        System.out.println(notas2);


        System.out.println("\nMostre a primeira nota da nova lista removendo-o: ");
        System.out.println("A primeira nota é: " + notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);
    }

}
