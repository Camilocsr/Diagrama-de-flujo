package cuentas;
import java.util.Scanner;

/**
 *
 * @author /CSR/
 */
public class Cuentas {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int fin = 0;
        float one,suma= 0;
        String nombre;
        
        System.out.println("Hola bienvenido al programa, Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el numero de cuentas bancarias que tiene a su nombre señor : " + nombre);
        fin = entrada.nextInt();

        for(int i=1;i<=fin;i++) {
            System.out.println("Valor de cuenta numero " + i);
            one = entrada.nextInt();
            suma = suma + one;
        }
        System.out.println("Señor " + nombre+ " En sus ceentas ancaris tiene un valor de " + suma);
        
    }
}
