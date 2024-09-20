package programas;
import java.util.Scanner;
public class Tarea01 {
    public static void main(String[] args){
        int numero, suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número positivo para sumar "
                + "(negativo para terminar):");
        numero = sc.nextInt();
        suma = 0;
        while (numero >= 0) {
            suma += numero;
            System.out.println("Suma actual: " + suma);
            System.out.println("Ingresa otro número:");
            numero = sc.nextInt();
        }
        System.out.println("La suma total es: " + suma);
    }
}
