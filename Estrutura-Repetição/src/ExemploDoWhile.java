import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando");

        do{

            System.out.println("Tocando...");
        }while(Tocando());

        System.out.println("Alô !!! " + "Pode falar!");
    }
    public static boolean Tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ?" + atendeu);

        return ! atendeu;
    }
        
    }
