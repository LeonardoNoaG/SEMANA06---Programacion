package programas;
/*
CREAR UN PROGRAMA EN JAVA QUE PERMITA INGRESAR UNA CANTIDAD,
VISUALIZAR EL DIGITO MAYOR, LA CANTIDAD DE DIGITOS IMPARES Y LA
SUMA DE DIGITOS PARES.
EJEMPLO:
cantidad = 78952
Resultados:
dmay = 9
dimp = 3
sdpares = 10
 */
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args){
        //VARIABLES
        int cantidad, dmay, cdimp, sdpares, r, dig;
        Scanner lectura = new Scanner(System.in);
        //ENTRADA
        System.out.print("Ingresar una cantidad");
        cantidad = lectura.nextInt();
        //PROCESO
        dmay = 0;
        cdimp = 0;
        sdpares = 0;
        while(cantidad > 0){
            dig = cantidad % 10;
            if (dig > dmay){
                dmay = dig;
            }
            r = dig % 2;
            if (r == 0){
                sdpares+=dig;
            }else{
                cdimp++;
            }
            cantidad = cantidad / 10;
        }
        //SALIDA
        System.out.println("El digito mayor es: " + dmay);
        System.out.println("La cantidad de digitos impares es: " + cdimp);
        System.out.println("La suma de digitos pares es: " + sdpares);
    }
}
