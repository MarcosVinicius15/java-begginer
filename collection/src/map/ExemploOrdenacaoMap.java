package map;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livros : meusLivros.entrySet()){
            System.out.println("\t" + livros.getKey() + " - " + livros.getValue().getNome());
        }


        System.out.println("\n--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>();
        meusLivros2.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivros2.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivros2.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

        for (Map.Entry<String, Livro> livros : meusLivros2.entrySet()){
            System.out.println("\t" + livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("\n--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros3 = new TreeMap<>();
        meusLivros3.putAll(meusLivros2);

        for (Map.Entry<String, Livro> livros : meusLivros3.entrySet())
            System.out.println("\t" + livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("\n--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivrosSet = new TreeSet<>(new ComparatorNome());
        meusLivrosSet.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livros : meusLivrosSet)
            System.out.println("\t" + livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("\n--\tOrdem número de página\t--"); //Pra você
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livros : meusLivros4)
            System.out.println("\t" + livros.getKey() + " - " + livros.getValue().getNome() + " - " + livros.getValue().getPaginas());


    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}
