package programas;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String[] args) {
    int numeroSecreto = (int) (Math.random() * 100 + 1);
    int intento;
    Scanner sc = new Scanner(System.in);
    System.out.println("Adivina el número entre 1 y 100:");
    while (true){
        intento = sc.nextInt();
        if (intento == numeroSecreto) {
            System.out.println("¡Felicidades! Adivinaste el número.");
            break;
        } else if (intento > numeroSecreto) {
            System.out.println("El número es más pequeño, intenta de nuevo:");
        } else {
            System.out.println("El número es más grande, intenta de nuevo:");
        }
      }
   }
}