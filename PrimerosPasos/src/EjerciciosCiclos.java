/*
Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso
hasta que se introduzca un numero negativo
 */


import java.util.*;

public class EjerciciosCiclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;

        // Usando bucle while
        while(num >= 0){
            System.out.println("Escribe un numero:");
            num = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer  
            if(num < 0){
                break;
            }
            System.out.println("El cuadrado es: " + Math.pow(num, 2));
        }


        /*
        Usando un bucle for
        esto lo hice para corroborar que pasa si uno desea leer la entrada como string con nextLine y
        luego convertirla a entero con la clase Integer metodo parseInt
        El error que recibiste (NumberFormatException) ocurre porque cuando usas entrada.nextInt(), este método
        lee un número entero, pero no consume el carácter de nueva línea (\n) que se genera al presionar "Enter".
        Cuando luego intentas usar entrada.nextLine(), este mét odo lee ese carácter de
        nueva línea como una cadena vacía, lo que provoca el error al intentar convertirlo a un número entero con
        Integer.parseInt().
        Esto no se debe hacer, es redundar.
        */

        for (;;) {
            System.out.println("Escribe un numero:");
            String input = entrada.nextLine(); // Leer la línea completa
            if (input.isEmpty()) { // Comprobar si la entrada está vacía
                continue; // Saltar el resto del bucle si la entrada está vacía
            }
            num = Integer.parseInt(input); // Convertir la entrada a entero
            if (num < 0) {
                break; // Salir del bucle si el número es negativo
            }
            System.out.println("El cuadrado es: " + Math.pow(num, 2));
        }

        do {
            System.out.println("Escribe un numero:");
            num = entrada.nextInt();
            if (num < 0){
                break;
            }
            System.out.println("El cuadrado es: " + Math.pow(num, 2));
        } while (num >= 0);

        // Using a for loop with a specific condition
        for (num = 0; num >= 0; ) { // Initialize num to 0, continue while num is non-negative
            System.out.print("Escribe un numero: ");
            num = entrada.nextInt();
            if (num >= 0) {
                System.out.println("El cuadrado es: " + Math.pow(num, 2));
            }
        }

        entrada.close();


    }
}