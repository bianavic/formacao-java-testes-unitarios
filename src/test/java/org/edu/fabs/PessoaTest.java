package org.edu.fabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class PessoaTest {

    // apresentacao conceitos @Test, @DisplayName, @Disable e assercoes

    @Test
    void validarCalculoDeIdade() {
        Pessoa gonzales = new Pessoa("Gonzales", LocalDateTime.of(2020, 1, 1, 15, 0, 0));
        Assertions.assertEquals(3, gonzales.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa joao = new Pessoa("Joao", LocalDateTime.of(2020, 1, 1, 15, 0, 0));
        Assertions.assertFalse(joao.ehMaiorDeIdade());

        Pessoa marta = new Pessoa("Marta", LocalDateTime.of(1995, 1, 1, 15, 0, 0));
        Assertions.assertTrue(marta.ehMaiorDeIdade());

    }

    @Test
    void deveRetornarIdade() {
        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDateTime.now());
        Assertions.assertSame(pessoa, pessoa);
    }

}