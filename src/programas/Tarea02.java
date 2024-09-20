package programas;
import java.util.Scanner;
public class Tarea02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        int contadorPares = 0;
        System.out.println("Ingresa números para contar los pares "
                + "(0 para terminar):");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
            System.out.println("Ingresa otro número:");
            numero = sc.nextInt();
        }
    System.out.println("Cantidad de números pares ingresados: " + contadorPares);
    }
}
