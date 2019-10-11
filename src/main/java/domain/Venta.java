package domain;

public class Venta extends Operacion {
    private static double porcentaje =1.5;

    public Venta(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void CalcularComisionDelEmpleado(Inmueble inmueble, Empleado empleado){
        empleado.setcomision(inmueble.getPrecio()*this.porcentaje);
    }
}
