import java.util.*;

public class Recursividad {

    //Caso repulsivo
    public static void main(String[] args) throws Exception {


        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular el factorial: ");
        int num = read.nextInt();
        System.out.println("El factorial de " + num  + " es: " + factorial(num)); 
        System.out.println("La suma de los numeros hasta " + (num) + " es " + suma(num));
        imprimirNumeros(num);
    }

    //Caso base
    public static int factorial(int num) {
        if(num == 0) {

            return 1;

        } else  {
            return num*factorial(num-1);
        }
    }

    public static int suma(int num) {
        if( num == 0) {
            return 0;
        } else {
            return num + suma(num - 1);
        }
        
    }
    public static void imprimirNumeros(int num) {
        if(num > 0) {
            imprimirNumeros(num - 1);
            System.out.println(num);
        }
    }
}
