package list;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio2_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.print("Telefonou para a vítima? [S/N] ");
        respostas.add(scan.next());

        System.out.print("\nEsteve no local do crime? [S/N] ");
        respostas.add(scan.next());

        System.out.print("\nMora perto da vítima? [S/N] ");
        respostas.add(scan.next());

        System.out.print("\nDevia para a vítima? [S/N] ");
        respostas.add(scan.next());

        System.out.print("\nJá trabalhou com a vítima? [S/N] ");
        respostas.add(scan.next());

        System.out.println(respostas);

        Iterator<String> iterator = respostas.iterator();
        int count = 0;
        while (iterator.hasNext()){
            if (iterator.next().equalsIgnoreCase("s")) count += 1;
        }

        switch (count){
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
        }
    }
}
