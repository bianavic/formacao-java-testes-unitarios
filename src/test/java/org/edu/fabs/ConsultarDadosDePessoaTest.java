package org.edu.fabs;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.edu.fabs.GerenciadorDeConexaoComBancoDeDados.insereDados;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsultarDadosDePessoaTest {

    // iniciar conexao
    // iniciar e finalizar conexao acontecam antes e depois de todos os testes

    // metodo ESTATICO:
    // pode ser chamado sem criar instancia da classe
    // e é executado uma unica vez
    // precisa ser acessível a todos os métodos de teste, mesmo que eles estejam em classes diferentes
    // inicializa recursos compartilhados, como uma conexão com um banco de dados ou um arquivo.
    // garantindo que todos os testes tenham acesso aos mesmos recursos.
    @BeforeAll // execucao UNICA
    static void configuraConxao() {
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
        System.out.println("rodou configuraConxao");
    }

    // antes de CADA teste ser executado
    @BeforeEach
    void insereDadosParaTest() {
        insereDados(new Pessoa("joao", LocalDateTime.of(2000, 1, 1, 15, 0, 0)));
    }

    // depois de CADA teste ser executado
    @AfterEach
    void removeDadosParaTest() {
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("joao", LocalDateTime.of(2000, 1, 1, 15, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
        System.out.println("validou DadosDeRetorno");
    }

    @Test
    void validarDadosDeRetorno2() {
        assertTrue(true);
        System.out.println("validou DadosDeRetorno 2");
    }

    @AfterAll // execucao UNICA
    static void finalizarConexao() {
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
        System.out.println("rodou finalizarConexao");
    }

}
