package com.gorky.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConversorUnidades {

    @Test
    public void testMAC() {
        assertEquals(100, ConversorUnidades.MAC(1), 0.01);
        assertEquals(0.0, ConversorUnidades.MAC(0), 0.01);
        assertEquals(250.0, ConversorUnidades.MAC(2.5), 0.01);
    }

    @Test
    public void testMetrosAMilimetros() {
        assertEquals(1000.0, ConversorUnidades.metrosAMilimetros(1), 0.01);
        assertEquals(0.0, ConversorUnidades.metrosAMilimetros(0), 0.01);
        assertEquals(2500.0, ConversorUnidades.metrosAMilimetros(2.5), 0.01);
    }

    @Test
    public void testCentimetrosAMilimetros() {
        assertEquals(10.0, ConversorUnidades.centimetrosAMilimetros(1), 0.01);
        assertEquals(0.0, ConversorUnidades.centimetrosAMilimetros(0), 0.01);
        assertEquals(25.0, ConversorUnidades.centimetrosAMilimetros(2.5), 0.01);
    }

    @Test
    public void testMilimetrosAMetros(){
        assertEquals(1, ConversorUnidades.milimetrosAMetros(1000), 0.01);
        assertEquals(0, ConversorUnidades.milimetrosAMetros(0), 0.01);
    }

    @Test
    public void testCAM(){
        assertEquals(1, ConversorUnidades.CAM(100), 0.01);
        assertEquals(0.0, ConversorUnidades.CAM(0), 0.01);
        assertEquals(3, ConversorUnidades.CAM(300), 0.01);
    }

}
