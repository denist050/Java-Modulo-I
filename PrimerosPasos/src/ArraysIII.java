//Arreglos bidimencionales

import javax.swing.*;

public class ArraysIII {

    public static void main(String[] args) {

        int [][]  matrix = new int[4][5];

        for(int i = 0; i < 4; i++){
            for(int j =0; j < 5; j++){

                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la matriz"
                        +"["+i+"]["+j+"]: "));
            }
        }

        for(int i = 0; i < 4; i++){
            System.out.println();
            for(int j =0; j < 5; j++){

                System.out.print("La matrix "+"["+i+"]"+"["+j+"] es: "+matrix[i][j]);
            }
        }
    }
}
