public class ArraysI {
    public static void main(String[] args) {

        int[]mi_matriz = new int[5];

        //tambien se puede declarar de esta manera
        //int mi_matriz []= new int[5];

        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=15;
        mi_matriz[3]=-8;
        mi_matriz[4]=30;

        System.out.println(mi_matriz[3]);

        for(int i = 0; i<5; i++){

            System.out.println("Valor del indice "+i+" = "+mi_matriz[i]);

        }
        System.out.println("\n");

        int[]mi_matriz2 = {4, 30, -50, 80, 60};

        for(int i = 0; i<5; i++){
            System.out.println("Valor del indice "+i+" = "+mi_matriz2[i]);

        }

        //sino tenemos claro hasta donde llegar en un ciclo for porque no conocemos la longitud
        //total de la matriz, usamos mi_matriz.length

        for(int i = 0; i< mi_matriz.length; i++){
            System.out.println(mi_matriz);
        }


    }
}
