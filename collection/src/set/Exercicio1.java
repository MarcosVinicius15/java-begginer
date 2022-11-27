package set;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada; **
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();
        cores.add("azul");
        cores.add("verde");
        cores.add("vermelho");
        cores.add("amarelo");
        cores.add("preto");
        cores.add("laranja");
        cores.add("branco");
        cores.add("rosa");
        cores.add("roxo");
        cores.add("cinza");

        System.out.println("a) Exiba todas as cores o arco-íris uma abaixo da outra:");
        System.out.println("\t" + cores);

        System.out.println("\nb) A quantidade de cores que o arco-íris tem:");
        System.out.println("\t" + cores.size());

        System.out.println("\nc) Exiba as cores em ordem alfabética:");
        Set<String> cores2 = new TreeSet<>();
        cores2.addAll(cores);
        System.out.println("\t" + cores2);

        System.out.println("\nd) Exiba as cores na ordem inversa da que foi informada:");
        Set<String> cores3 = new LinkedHashSet(){{
            add("azul");
            add("verde");
            add("vermelho");
            add("amarelo");
            add("preto");
            add("laranja");
            add("branco");
            add("rosa");
            add("roxo");
            add("cinza");
        }};
        List<String> cores3Invertida = new ArrayList<>(cores3);
        Collections.reverse(cores3Invertida);
        System.out.println("\t" + cores3Invertida);

        System.out.println("\ne) Exiba todas as cores que começam com a letra ”v”:");

        Iterator<String> iterator = cores.iterator();

        while (iterator.hasNext()){
            String cor = iterator.next();
            if (cor.startsWith("v")) System.out.println("\t" + cor);
        }

        System.out.println("\nf) Remova todas as cores que não começam com a letra “v”:");
        Set<String> cores4 = new HashSet<>(cores3);
        Iterator<String> iterator1 = cores4.iterator();
        while (iterator1.hasNext()){
            String cor = iterator1.next();
            if (cor.charAt(0) == 'v') iterator1.remove();
        }

        System.out.println("\t" + cores4);

        System.out.println("\ng) Limpe o conjunto:");
        cores4.clear();
        System.out.println("\t" + cores4);

        System.out.println("\nh) Confira se o conjunto está vazio: " + cores4.isEmpty());
    }
}
