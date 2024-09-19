package poo;

// modularizacion: dividir la clase en 2 ficheros


public class Uso_Coche {

    public static void main(String[] args) {
        //Crear objetos a partir de una clase, lo que permite la reutilización del código y la creación de múltiples
        //objetos con características similares pero estados diferentes.
        //Aqui instanciamos una clase, ejemplar de clase

        Coche micoche = new Coche();

        //aqui accedemos a la propiedad de los objetos a travez de sus metodos
        //para acceder a un getter o setter usamos nombre del objeto.metodo

        micoche.establece_color();

        System.out.println(micoche.dime_color());


    }
}
