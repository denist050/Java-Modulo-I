import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {

        //como factorial puede alcanzar unas cifras muy grandes
        //con int o long sobrepasaremos el limite
        //entonces usamos long
        long resultado = 1;

        int numero, i;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        //tambien podemos hacerlo i = numero; i > 0, i--
        for(i = 1; i <= numero ; i++){

            resultado *=  i;


        }
        System.out.println("El factorial de "+numero+" es "+resultado);
    }
}
