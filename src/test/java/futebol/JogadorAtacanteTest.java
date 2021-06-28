package futebol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorAtacanteTest {

    JogadorAtacante jogadorAtacante;

    @BeforeEach
    void setUp(){
        jogadorAtacante = new JogadorAtacante();
    }

    @Test
    void deveRetornarSalarioJogador() {
        jogadorAtacante.setGols(10);
        assertEquals(11000.0f, jogadorAtacante.calcularSalarioJogador());
    }

    @Test
    void getInfoJogador() {
        jogadorAtacante.setNome("Cristiano Ronaldo");
        jogadorAtacante.setPartidas(30).setGols(25);

        assertEquals("Cristiano Ronaldo - 30 Partidas 25 G - Atacante", jogadorAtacante.getInfoJogador());
    }

    @Test
    void deveRetornarAprovacaoDeContratoAbaixoDaIdade() {
        jogadorAtacante.setIdade(19);
        assertEquals("APROVADO", jogadorAtacante.calculaRenovacaoContrato());
    }

    @Test
    void deveRetornarAprovacaoDeContrato() {
        jogadorAtacante.setIdade(20);
        jogadorAtacante.setGols(21);

        assertEquals("APROVADO", jogadorAtacante.calculaRenovacaoContrato());
    }

    @Test
    void deveRetornarReprovacaoContrato() {
        jogadorAtacante.setIdade(20);
        jogadorAtacante.setGols(20);

        assertEquals("REPROVADO", jogadorAtacante.calculaRenovacaoContrato());
    }
}