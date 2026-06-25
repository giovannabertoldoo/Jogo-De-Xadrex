public class JogadorHumano extends Jogador {

    public JogadorHumano(char cor) {
        super(cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, int numeroDaCasa) {

        System.out.println("Jogador humano realizou uma jogada.");

        return true;
    }
}
