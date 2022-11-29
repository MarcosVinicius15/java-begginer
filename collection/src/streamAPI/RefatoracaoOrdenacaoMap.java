package streamAPI;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

import java.util.*;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("\n---\tOrdem Aleatória\t---");
        Map<Integer, Contato> meusContatos = new HashMap(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println("\t" + meusContatos);

        System.out.println("\n---\tOrdem Inserção\t---");
        Map<Integer, Contato> meusContatos2 = new LinkedHashMap<>();

        meusContatos2.put(1, new Contato("Simba", 2222));
        meusContatos2.put(4, new Contato("Cami", 5555));
        meusContatos2.put(3, new Contato("Jon", 1111));

        System.out.println("\t" + meusContatos2);

        System.out.println("\n---\tOrdem id\t---");
        Map<Integer, Contato> meusContatos3 = new TreeMap<>();
        meusContatos3.putAll(meusContatos);

        System.out.println("\t" + meusContatos3);

        System.out.println("\n---\tOrdem número telefone\t---");

        /*Set<Map.Entry<Integer, Contato>> meusContatos4 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });*///Classe Anônima

        /*Set<Map.Entry<Integer, Contato>> meusContatos4 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));*///Interface Funcional

        Set<Map.Entry<Integer, Contato>> meusContatos4 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero())); //Lambda

        meusContatos4.addAll(meusContatos.entrySet());

        System.out.println("\t" + meusContatos4);

        System.out.println("\n---\tOrdem nome contato\t---");
        //Set<Map.Entry<Integer, Contato>> meusContatos5 = new TreeSet<>(new ComparatorNomeContato());

        /*Set<Map.Entry<Integer, Contato>> meusContatos5 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                int nome = cont1.getValue().getNome().compareTo(cont2.getValue().getNome());
                if (nome != 0) return nome;

                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });*/ // Classe Anônima

        Set<Map.Entry<Integer, Contato>> meusContatos5 = new TreeSet<>(Comparator.comparing(
               cont -> cont.getValue().getNome())); //lambda


       meusContatos5.addAll(meusContatos.entrySet());

       System.out.println("\t" + meusContatos5);
    }
}

class Contato {
    private String nome;

    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}

/*class ComparatorNumero implements Comparator<Map.Entry<Integer, Contato>>{
    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
}*/

class ComparatorNomeContato implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        int nome = c1.getValue().getNome().compareTo(c2.getValue().getNome());
        if (nome !=0) return nome;

        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
}
