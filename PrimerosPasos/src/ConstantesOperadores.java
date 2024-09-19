public class ConstantesOperadores {
    public static void main(String[] args) {

        final int c = 5; // con final, declaramos una constante

        // c = 8; no podremos modificarlo
        // tendremos 2 tipos de errores: compilacion y ejecucion
        // compilacion: el codigo esta mal escrito
        // ejecucion: no te haz saltado nada en la sintaxis pero a la hora de interpretar
        // ocurre un error inesperado y esas excepciones se puede capturar o solventar

        // las constantes son utiles por ejemplo para crear una pulgada

        System.out.println(c);

        final double apulgadas = 2.54;

        double cm = 6;

        double resultado = cm / apulgadas;

        System.out.println("En " + cm + "cm hay " + resultado + " pulgadas");

        // concepto de constante de class: comparten todos los metodos de la misma clase

        // Declarar varias constantes en la misma linea

        int operador1,operador2, resultado1;

        operador1 = 9;

        operador2 = 7;

        resultado1 = operador1 + operador2;

        System.out.println(resultado1);

    }
}
