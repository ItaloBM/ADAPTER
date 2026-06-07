package padroesestruturais.adapter;

// 1. O Adapter IMPLEMENTA a interface que o cliente (SoftwareEuropeu) quer...
public class AdapterJogadorParaEuropeu implements JogadorEuropeu {

    // 2. ...e GUARDA o objeto antigo que queremos adaptar.
    private JogadorNacional jogadorBrasileiro;

    public AdapterJogadorParaEuropeu(JogadorNacional jogadorBrasileiro) {
        this.jogadorBrasileiro = jogadorBrasileiro;
    }

    // 3. Traduzimos as chamadas e fazemos a matemática debaixo dos panos!
    @Override
    public String getPlayerName() {
        return jogadorBrasileiro.getNome();
    }

    @Override
    public double getSpeedMph() {
        // Converte Km/h para Mph (1 Mph = ~1.609 Km/h)
        return jogadorBrasileiro.getVelocidadeKmh() / 1.609;
    }
}