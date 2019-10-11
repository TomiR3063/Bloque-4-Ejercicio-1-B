package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Punto1Comision{
    private Cliente unCliente;
    private Casa casa;
    private Empleado unEmpleado;
    private Zona zona;
    private Operacion operacion;

    @Before
    public void init (){
        this.zona = new Zona(30000, "Palermo");
        this.operacion = new Venta(1.5);
        this.casa = new Casa(40, 3, this.zona,this.operacion);
        this.unEmpleado = new Empleado();
    }

    @Test
    public void CalcularComisionDelEmpleado(){
        this.unEmpleado.Concretar(this.casa, this.unEmpleado,this.unCliente, this.operacion, this.unCliente);
        Assert.assertEquals(70,this.unEmpleado.getComision(), 0.2);
    }




}
