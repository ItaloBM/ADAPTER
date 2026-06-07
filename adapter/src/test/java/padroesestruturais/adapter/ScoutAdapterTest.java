package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScoutAdapterTest {

    @Test
    void deveAdaptarJogadorNacionalParaSoftwareEuropeu() {
        // 1. Temos o nosso jogador nacional normal (38 Km/h)
        JogadorNacional ayrtonLucas = new JogadorNacional("Ayrton Lucas", 38.0);

        // 2. Temos o software europeu exigente
        SoftwareEuropeu scoutIngles = new SoftwareEuropeu();

        // 3. Se passarmos o 'ayrtonLucas' direto, não compila!
        // scoutIngles.gerarRelatorio(ayrtonLucas); // ERRO!

        // 4. Usamos o Adapter! Ele encapsula o Ayrton e finge ser um Europeu.
        JogadorEuropeu jogadorAdaptado = new AdapterJogadorParaEuropeu(ayrtonLucas);

        // 5. O Software europeu engole o adaptador sem desconfiar de nada.
        String relatorioFinal = scoutIngles.gerarRelatorio(jogadorAdaptado);

        // Sucesso total. A conversão de matemática foi feita dentro do Adapter!
        assertEquals("Report for Ayrton Lucas: Fast Player", relatorioFinal);

        // Verifica a conversão matematicamente (38 km/h / 1.609 = 23.61 mph)
        assertTrue(jogadorAdaptado.getSpeedMph() > 23.0);
    }
}