package Ex_Associacao;

class Disciplina {
    String nome;
    int cargaHoraria;
    Aluno aluno; // Associação Estrutural de Agregação

    void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Aluno: " + aluno.nome + " matricula: " + aluno.matricula);
    }
}
