package domain;

public class Reservado extends EstadoOperacion {
    public Cliente unClienteQueReserva;

    public Reservado(Cliente cliente) {
        super();
        unClienteQueReserva = cliente;
    }

    @Override
    public void Reservar(Inmueble inmueble, Empleado empleado, Cliente cliente, Operacion operacion) {

    }

    public void Concretar(Inmueble inmueble, Empleado empleado, Reservado cliente, Operacion operacion, Reservado unClienteQueReserva) {
        if (cliente == unClienteQueReserva)
            operacion.CambiarEstado(new Concretado());
    }
}

