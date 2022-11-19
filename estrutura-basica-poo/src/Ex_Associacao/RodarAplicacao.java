package Ex_Associacao;

public class RodarAplicacao {
    public static void main(String[] args) {
        //
        Pessoa marcos = new Pessoa();
        Endereco endMarcos = new Endereco();

        endMarcos.rua = "Rua sagrada familia";
        endMarcos.cidade = "São Paulo";
        endMarcos.estado = "SP";


        marcos.nome = "Marcos";
        marcos.endereco = endMarcos;

        marcos.mostrarEndereco();

        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+\n");

        Disciplina matematica = new Disciplina();
        Aluno vinicius = new Aluno();

        vinicius.nome = "Vinicius";
        vinicius.matricula = "124564789";

        matematica.cargaHoraria = 100;
        matematica.nome = "Matematica Financeira";
        matematica.aluno = vinicius;

        matematica.mostrarInformacoes();

        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+\n");

        Cupom cupom = new Cupom();
        cupom.desconto = 30;

        Compra celular = new Compra();

        celular.valor = 1500;
        celular.comprador = "Jose";

        celular.finalizar(cupom);


    }


}
