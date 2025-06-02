package com.gorky.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConversorUnidades {

    @Test
    public void testMAC() {
        assertEquals(100, conversorUnidades.MAC(1), 0.01);
        assertEquals(0.0, conversorUnidades.MAC(0), 0.01);
        assertEquals(250.0, conversorUnidades.MAC(2.5), 0.01);
    }

    @Test
    public void testMetrosAMilimetros() {
        assertEquals(1000.0, conversorUnidades.metrosAMilimetros(1), 0.01);
        assertEquals(0.0, conversorUnidades.metrosAMilimetros(0), 0.01);
        assertEquals(2500.0, conversorUnidades.metrosAMilimetros(2.5), 0.01);
    }

    @Test
    public void testCentimetrosAMilimetros() {
        assertEquals(10.0, conversorUnidades.centimetrosamilimetros(1), 0.01);
        assertEquals(0.0, conversorUnidades.centimetrosamilimetros(0), 0.01);
        assertEquals(25.0, conversorUnidades.centimetrosamilimetros(2.5), 0.01);
    }

    @Test
    public void testMilimetrosAMetros(){
        assertEquals(1, conversorUnidades.milimetrosAMetros(1000), 0.01);
        assertEquals(0, conversorUnidades.milimetrosAMetros(0), 0.01);
    }

    @Test
    public void testCAM(){
        assertEquals(1, conversorUnidades.CAM(100), 0.01);
        assertEquals(0.0, conversorUnidades.CAM(0), 0.01);
        assertEquals(3, conversorUnidades.CAM(300), 0.01);
    }

}
