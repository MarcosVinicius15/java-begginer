public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("HB20", "Preto", 50);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Capacidade do Tanque: " + carro.getCapacidadeTanque());
        System.out.println("Você precisará de " + carro.ValorTotalEncherTanque(4.15) + " reais para encher o tanque.");

        carro.setCor("Azull");
        System.out.println("Cor: " + carro.getCor());

        carro.setModelo("Corolla");
        System.out.println("Modelo: " + carro.getModelo());

        carro.setCapacidadeTanque(34);
        System.out.println("Capacidade do Tanque: " + carro.getCapacidadeTanque());
        System.out.println("Você precisará de " + carro.ValorTotalEncherTanque(4.15) + " reais para encher o tanque.");
    }
}