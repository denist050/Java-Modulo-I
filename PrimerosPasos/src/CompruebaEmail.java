import javax.swing.*;

public class CompruebaEmail {
    public static void main(String[] args) {

        int arroba = 0;
        boolean punto = false;

        do{

            String mail = JOptionPane.showInputDialog("Introduce el mail: ");

            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba++;
                }
                if (mail.charAt(i) == '.');
                punto = true;


            }

            if (arroba != 1 || punto == false){
                JOptionPane.showMessageDialog(null, "El mail no es correcto, intente nuevamente");
            }

        }while (arroba != 1 || punto == false);

        JOptionPane.showMessageDialog(null, "El mail es correcto");









    }
}


