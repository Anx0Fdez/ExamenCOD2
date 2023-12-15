import java.util.Random;
import java.util.Scanner;

/**
 * @author Anx0Fdez
 * @version 1.0
 *
 */

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Singleton miUnicaInstancia = Singleton.getInstance();
        System.out.println("Introduce tu nombre: ");
        miUnicaInstancia.setAlias(sc.nextLine());
        System.out.println("Bien, "+miUnicaInstancia.getAlias()+ ", las reglas son:");
        System.out.println("Adivinar un numero aleatorio del 1 al 10");
        System.out.println("Tienes dos intentos");
        System.out.println("Una partida tendrá 10 rondas");
        System.out.println("¡COMIENZAAA!");
        miUnicaInstancia.setNumeroAleatorio(random.nextInt(10)+1);
        miUnicaInstancia.setNumeroPropuesto(sc.nextInt());


    }
}

