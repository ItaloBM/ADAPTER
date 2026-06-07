package sempadrao.adapter;

public class JogadorNacional {
    private String nome;
    private double velocidadeKmh;

    public JogadorNacional(String nome, double velocidadeKmh) {
        this.nome = nome;
        this.velocidadeKmh = velocidadeKmh;
    }

    public String getNome() { return nome; }
    public double getVelocidadeKmh() { return velocidadeKmh; }
}