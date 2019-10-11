package domain;

public class Inmueble {
    private double unosMetrosCuadrados;
    private int unaCantidadDeAmbientes;
    private Zona zona;
    private Operacion operacion;
    private int precio;

    public Inmueble(double unosMetrosCuadrados, int unaCantidadDeAmbientes, Zona zona, Operacion operacion) { }

    public int getPrecio() { return precio; }

    public double getUnosMetrosCuadrados() { return unosMetrosCuadrados; }

    public int getUnaCantidadDeAmbientes() { return unaCantidadDeAmbientes; }

    public double CalcularPrecio(){
        return 0; }

    public double CalcularPrecioPlus(){
        return this.zona.getPlus() + this.CalcularPrecio();
    }

    public void Concretar(Inmueble inmueble, Empleado empleado, Reservado cliente, Operacion operacion, Reservado unClienteQueReserva) {
        operacion.CambiarEstado(new Concretado());
    }
    public void Reservar(Inmueble inmueble, Empleado empleado, Cliente cliente, Operacion operacion) {
        operacion.CambiarEstado(new Reservado(cliente));
    }

}

