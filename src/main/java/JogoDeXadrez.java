import java.util.Scanner;

public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar() {

        Scanner scanner = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();

        boolean continuar = true;

        while (continuar) {

            tabuleiro.mostrar();

            System.out.print("\nQual peça você quer mover? ");
            String peca = scanner.nextLine();

            System.out.print("Para qual casa você deseja mover? ");
            String casa = scanner.nextLine().toUpperCase();

            while (!tabuleiro.moverPeca(peca, casa)) {

                System.out.print("\nQual peça você quer mover? ");
                peca = scanner.nextLine();

                System.out.print("Para qual casa você deseja mover? ");
                casa = scanner.nextLine().toUpperCase();
            }

            System.out.println();
            tabuleiro.mostrar();

            System.out.print("\nDeseja continuar jogando? (S/N): ");
            String resposta = scanner.nextLine();

            continuar = resposta.equalsIgnoreCase("S");
        }

        scanner.close();

        System.out.println("\nJogo encerrado.");
    }

    public static void main(String[] args) {

        JogoDeXadrez partida = new JogoDeXadrez();

        partida.iniciar();
    }
}
