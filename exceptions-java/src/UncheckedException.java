import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada Inválida!!\n " +
                        "Informe um número inteiro! " + e.getMessage());
            } catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0. ");
            }finally {
                System.out.println("Cegou no finally!");
            }
        }while (continueLooping);

        System.out.println("O código continua...");
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}
