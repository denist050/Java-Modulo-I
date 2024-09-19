import javax.swing.*;

public class EntradaDatosIII {
    public static void main(String[] args) {

        double x = 10000.0;

        System.out.printf("%1.2f", x/3); //metodo printf tiene dos parametros, el formato que debe aplicarle
                                         //y el segundo es x/3 y le dara dos decimales al resultado de la division

        String num1 = JOptionPane.showInputDialog("Introduce un numero");

        double num2 = Double.parseDouble(num1);

        System.out.print(" La raiz de " + num2 + " es "); //aqui utilizamos el metodo.print en vez de print.ln y este metodo permite imprimir el
                              //el texto sin un salto de linea al final

        System.out.printf("%1.2f", Math.sqrt(num2));


    }
}
