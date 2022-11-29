

public class DivisaoNaoExataException extends Exception{

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String s, int numerador, int denominador) {
        super(s);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
