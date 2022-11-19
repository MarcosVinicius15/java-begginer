package Ex_Upcast_Downcast;

public class Testando {
    public static void main(String[] args) {
        Funcionario marcos = new Funcionario();
        System.out.println(marcos.getClass());

        marcos = new Vendedor();
        System.out.println(marcos.getClass());

        Gerente vinicius = (Gerente) new Funcionario();
        System.out.println(vinicius.getClass());
    }
}
