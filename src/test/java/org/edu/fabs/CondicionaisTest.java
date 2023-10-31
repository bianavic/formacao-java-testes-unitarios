package org.edu.fabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {

    // mais elaborado

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "joao")
    void validarAlgoSomenteNoUsuarioJoao() {
        Assertions.assertEquals(10, 5 + 5);
    }

    // se usuario for root eu desabilito o teste, nao executo
    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "maria")
    void validarAlgoSomenteNoUsuarioJoao1() {
        Assertions.assertEquals(10, 5 + 5);
    }

    // rodar apenas no linux
    @Test
    @EnabledOnOs(OS.LINUX)
    void validarAlgoSomenteNoUsuarioJoao2() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test // habilitar para arrays
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void validarAlgoSomenteNoUsuarioJoao3() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validarAlgoSomenteNoUsuarioJoao4() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test // habilitar para range
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void validarAlgoSomenteNoUsuarioJoao5() {
        Assertions.assertEquals(10, 5 + 5);
    }

}
