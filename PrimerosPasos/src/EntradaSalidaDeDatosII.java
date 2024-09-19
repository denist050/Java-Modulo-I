//Clase JOptionPane
import com.sun.management.UnixOperatingSystemMXBean;

import javax.swing.*; //traemos todos los metodos del paquete javax.swing
//JOptionPane es una clase estatica

public class EntradaSalidaDeDatosII {
    public static void main(String[] args) {

        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

        String edad = JOptionPane.showInputDialog("Introduce una edad por favor");

        //aqui pasaremos el valor String de edad a int mediante el metodo estatico parseInt de la clase Integer

        int edad_usuario = Integer.parseInt(edad);

        edad_usuario++; //aqui aumentamos en uno la edad usuario

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad_usuario)+ " años.");


    }
}
