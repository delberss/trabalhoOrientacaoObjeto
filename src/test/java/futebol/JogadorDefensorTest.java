package futebol;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorDefensorTest {

    JogadorDefensor jogadorDefensor;
    @BeforeEach
    void setUp(){
        jogadorDefensor = new JogadorDefensor();
    }


    @Test
    void deveRetornarSalarioJogador() {
        jogadorDefensor.setPartidas(20);

        assertEquals(11000.0f, jogadorDefensor.calcularSalarioJogador());
    }

    @Test
    void getInfoJogador() {
        jogadorDefensor.setNome("Sérgio Ramos");
        jogadorDefensor.setPartidas(20);

        assertEquals("Sérgio Ramos - 20 Partidas - Defensor", jogadorDefensor.getInfoJogador());
    }

    @Test
    void deveRetornarReprovacaoContrato() {
        jogadorDefensor.setIdade(31);

        assertEquals("REPROVADO", jogadorDefensor.calculaRenovacaoContrato());
    }

    @Test
    void deveRetornarSegundaReprovacaoContrato() {
        jogadorDefensor.setIdade(21);
        jogadorDefensor.setPartidas(9);

        assertEquals("REPROVADO", jogadorDefensor.calculaRenovacaoContrato());
    }

    @Test
    void deveRetornarAprovacaoContrato() {
        jogadorDefensor.setIdade(21);
        jogadorDefensor.setPartidas(10);

        assertEquals("APROVADO", jogadorDefensor.calculaRenovacaoContrato());
    }

    @Test
    void deveRetornarSegundaAprovacaoContrato() {
        jogadorDefensor.setIdade(20);
        assertEquals("APROVADO", jogadorDefensor.calculaRenovacaoContrato());
    }


}