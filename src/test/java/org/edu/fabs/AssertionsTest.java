package org.edu.fabs;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

// traz o import para a linha de baixo, adiciona static, ou colocar asterisco

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


public class AssertionsTest {

    // o que é o esperado vs o que é atual

    @Test // comparar arrays
    void validarLancamento() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10, 16, 17};

        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test // objeto nulo
    void validarSeObjetoEstaNulo() {

        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Maria", LocalDateTime.now());
        assertNotNull(pessoa);

    }

    @Test // metodo assertions equals possui varias SOBRECARGAS
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        int inteiro1 = 10;
        int inteiro2 = 10;

        assertEquals(valor, outroValor);
        assertEquals(inteiro1, inteiro2);
    }

}
