package br.cesul.ex04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiclesTest {

    @Test
    @DisplayName("Teste para veiculos fixos")
    public void TestVehiclesFixed(){
        var fixed = new Fixed("Carlos", "Uninho","s",100.0, 2000.0, 2000.0);

        assertEquals(230000, fixed.amonutPayFixed());
    }

    @Test
    @DisplayName("Teste para veiculos free")
    public void TestVehiclesFree(){
        var free = new Free("oTATA", "Kasawaki Ninja", "s", 1000.0);

        assertEquals(1150, free.amonutPayFree());

    }
}
