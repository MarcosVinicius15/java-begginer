package Ex_Associacao;

class Pessoa {
    String nome;
    int idade;
    Endereco endereco;//Associação Estrutural de composição

    void mostrarEndereco(){
        System.out.println(endereco.rua);
        System.out.println(endereco.cidade);
        System.out.println(endereco.estado);
    }
}
