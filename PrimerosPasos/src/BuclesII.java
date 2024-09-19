
import java.util.Scanner;
public class BuclesII {
    public static void main(String[] args) {
        //usamos el metodo estatico random de la clase math,
        //al ser estatico se pone la clase delante del metodo
        //si usamos *100, mostrara numeros entre 0 y 100
        //usanmos refundicion para convertir el doble de Math.random en entero

        int aleatorio = (int)(Math.random()*100);

        System.out.println(aleatorio);

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        int intentos = 0;

        while(numero != aleatorio){
            intentos++;
            System.out.println("Introduce un numero, por favor");

            numero = entrada.nextInt();

            if(aleatorio < numero){

                System.out.println("Mas bajo");
            } else if (aleatorio > numero){

                System.out.println("Mas alto");

            }
        }
        System.out.println("Correcto, lo has conseguido en "+ intentos + " intentos");




    }
}
