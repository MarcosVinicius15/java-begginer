package Ex_Associacao;

class Compra {
    double valor;
    String comprador;

    void finalizar(Cupom cupom){
        double valorFinal = (1 - cupom.desconto/100) * valor;
        System.out.println("Sua compra de " + valor + " foi finalizada por " + valorFinal + " após os descontos");
    }
}
