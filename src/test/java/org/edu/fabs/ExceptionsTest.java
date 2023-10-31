package org.edu.fabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    // validar cenario de erro
    @Test
    void validaCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("1234", 0);
        Conta contaDestino = new Conta("4321", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        // qual a classe da execcao?
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

        Assertions.assertDoesNotThrow(() ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, 1));
    }

}
