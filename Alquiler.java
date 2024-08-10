
import java.util.Scanner;
import java.util.Date;


public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Date fechaInicio;
    private int duracionDias;
    private int total;


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Vehiculo getVehiculo() {
        return vehiculo;
    }


    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public Date getFechaInicio() {
        return fechaInicio;
    }


    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public int getDuracionDias() {
        return duracionDias;
    }


    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }


    public int getTotal() {
        return total;
    }


    public void setTotal(int total) {
        this.total = total;
    }


    public Alquiler(Cliente cliente, Vehiculo vehiculo, Date fechaInicio, int duracionDias, int total) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.duracionDias = duracionDias;
        this.total= total;
    }
 
    public String toString() {
        return ("Cliente "+ cliente + "Vehiculo:  " + vehiculo + "Fecha de inicio: "+ fechaInicio + "Duración de alquiler:  " +  duracionDias + "Precio del alquiler: " + total);
    }
    
}
