package org.edu.fabs;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.MethodName.class)  // validar nome do metodo
public class EscolhendoOrdemTest {

//    @Order(4)
    @Test
    void validaFluxoA() {
        assertTrue(true);
    }

//    @Order(3)
    @Test
    void validaFluxoB() {
        assertTrue(true);
    }

//    @Order(2)
    @Test
    void validaFluxoC() {
        assertTrue(true);
    }

//    @Order(1)
    @Test
    void validaFluxoD() {
        assertTrue(true);
    }

}
