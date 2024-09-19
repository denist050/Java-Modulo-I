public class ClaseString {
    public static void main(String[] args) {
        /*
        String no es un tipo primitivo sino una clase en Java
        String mi_nombre = "Juan" donde mi_nombre es un objeto(instancia, ejemplar) de la clase String
        Esto que hicimos se llama instanciar
        La clase String tiene una serie de metodos disponibles para la manipulacion de cadenas de caracteres.
        Por ejemplo, la longitud de una cadena de caracteres o averiguar donde se encuentra una letra en esa cadena de
        caracteres. Esto es util, por ejemplo al validar una direccion de correo electronico.
        length() : devuelve la longitud de una cadena de caracteres.
        charAt(n): devuelve la posicion de un caracter dentro de una cadena(posiciones empiezan a contar de 0)
        substring(x,y): devuelve una subcadena dentro de la cadena, siendo X el caracter a partir del cual se extrae
        e Y el numero de caracteres que se quiere extraer
        equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son. Distingue
        mayusculas y minusculas, devuelve un valor booleano
        equalsIgnoreCase(cadena): mismo que anterior sino se tiene en cuenta mayusculas y minusculas
        */

        String nombre = "Denis"; //los datos de tipo chat van entre '', de tipo string entre ""

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras"); //Utilizamos el .length al final de nuestra instancia
        //con este metodo sabrebmos cual es la longitud de nuestra cadena
        System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0)); // con este metodo nos devolvera
        //la letra que se encuentra en la posicion indicada dentro de los parentesis

        //Para crear una instancia que nos pueda devolver la ultima letra de nuestro nombre o cualquier otr
        // tenga la longitud que tenga creamos una variable de tipo entero

        int ultima_letra;

        ultima_letra = nombre.length(); //le asignamos la longitud de nuestra instancia nombre, en este caso Denis que
        //que tiene 5 y la asignamos a ultima_letra

        System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1)); //aqui ultizamos la variable ultima_letra
        //que tiene la longitud de nuestro nombre y le restamos 1 para estar dentro del rango y obtendremos la ultima letra

        //tambien podemos hacerlo asi
        System.out.println("Y la ultima letra es la " + nombre.charAt(nombre.length() - 1));
    }
}
