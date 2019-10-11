package domain;

public class Alquiler extends Operacion{
    private int unosMeses;
    private double unValor;

    public int getUnosMeses() {
        return unosMeses;
    }

    public double getUnValor() { return unValor; }

    public Alquiler(int unosMeses, double unValor) {
        this.unosMeses = unosMeses;
        this.unValor = unValor;
    }

    public void CalcularComisiondeDelEmpleado(Inmueble inmueble, Empleado empleado){
    empleado.setcomision((this.getUnosMeses() * inmueble.getPrecio()) / 50000);
    }

}
