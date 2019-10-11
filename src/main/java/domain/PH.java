package domain;

public class PH extends Inmueble {

    public PH(double unosMetrosCuadrados, int unaCantidadDeAmbientes, Zona zona, Operacion operacion) {
        super(unosMetrosCuadrados, unaCantidadDeAmbientes, zona, operacion);
    }

    @Override
    public double CalcularPrecio() {
        return 500000+super.getUnosMetrosCuadrados()*140000;
    }
}
