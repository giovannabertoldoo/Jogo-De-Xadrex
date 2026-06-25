public class Tabuleiro {

    private String[][] casas = new String[8][8];

    public Tabuleiro() {

        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                casas[linha][coluna] = "   ";
            }
        }

        colocarPecas();
        mostrar();
    }

    public void colocarPecas() {

        new Rei("K0b");
        new Rei("K0p");

        new Rainha("Q0b");
        new Rainha("Q0p");

        new Torre("T1b");
        new Torre("T2b");
        new Torre("T1p");
        new Torre("T2p");

        new Bispo("B1b");
        new Bispo("B2b");
        new Bispo("B1p");
        new Bispo("B2p");

        new Cavalo("H1b");
        new Cavalo("H2b");
        new Cavalo("H1p");
        new Cavalo("H2p");

        for (int i = 1; i <= 8; i++) {
            new Peao("P" + i + "b");
            new Peao("P" + i + "p");
        }
    }

    public void mostrar() {

        for (String[] linha : casas) {

            for (String casa : linha) {
                System.out.print("[" + casa + "]");
            }

            System.out.println();
        }
    }

    public boolean acabouOJogo() {
        return false;
    }
}
