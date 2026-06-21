public class Principal {
    
    public static void main(String[] args) {

        //Prueba de funciones en un archivo a parte
        Funciones.bienvenidaGestorEnvios();

        //Usamos la clase creada con el constructor
        Paquete p1 = new Paquete(8.4, "Dallas");

        p1.setDestino("Ribeira");
        p1.setPeso(10);

        //Ejecutamos la función para mostrar detalles
        p1.mostrarDetalles();

        //Creamos un segundo paquete usando el constructor para los casos en los que falta el dato destino
        Paquete p2 = new Paquete(14.2);

        //Ejecutamos la funcion paramostrar los detalles
        p2.mostrarDetalles();
    }

}