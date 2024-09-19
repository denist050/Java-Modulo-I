import java.util.Arrays;

public class EjemploArray2D {

    public static void main(String[] args) {

        double acumulado;
        double interes = 0.10;

        double [][] saldo = new double[5][6];

        for(int j = 0; j< 6; j++){

            saldo[0][j] = 10000;
            acumulado = 10000;

            for(int i = 1; i<5; i++){

                acumulado = acumulado + (acumulado*interes);

                saldo[i][j] = acumulado;
            }
            interes = interes +0.01;
        }

        for(int i = 0;i <5;i++){
            System.out.println();
            for(int z = 0; z <6; z++){

                System.out.printf("%1.2f", saldo[i][z]);

                System.out.print(" ");

            }

        }

    }
}
