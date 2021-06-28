package futebol;

public class JogadorAtacante extends Jogador{
    public JogadorAtacante(){
        this.setPosicao("ATACANTE");
    }

    @Override
    public float calcularSalarioJogador(){
        return this.salarioBase + (this.gols * this.bonusGol);
    }

    @Override
    public String getInfoJogador(){
        return this.getNome() + " - " + this.partidas + " Partidas " + this.gols + " G - Atacante";
    }

    @Override
    public String calculaRenovacaoContrato() {
        if (this.getIdade() < 20 ){
            return "APROVADO";
        }
        else{
            if (this.gols > 20){
                return "APROVADO";
            }
            else{
                return "REPROVADO";
            }
        }
    }
}
