public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Sincronizado con GitHub Cloud");
        System.out.println("PROBANDO: Nueva función de envíos internacionales v2");

        // Un array con los pesos en kg de 5 paquetes en el almacén
        double[] inventarioPesos = {10.5, 5.2, 22.4, 3.0, 15.8};
        
        System.out.println("--- CONTROL DE CARGA DEL ALMACÉN ---");
        
        // El bucle for-each recorre de forma automática todo el array
        for (double peso : inventarioPesos) {
            if (peso > 10.0) {
                System.out.println("Paquete pesado detectado: " + peso + " kg (Requiere etiqueta especial)");
            } else {
                System.out.println("Paquete estándar: " + peso + " kg");
            }
        }
    }
}