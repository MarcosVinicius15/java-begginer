package map;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Random dado = new Random();

        List<Integer> listaNumeros = new ArrayList<>();
        Map<Integer, Integer> valores = new HashMap(){{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};

        for (int i=1; i <= 100; i++){
            int lancamento = dado.nextInt(6) + 1;
            listaNumeros.add(lancamento);
            valores.put(lancamento, valores.get(lancamento) + 1);
        }
        System.out.println(listaNumeros);
        System.out.println(valores);
    }
}
