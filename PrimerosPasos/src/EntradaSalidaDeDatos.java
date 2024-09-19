/*
  Para introducir informacion en el programa, se construye una IGU(interface grafica de usuario)
  Pero para contruir una interface grafica en Java, se necesita saber swing y awt
  Aqui lo haremos con un par de clases que se encuentra en Java
  Utilizaremos la clase Scanner donde los metodos no son estaticos, lo que significa que instanciemos un objeto
  y luego lo pongamos delante del metodo
  nextLine - para textos
  nextInt() - para numeros enteros
  nextDouble() - para numeros decimales
  JOptionPane usando showInputDialog - este metodo es estatico, implica que debemos utilizar el nombre de la clase
  delante del metodo*/

import java.util.*;
public class EntradaSalidaDeDatos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //utilizamos el constructor Scanner(File source) que nos proporcionara
        //un valor procedente de un archivo especificado, aqui tomara informacion de System.in es la consola del sistema
        //para introducir informacion

        System.out.println("Introduce tu nombre, por favor");

        String nombre_usuario = entrada.nextLine(); //aqui utilizamos el objeto instanciado, en este caso entrada delante
                                                    //delante de el metodo no estatico .nextLine()
        System.out.println("Introduce edad, por favor");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad + 1) + " años.");


    }
}
