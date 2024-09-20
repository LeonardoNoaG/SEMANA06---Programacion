package programas;
/*
CREAR UN PROGRAMA QUE PERMITA INGRESAR UNA CANTIDAD,
VISUALIZAR LA CANTIDAD INVERTIDA.
EJEMPLO:
cantidad = 123
caninv = 321
 */
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        // VARIABLES
        int cantidad, caninv, dig;
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("Ingresar una cantidad: ");
        cantidad = lectura.nextInt();
        //PROCESO DE DATOS
        caninv = 0;
        dig = 0;
        while(cantidad > 0){
            dig = cantidad%10;
            caninv = (caninv * 10) + dig;
            cantidad = cantidad / 10;
        }
        //SALIDA
        System.out.println("La cantidad invertida es: " + caninv);
    }
}
