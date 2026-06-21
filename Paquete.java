//Molde o plan0 (Clase)
public class Paquete{

    //Atributos de la clase
    private final String codigoSeguimiento;
    private double peso;
    private String destino;

    //Constructor cuando sabemos Toda la informacion
    public Paquete(double peso, String destino){
        this.codigoSeguimiento = java.util.UUID.randomUUID().toString().substring(0, 8);
        setPeso(peso);
        setDestino(destino);
    }

    //Constructor cuando nos falta el dato destino
    public Paquete(double peso){
        this.codigoSeguimiento = java.util.UUID.randomUUID().toString().substring(0, 8);
        setPeso(peso);
        setDestino("Pendiente de clasificación");
    }

    //Getters y Setters
    public String getCodigoDeSeguimiento(){return this.codigoSeguimiento;}

    public String getDestino(){return this.destino;}
    public void setDestino(String nuevoDestino){this.destino = nuevoDestino;}

    public double getPeso(){return this.peso;}
    public void setPeso(double nuevoPeso){
        if(nuevoPeso > 0)
        {
            this.peso = nuevoPeso;
        }
        else
        {
            System.out.println("❌ ERROR: El peso de un paquete no puede ser menor o igual a 0.");
        }
    }


    //Función de la clase
    public void mostrarDetalles(){
    System.out.println("📦 PAQUETE [" + codigoSeguimiento + "] con destino a " + destino + " (" + peso + " kg).");       
    }

}