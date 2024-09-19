import javax.swing.*;

public class BuclesWhile {
    public static void main(String[] args) {

        String clave = "Denis";

        String pass = "";

        while (clave.equals(pass)==false) {

            pass = JOptionPane.showInputDialog("Ingrese la contraseña: ");

            if (clave.equals(pass)==false) {

                System.out.println("Contraseña inconrrecta");
            }
        }

        System.out.println("Contraseña correcta");

    }
}
