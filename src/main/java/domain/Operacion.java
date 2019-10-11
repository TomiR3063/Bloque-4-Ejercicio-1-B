package domain;

public class Operacion {
    private EstadoOperacion estado;

    public Operacion(){

    }
    public void Reservar(Inmueble inmueble, Cliente cliente, Empleado empleado){
        this.estado.Reservar(inmueble, empleado, cliente, this);
    }

    public void CambiarEstado(EstadoOperacion estado) {
        this.estado = estado;
    }

    public void Concretar(Inmueble inmueble, Empleado empleado, Reservado cliente, Operacion operacion, Reservado unClienteQueReserva) {
        operacion.CambiarEstado(new Concretado());
    }
}


