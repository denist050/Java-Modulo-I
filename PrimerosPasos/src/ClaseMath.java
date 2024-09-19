public class ClaseMath {
    /*
    Otros calculos numericos

     Clases
    Propias: las creadas por nosotros, con un metodo main
    Predefinidas: clases suministradas por Java para utilizarlas en nuestros programas
    en caso de necesitarlas, traen consigo metodos que realizan diversas tareas

     Un ejemplo son:
    String: para manejar cadenas de caracteres o textos
    Math: para realizar calculos matematicos
    Array: permite manipular arreglos y matrices
    Thread: permite la programacion concurrente

     En Java existe biblioteca de clases o tambien denominado API JAVA:
    Es una biblioteca donde vienen todas las clases de programacion Java y
    donde se puede consultar los metodos
    https://docs.oracle.com/javase/8/docs/api/

    */

    public static void main(String[] args) {

        // metodo para raiz cuadrada
        double raiz = Math.sqrt(25);

        System.out.println("Raiz cuadrada de 25= " + raiz);

        // metodo para redondear un numero
        float num1 = 5.85F;

        int resultado = Math.round(num1);

        System.out.println("resultado redondeado = " + resultado);

        /*
        En este caso, Math.round(float a) devuelve un numero int entonces si nuestra variable
        resultado esta definida como int no habria problema
        pero en el caso de tener que utilizar Math.round(double a) porque la variable num1
        ya fue definida como double y la variabel resultado como int, y no podemos definir la misma a double
        En este caso podemos hacer una refundicion:
        (puede haber perdida de informacion si estamos conviertiendo una variable double long a int en caso de ser un
        numero muy grande)
        */

        // redefinimos la variable como double para poder usarla en el ejemplo:
        double num2 = num1;

        /*
        Podemos redefinirla de esta manera pero cambiandola solo a num2:
        float num1 = 5.85F;
        double num2 = num1;
        float num1 = 5.85F;
        double num2 = Double.valueOf(num1);
        */

        int resultado2 = (int)Math.round(num2);

        System.out.println("resultado2 = " + resultado2);

        double base = 5;

        double exponente = 3;

        // Aqui, al igual que el ejemplo anterior, usamos
        // double resultado3 = Math.pow(base,exponente);
        // pero si dada la naturaleza de tu programa, la variable resultado3 debe permanecer como int,
        // usamos la refundicion

        int resultado3 = (int)Math.pow(base,exponente);

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado3);








    }
}
