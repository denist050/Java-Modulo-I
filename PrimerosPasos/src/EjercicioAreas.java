import java.util.*;
import javax.swing.*;

public class EjercicioAreas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Aqui podemos usar int option = entrada.nextInt(System.in); para ingresar datos de la consola tambien,
        //Recordando que nextInt es un metodo no estatico de modo que tenemos que poner el objeto entrada antes del
        //metodo creado con la clase Scanner para introducirlo

        int option = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opcion para calular el area: \n 1)Cuadrado \n 2)Rectangulo " +
                "\n 3)Triangulo \n 4)Circulo"));

        switch (option){

            case 1:

                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));

                System.out.println("El cuadrado es: " + Math.pow(lado, 2));

                break;

            case 2:

                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base y la altura"));

                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base y la altura"));

                System.out.println("El area de un rectangulo es: " + (base * altura));

                break;

            case 3:

                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base y la altura"));

                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base y la altura"));

                System.out.println("El area de un triangulo es: " + ((base * altura)/2));

                break;

            case 4:

                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));

                System.out.printf("El area de un circulo es: %1.2f",Math.PI * (Math.pow(radio, 2)));

                break;

            default:

                System.out.println("La option ingresada no es correcta.");
        }
    }
}
