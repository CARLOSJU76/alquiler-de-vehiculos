public class Cliente {
    private int id_cliente;
    private String nombreC;

    
    public int getId_cliente() {
        return id_cliente;
    }


    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }


    public String getNombreC() {
        return nombreC;
    }


    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }


    public Cliente(int id_cliente, String nombreC) {
        this.id_cliente = id_cliente;
        this.nombreC = nombreC;
    }
    
    public String toString() {
        return ("Nombre: " + nombreC + " " + "identificacion: " + id_cliente );
    }
        
}
