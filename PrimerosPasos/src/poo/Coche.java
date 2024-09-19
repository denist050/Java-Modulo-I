package poo;


public class Coche {

    /*propiedades o atributos de un coche
    para que no haya INCONGRUENCIA, se deben encansular
    dentro de la propia clase, pasa no poder modificarla
    desde otra clase
    para ello utilizamos un modificador de acceso, en este caso
    PRIVATE
    */

    //estado inicial del coche
    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;

    //caracteristicas que puedes variar
    String color;

    int peso_total;

    boolean asientos_cuero, climatizador;

    //metodo constructor: ha de tener el mismo nombre de la clase, es lo que lo
    //diferencia de un metodo normal

    public Coche() {

        ruedas = 4;

        largo = 2000;

        ancho = 300;

        motor = 1600;

        peso_plataforma = 500;

    }

    /*Metodo getters siempre devuelve un valor
    Funcion: Devolver el valor de las propiedades de los objetos
    Sintaxis: public dato_a_devolver nombre_metodo(){codigo + return}
    un metodo getter siempre debe devolver un dato, debemos
    contruir la instruccion return
    */

    public String dime_largo() { //GETTER
        return "El largo del coche es" + largo; //usamos largo ya que la variable lago
    }                                           //tiene el private dentro de la misma clase

    /*
    Funcion: Modificar o establecer el valor de las propiedades de los objetos
    Sintaxis: public void nombre_metodo(){codigo}
    utilizamos void porque no devuelve un valor
    */

    public void establece_color(){ //SETTER

        color = "azul";
    }

    public String dime_color(){

        return "El color del coche es " + color;
    }


}