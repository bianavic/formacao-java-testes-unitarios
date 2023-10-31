package org.edu.fabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    // hipoteses
    // validar execucao apenas em determinada instancia

    @Test
    void validarAlgoSomenteNoUsuarioJoao() {
        Assumptions.assumeTrue("joao".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }

}
