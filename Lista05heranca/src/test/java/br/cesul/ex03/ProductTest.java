package br.cesul.ex03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    @DisplayName("Testando a venda de um produto")
    public void testProduct(){
        var product = new Product("Televisão",  1000.0, 19.5, 3.25, 3);
        assertEquals(3682.5, product.getFinalPrice());
    }

}
