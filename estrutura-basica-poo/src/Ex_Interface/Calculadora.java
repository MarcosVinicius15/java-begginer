package Ex_Interface;

class Calculadora implements OperacaoMatematica{

    @Override
    public void somar(double valor1, double valor2){
        System.out.println("A soma é " + (valor1 + valor2) );
    }

    @Override
    public void subtrair(double valor1, double valor2){
        System.out.println("A subtração é " + (valor1 - valor2) );
    }

    @Override
    public void multiplicar(double valor1, double valor2){
        System.out.println("A multiplicação é " + (valor1 * valor2) );
    }

    @Override
    public void dividir(double valor1, double valor2){
        System.out.println("A divisão é " + (valor1/valor2));
    }
}
