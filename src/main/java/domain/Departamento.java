package domain;

public class Departamento extends Inmueble{
    public Departamento (double unosMetrosCuadrados, int unaCantidadDeAmbientes, Zona zona, Operacion operacion){
        super(unosMetrosCuadrados, unaCantidadDeAmbientes, zona, operacion);
    }

    @Override
    public double CalcularPrecio() {
        return super.getUnaCantidadDeAmbientes()*350000;
    }
}
