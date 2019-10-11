package domain;

import sun.util.resources.cldr.ar.CalendarData_ar_QA;

public class Empleado {
    private double comision;
    private String unNombre;

    public Empleado() {
        this.comision=0;
    }

    public double getComision() {
        return comision;
    }

    public String getUnNombre() { return unNombre; }

    public void setcomision(double comision) {
        this.comision+=comision;
    }

    public void ValidacionDeSolicitud(){}

    public void Reservar(Inmueble inmueble, Empleado empleado, Cliente cliente, Operacion operacion) {
        operacion.CambiarEstado(new Reservado(cliente));
    }

    public void Concretar(Inmueble inmueble, Empleado empleado, Reservado cliente, Operacion operacion, Reservado unClienteQueReserva) {
         
    });

}