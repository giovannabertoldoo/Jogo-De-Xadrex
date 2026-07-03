public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar() {

        Tabuleiro tabuleiro = new Tabuleiro();

        Jogador jogadorBranco = new JogadorHumano('b');
        Jogador jogadorPreto = new JogadorSintetico('p');

        while (!tabuleiro.acabouOJogo()) {

            jogadorBranco.jogar(tabuleiro, "P1b", 1);
            jogadorPreto.jogar(tabuleiro, "P1p", 1);

            break;
        }
    }

    public static void main(String[] args) {

        JogoDeXadrez partida = new JogoDeXadrez();

        partida.iniciar();

        System.out.println("Giovanna");
    }
}
    
