package futebol;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceitaTest {


    @Test
    void deveRetornarDespesaSalarios() {

        Jogador jogador1 = new JogadorAtacante();
        jogador1.setGols(10);

        Jogador jogador2 = new JogadorDefensor();
        jogador2.setPartidas(10);

        List<Jogador> listaJogadores = new ArrayList<Jogador>();

        listaJogadores.add(jogador1);
        listaJogadores.add(jogador2);

        Receita receita = new Receita();
        assertEquals(17000.0f, receita.calculaDespesaSalarios(listaJogadores));
    }

    @Test
    void deveRetornarReceitaSocios() {

        SocioTorcedor socio1 = new SocioTorcedor();
        SocioTorcedor socio2 = new SocioTorcedor();

        List<SocioTorcedor> listaSocios = new ArrayList<SocioTorcedor>();
        listaSocios.add(socio1);
        listaSocios.add(socio2);

        Receita receita = new Receita();
        assertEquals(20000.0f, receita.calculaReceitaSocios(listaSocios));
    }


    @Test
    void deveRetornarReceitaMensal() {
        SocioTorcedor socio1 = new SocioTorcedor();
        SocioTorcedor socio2 = new SocioTorcedor();

        Jogador jogador1 = new JogadorAtacante();
        jogador1.setGols(10);

        Jogador jogador2 = new JogadorDefensor();
        jogador2.setPartidas(10);

        List<SocioTorcedor> listaSocios = new ArrayList<SocioTorcedor>();
        listaSocios.add(socio1);
        listaSocios.add(socio2);

        List<Jogador> listaJogadores = new ArrayList<Jogador>();

        listaJogadores.add(jogador1);
        listaJogadores.add(jogador2);

        Receita receita = new Receita();
        assertEquals(3000.0f + " - Lucro", receita.calculaReceitaMensal(listaSocios, listaJogadores));
    }
    @Test
    void deveRetornarReceitaPrejuizoMensal() {
        SocioTorcedor socio1 = new SocioTorcedor();

        Jogador jogador1 = new JogadorAtacante();
        jogador1.setGols(10);

        Jogador jogador2 = new JogadorDefensor();
        jogador2.setPartidas(10);

        List<SocioTorcedor> listaSocios = new ArrayList<SocioTorcedor>();
        listaSocios.add(socio1);

        List<Jogador> listaJogadores = new ArrayList<Jogador>();

        listaJogadores.add(jogador1);
        listaJogadores.add(jogador2);

        Receita receita = new Receita();
        assertEquals(-7000.0f + " - Prejuizo", receita.calculaReceitaMensal(listaSocios, listaJogadores));
    }
}