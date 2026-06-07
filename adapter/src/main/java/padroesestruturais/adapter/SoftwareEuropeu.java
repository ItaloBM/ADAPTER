package padroesestruturais.adapter;

public class SoftwareEuropeu {
    public String gerarRelatorio(JogadorEuropeu jogador) {
        String classificacao = jogador.getSpeedMph() > 21.0 ? "Fast Player" : "Normal Player";
        return "Report for " + jogador.getPlayerName() + ": " + classificacao;
    }
}