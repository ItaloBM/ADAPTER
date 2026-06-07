package sempadrao.adapter;

public class SoftwareEuropeu {
    public String classificarVelocidade(double velocidadeMph) {
        if (velocidadeMph > 21.0) {
            return "Fast Player (Jogador Rápido)";
        }
        return "Normal Player";
    }
}