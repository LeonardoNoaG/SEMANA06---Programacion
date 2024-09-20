package programas;
/*
CREAR UN PROGRAMA EN JAVA QUE PERMITA INGRESAR UNA CANTIDAD,
VISUALIZAR EL NUMERO DE DIGITOS DE LA CANTIDAD INGRESADA.
EJEMPLO:
cantidad = 1234
Resultado:
candig = 4
*/
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
        //VARIABLES
        int cantidad, candig;
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("Ingresar una cantidad:");
        cantidad = lectura.nextInt();
        //PROCESO DE DATOS
        candig = 0;
        while(cantidad > 0){
            candig++;
            cantidad = cantidad /10;
        }
        //SALIDA DE DATOS
        System.out.println("La cantidad de digitos es: " + candig);
    }
}
