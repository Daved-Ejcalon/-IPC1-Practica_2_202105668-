
package Clases;

import java.io.Serializable;


public class Registro implements Serializable {
    String vehiculo;
    String distancia;
    String monto;
    String fecha_creacion;
    String fecha_entrega;

    public Registro(String vehiculo, String distancia, String monto, String fecha_creacion, String fecha_entrega) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.monto = monto;
        this.fecha_creacion = fecha_creacion;
        this.fecha_entrega = fecha_entrega;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
    
    
    
    
}
