package br.cesul.ex02;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondominiumTest {

    @Test
    public void testCondominiumOnDueDate(){
        var condominium = new Condominium(10000.5,
                10000.1,
                15000.1,
                5000.1,
                15.1,
                LocalDate.now());

        assertEquals(4000, condominium.getFee());
    }

    @Test
    public void testCondominiumOnDueDatea() {
        var payday = LocalDate.of(2024, Month.JUNE, 1);

        var condominium = new Condominium(
                10000.5,
                10000.1,
                15000.1,
                5000.1,
                15.1,
                LocalDate.now());

        assertEquals(4400, condominium.getFee());
    }


}
