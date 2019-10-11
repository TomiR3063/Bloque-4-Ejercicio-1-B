package domain;

public class NoReservado extends EstadoOperacion {
    @Override
    public void Reservar(Inmueble inmueble, Empleado empleado, Cliente cliente, Operacion operacion) {
     operacion.CambiarEstado(new Reservado(cliente));
    }
    public void Concretar(Inmueble inmueble, Empleado empleado, Reservado cliente, Operacion operacion, Reservado unClienteQueReserva) {
            operacion.CambiarEstado(new Concretado());
    }

}
