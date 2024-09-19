public class ClaseStringII {
    public static void main(String[] args) {

        //Metodo subString sirve para extraer un numero determinado de caracteres dentro de una cadena

        String frase = "Hoy es un dia estupendo para aprender a programar en Java";

        String frase_resumen = frase.substring(29, 57); //Utilizamos los caracteres desde 29 a 57 con este metodo
        //.substring para extraer la cadena aprender a programar en Java

        System.out.println("frase_resumen = " + frase_resumen);

        //Podemos utilizar el metodo .toUpperCase() para poner Aprender en mayusculas

        String parte1 = frase.substring(29, 30).toUpperCase(); // "A"

        String parte2 = frase.substring(30, 57); // "prender a programar en Java"

        frase_resumen = parte1 + parte2;

        System.out.println("frase_resumen2 = " + frase_resumen);

        frase_resumen = frase.substring(0, 29) + " irnos a la playa y olvidarnos de todo ... y " +
                frase.substring(29, 57);

        System.out.println(frase_resumen);

    }
}
