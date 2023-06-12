package paquete2;

import paquete1.Clase1;//permite instanciar un objeto de otra clase de otro paquete, en este caso el paquete1

public class Clase3 {
    public static void main(String[] args) {

        Clase1 object1 =new Clase1();
        /*
        Como atributo no es un atributo publico de la clase1, NO PUEDE SER ACCEDIDO POR CLASES DE DIFERENTE PAQUETE

        object1.atributo=15;
         */
        object1.atributo1=20;//-->a diferencia del anterior ya no sale error, porque el mod de acceso de atributo1 es public

    }
}
