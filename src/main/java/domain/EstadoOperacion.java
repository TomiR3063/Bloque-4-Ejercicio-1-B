package domain;

public abstract class EstadoOperacion {

    public void Reservar(Inmueble inmueble, Empleado empleado, Cliente cliente, Operacion operacion) {}

    public void Concretar(Inmueble inmueble, Empleado empleado, Cliente cliente, Operacion operacion){}
}
