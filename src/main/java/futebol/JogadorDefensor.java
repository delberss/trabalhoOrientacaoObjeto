package futebol;

public class JogadorDefensor extends Jogador{
    public JogadorDefensor(){
        this.setPosicao("DEFENSOR");
    }

    public float calcularSalarioJogador(){
        return this.salarioBase +  (this.partidas * this.bonusJogo);
    }

    @Override
    public String getInfoJogador() {
        return this.getNome() + " - " + this.partidas + " Partidas - Defensor";
    }

    @Override
    public String calculaRenovacaoContrato() {
        if (this.getIdade() > 30 ){
            return "REPROVADO";
        }
        else{
            if (this.getIdade() > 20 && this.partidas < 10){
                return "REPROVADO";
            }
            else{
                return "APROVADO";
            }
        }
    }
}
