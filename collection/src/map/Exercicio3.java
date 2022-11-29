package map;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("\n---\tOrdem Aleatória\t---");
        Map<Integer, map.Contato> meusContatos = new HashMap(){{
            put(1, new map.Contato("Simba", 2222));
            put(4, new map.Contato("Cami", 5555));
            put(3, new map.Contato("Jon", 1111));
        }};
        System.out.println("\t" + meusContatos);

        System.out.println("\n---\tOrdem Inserção\t---");
        Map<Integer, map.Contato> meusContatos2 = new LinkedHashMap<>();

        meusContatos2.put(1, new map.Contato("Simba", 2222));
        meusContatos2.put(4, new map.Contato("Cami", 5555));
        meusContatos2.put(3, new map.Contato("Jon", 1111));

        System.out.println("\t" + meusContatos2);

        System.out.println("\n---\tOrdem id\t---");
        Map<Integer, map.Contato> meusContatos3 = new TreeMap<>();
        meusContatos3.putAll(meusContatos);

        System.out.println("\t" + meusContatos3);

        System.out.println("\n---\tOrdem número telefone\t---");
        Set<Map.Entry<Integer, map.Contato>> meusContatos4 = new TreeSet<>(new map.ComparatorNumero());
        meusContatos4.addAll(meusContatos.entrySet());

        System.out.println("\t" + meusContatos4);

        System.out.println("\n---\tOrdem nome contato\t---");
        Set<Map.Entry<Integer, map.Contato>> meusContatos5 = new TreeSet<>(new map.ComparatorNomeContato());
        meusContatos.put(7, new map.Contato("Cami", 3333));

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

class ComparatorNumero implements Comparator<Map.Entry<Integer, map.Contato>>{
    @Override
    public int compare(Map.Entry<Integer, map.Contato> c1, Map.Entry<Integer, map.Contato> c2) {
        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
}

class ComparatorNomeContato implements Comparator<Map.Entry<Integer, map.Contato>> {

    @Override
    public int compare(Map.Entry<Integer, map.Contato> c1, Map.Entry<Integer, map.Contato> c2) {
        int nome = c1.getValue().getNome().compareTo(c2.getValue().getNome());
        if (nome !=0) return nome;

        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
}
