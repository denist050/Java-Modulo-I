import javax.swing.*;

public class ArraysII {

    public static void main(String[] args) {


        String [] paises = new String[8];

        paises[0] = "España";
        paises[1] = "Mexico";
        paises[2] = "Colombia";
        paises[3] = "Peru";
        paises[4] = "Chile";
        paises[5] = "Argentina";
        paises[6] = "Panama";
        paises[7] = "Uruguay";

        for(int i = 0; i<paises.length; i++){

            System.out.println("Pais "+(i+1)+" "+paises[i]);
        }
        //bucle for each
        //se pueden imprimir todos los valores que hay en un arreglo
        for(String elemento:paises){

            System.out.println("Pais: "+elemento);

        }

        //remplazamos los paises del arreglo con nuevos paises ingresados
        for (int i = 0; i<8; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce pais " + (i+1));
        }

        for(String elemento:paises){

            System.out.println("Pais: "+elemento);

        }


        int[] matriz_aleatorios = new int[150];

        for(int i = 0; i< matriz_aleatorios.length; i++){

            matriz_aleatorios [i] = (int)Math.round(Math.random()*100);

        }

        for (int numeros:matriz_aleatorios){
            System.out.println(numeros+ " ");

        }

    }
}
