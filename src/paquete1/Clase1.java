//MODIFICADORES DE ACCESO
package paquete1;

public class Clase1 {

    //Atributo
    int atributo; //-->este atributo no tiene mod de acceso

    //Modificador de acceso es LA PALABRA ANTES del tipo de ATRIBUTO--->IDENTIFICA la visibilidad del atributo con referencia a otras clases
    //SI el ATRIBUTO no lo tiene. int atributo--->es por defecto

    /*
    ATRIBUTO CON MOD POR DEFECTO
    - Puede ser accedido por cualquier metodo de la clase 1
    - Puede ser accedido por cualquier clase del mismo PAQUETE
     */

    /*
    ATRIBUTOS CON MOD PUBLIC
    - Puede ser accedidos por clases de otros PAQUETES al original, incluyendo a la original obviamente
     */

    /*
    ATRIBUTOS CON MOD PRIVATE
    - restringe el atributo para que UNICAMENTE sean utilizados por METODOS de la CLASE en que
    fue creado
    - el atributo no puede ser utilizado por OTRAS CLASES, SIN IMPORTAR SI SON DEL MISMO PAQUETE O NO
     */
    public int atributo1; //-->mod de acceso publico
    private int atributo2;

    }
