import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class SistemaAlquiler {

    private static ArrayList<Cliente> clientes= new ArrayList<>();
    private static ArrayList<Vehiculo> vehiculos= new ArrayList<>();
    private static ArrayList<Alquiler> alquileres= new ArrayList<>();

    public static void main(String[] args){

        Scanner leer= new Scanner(System.in);
        //Añadiendo algunos vehículos:

        vehiculos.add(new Vehiculo("NFR765","Toyota", "Corolla",true, 700000));
        vehiculos.add(new Vehiculo("FFF000", "Ford", "Fiesta",true, 650000));
        vehiculos.add(new Vehiculo("HQX330", "Renauld", "Sandero", false, 850000));
        vehiculos.add(new Vehiculo("RRR123", "Chevrolet","Blazer",true, 600000));

        while (true) {
            System.out.println("\nSistema de Alquiler de Vehículos");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Alquilar Vehículo");
            System.out.println("3. Listar Alquileres");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = leer.nextInt();
            leer.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarCliente(leer);
                    break;
                case 2:
                    alquilarVehiculo(leer);
                    break;
                case 3:
                    listarAlquileres();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void registrarCliente(Scanner leer) {
        System.out.print("Ingrese nombre: ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingrese ID: ");
        int idC = leer.nextInt();
        
        Cliente cliente = new Cliente(idC, nombre);
        clientes.add(cliente);
        
        System.out.println("Cliente registrado exitosamente.");
    }

    private static void alquilarVehiculo(Scanner leer){
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos disponibles.");
            return;
        }
        
        System.out.println("Seleccione un cliente por su número:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }
        
        int clienteIndex = leer.nextInt() - 1;
        leer.nextLine();  // Limpiar el buffer
        Cliente cliente = clientes.get(clienteIndex);
        
        System.out.println("Seleccione un vehículo por su número:");
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).isDisponible()) {
                System.out.println((i + 1) + ". " + vehiculos.get(i));
            }
        }
        
        int vehiculoIndex = leer.nextInt() - 1;
        leer.nextLine();  // Limpiar el buffer
        Vehiculo vehiculo = vehiculos.get(vehiculoIndex);
        
        if (!vehiculo.isDisponible()) {
            System.out.println("El vehículo no está disponible.");
            return;
        }
        
        System.out.print("Ingrese la duración del alquiler en días: ");
        int duracionDias = leer.nextInt();
        leer.nextLine();  // Limpiar el buffer
       int total= vehiculos.get(vehiculoIndex).getprecioXdia() * duracionDias;
        
        
        Alquiler alquiler = new Alquiler(cliente, vehiculo, new Date(), duracionDias, total);
        alquileres.add(alquiler);
        vehiculo.setDisponible(false);

        
        System.out.println("Vehículo alquilado exitosamente. Valor total: " + total);
    }
    private static void listarAlquileres() {
        if (alquileres.isEmpty()) {
            System.out.println("No hay alquileres registrados.");
        } else {
            for (Alquiler alquiler : alquileres) {
                System.out.println(alquiler);
            }

    }

}


}






    

