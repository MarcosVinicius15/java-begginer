package set;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("a) Ordem de Inserção ");
        Set<LinguagemFavorita> minhaLinguagem = new LinkedHashSet<>();
        minhaLinguagem.add(new LinguagemFavorita("Java", 1991, "NetBeans"));
        minhaLinguagem.add(new LinguagemFavorita("Python", 1989, "PyCharm"));
        minhaLinguagem.add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));

        for(LinguagemFavorita linguagemFavorita : minhaLinguagem)
            System.out.println("\t" + linguagemFavorita.getNome() + " - " +
                    linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("\nb) Ordem natural (Nome) ");
        Set<LinguagemFavorita> minhaLinguagem2 = new TreeSet<>(minhaLinguagem);

        for(LinguagemFavorita linguagemFavorita : minhaLinguagem2)
            System.out.println("\t" + linguagemFavorita.getNome() + " - " +
                    linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("\nc) IDE");
        Set<LinguagemFavorita> minhaLinguagem3 = new TreeSet<>(new ComparatorIde());
        minhaLinguagem3.addAll(minhaLinguagem);

        for(LinguagemFavorita linguagemFavorita : minhaLinguagem3)
            System.out.println("\t" + linguagemFavorita.getNome() + " - " +
                    linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("\nd) Ano de criação e nome");
        Set<LinguagemFavorita> minhaLinguagem4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        minhaLinguagem4.addAll(minhaLinguagem);
        minhaLinguagem4.add(new LinguagemFavorita("Go", 1995, "Pycharm"));

        for(LinguagemFavorita linguagemFavorita : minhaLinguagem4)
            System.out.println("\t" + linguagemFavorita.getNome() + " - " +
                    linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("\ne) Nome, ano de criação e IDE");
        Set<LinguagemFavorita> minhaLinguagem5 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        minhaLinguagem5.addAll(minhaLinguagem);

        minhaLinguagem5.add(new LinguagemFavorita("Python", 1940, "VS Code"));
        minhaLinguagem5.add(new LinguagemFavorita("JavaScript", 1995, "Pycharm"));

        for(LinguagemFavorita linguagemFavorita : minhaLinguagem5)
            System.out.println("\t" + linguagemFavorita.getNome() + " - " +
                    linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer anoCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.getNome());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoCriacao = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return l1.getNome().compareTo(l2.getNome());

    }
}

class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        int anoCriacao = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return l1.getIde().compareTo(l2.getIde());
    }
}
