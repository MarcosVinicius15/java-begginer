package Ex_Polimorfismo_Sobrescrita;

public class RodarAplicacao {
    public static void main(String[] args) {
        ClasseMae classeMae = new ClasseMae();
        ClasseMae classe = new ClasseFilha1();
        ClasseMae classe2 = new ClasseFilha2();
        classe.metodo1();//Polimorfismo (tipo e metodo)
        classe2.metodo1();//Polimorfismo (tipo e metodo)
        classeMae.metodo1();// Não há polimorfismo

        ClasseFilha1 classeFilha1 = new ClasseFilha1();
        ClasseFilha2 classeFilha2 = new ClasseFilha2();

        classeFilha1.metodo1();//Sobrescrita
        classeFilha2.metodo1();//Sobrescrita
        classeMae.metodo1();//Não há sobrescrita
    }
}
