//Molde o plan0 (Clase)
public class Paquete{

    //Atributos de la clase
    String codigoSeguimiento;
    double peso;
    String destino;

    //Función de la clase

    public void mostrarDetalles(){
    System.out.println("📦 PAQUETE [" + codigoSeguimiento + "] con destino a " + destino + " (" + peso + " kg).");       
    }

}