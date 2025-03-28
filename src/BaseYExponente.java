import java.util.*;


public class BaseYExponente {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digita la base: ");
        int base = read.nextInt();

        System.out.println("Digita el exponente: ");
        int expo = read.nextInt();
        System.out.println("La potencia es: " + potencia(base, expo));
    }

    public static int potencia(int base, int exponente) {
       if(exponente == 0) {
        return 1;
       } else {
        return base * potencia(base, exponente - 1);
       }
    }
}
