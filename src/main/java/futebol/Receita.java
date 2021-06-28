package futebol;

import java.util.List;

public class Receita {
    public float calculaDespesaSalarios(List<Jogador> jogadores){
        float somaSalarioJogadores = 0.0f;
        for (Jogador jogador: jogadores){
            somaSalarioJogadores += jogador.calcularSalarioJogador();
        }
        return somaSalarioJogadores;
    }

    public float calculaReceitaSocios(List<SocioTorcedor> socios){
        float somaReceitaSocios = 0.0f;
        for (SocioTorcedor socio: socios){
            somaReceitaSocios += socio.getPlanoMensal();
        }
        return somaReceitaSocios;
    }

    public String calculaReceitaMensal(List<SocioTorcedor> socios, List<Jogador> jogadores){
        float saldo;
        saldo =  this.calculaReceitaSocios(socios) - this.calculaDespesaSalarios(jogadores);
        if(saldo < 0){
            return saldo + " - Prejuizo";
        }
        else
            return saldo + " - Lucro";
    }
}
