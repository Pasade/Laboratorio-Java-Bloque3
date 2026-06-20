public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Sincronizado con GitHub Cloud");
        System.out.println("PROBANDO: Nueva función de envíos internacionales v2");

        // Un array con los pesos en kg de 5 paquetes en el almacén
        double[] inventarioPesos = {10.5, 5.2, 22.4, 3.0, 15.8};
        
        System.out.println("--- CONTROL DE CARGA DEL ALMACÉN ---");

        for(int i = 0; i < inventarioPesos.length; i ++){
            inventarioPesos[i] *= 1.10;
        }

        System.out.println("Nuevo peso del primer paquete (con +10%): " + inventarioPesos[0] + "Kg");
        System.out.println("Nuevo peso del tercer paquete (con +10%): " + inventarioPesos[2] + "Kg");
        
        
    }
}