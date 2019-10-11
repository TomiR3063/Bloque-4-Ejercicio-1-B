package domain;

public class Casa extends Inmueble {
    private int unPrecio;
    public Casa (double unosMetrosCuadrados, int unaCantidadDeAmbientes, Zona zona, Operacion operacion){
        super(unosMetrosCuadrados, unaCantidadDeAmbientes, zona, operacion);
    }

    public int getUnPrecio() { return unPrecio; }

    @Override
    public double CalcularPrecio() {
        return this.unPrecio;
    }
}
