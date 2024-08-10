public class Vehiculo{

    private String placa;
    private String marca;
    private String modelo;
    private boolean disponible;
    private int precioXdia;


    public Vehiculo(String placa, String marca, String modelo, boolean disponible, int precioXdia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.disponible = disponible;
        this.precioXdia  = precioXdia;
    }
     
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public int getprecioXdia() {
        return precioXdia;
    }
    public void setprecioXdia( int precioXdia){
            this.precioXdia= precioXdia;
    }

    
    public String toString() {
        return ("Placa: "+ placa + "Marca: " + marca + "Modelo: "+ modelo + "Esta disponible? " +  disponible + "Precio por dia: " + precioXdia);
    }
    
        
}

