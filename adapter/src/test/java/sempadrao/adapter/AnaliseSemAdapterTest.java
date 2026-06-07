package sempadrao.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnaliseSemAdapterTest {

    @Test
    void deveFazerConversaoManual() {
        JogadorNacional brunoHenrique = new JogadorNacional("Bruno Henrique", 36.0); // 36 Km/h
        SoftwareEuropeu software = new SoftwareEuropeu();

        // O PROBLEMA: O cliente (neste caso, o teste) é obrigado a fazer as contas e conversões
        // manualmente todas as vezes antes de enviar para o software europeu, gerando código duplicado.
        double velocidadeConvertidaParaMph = brunoHenrique.getVelocidadeKmh() / 1.609;

        String resultado = software.classificarVelocidade(velocidadeConvertidaParaMph);

        assertEquals("Fast Player (Jogador Rápido)", resultado);
    }
}