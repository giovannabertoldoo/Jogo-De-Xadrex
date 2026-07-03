import java.util.HashMap;
import java.util.Map;

public class Tabuleiro {

    private String[][] casas = new String[8][8];
    private Map<String, String> pecas = new HashMap<>();

    public Tabuleiro() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }

        colocarPecas();
    }

    public void colocarPecas() {

        colocar("T1p", "A8");
        colocar("H1p", "B8");
        colocar("B1p", "C8");
        colocar("Q0p", "D8");
        colocar("K0p", "E8");
        colocar("B2p", "F8");
        colocar("H2p", "G8");
        colocar("T2p", "H8");

        colocar("P1p", "A7");
        colocar("P2p", "B7");
        colocar("P3p", "C7");
        colocar("P4p", "D7");
        colocar("P5p", "E7");
        colocar("P6p", "F7");
        colocar("P7p", "G7");
        colocar("P8p", "H7");

        colocar("T1b", "A1");
        colocar("H1b", "B1");
        colocar("B1b", "C1");
        colocar("Q0b", "D1");
        colocar("K0b", "E1");
        colocar("B2b", "F1");
        colocar("H2b", "G1");
        colocar("T2b", "H1");

        colocar("P1b", "A2");
        colocar("P2b", "B2");
        colocar("P3b", "C2");
        colocar("P4b", "D2");
        colocar("P5b", "E2");
        colocar("P6b", "F2");
        colocar("P7b", "G2");
        colocar("P8b", "H2");
    }

    private void colocar(String codigo, String casa) {

        pecas.put(codigo, casa);

        int coluna = casa.charAt(0) - 'A';
        int linha = 8 - Character.getNumericValue(casa.charAt(1));

        casas[linha][coluna] = codigo;
    }
        public void mostrar() {

        System.out.println();

        for (int i = 0; i < 8; i++) {

            System.out.print((8 - i) + " ");

            for (int j = 0; j < 8; j++) {
                System.out.print("[" + casas[i][j] + "]");
            }

            System.out.println();
        }

        System.out.println("    A    B    C    D    E    F    G    H");
    }

    public boolean casaLivre(String casa) {

        int coluna = casa.toUpperCase().charAt(0) - 'A';
        int linha = 8 - Character.getNumericValue(casa.charAt(1));

        return casas[linha][coluna].equals("   ");
    }

    public boolean moverPeca(String codigo, String destino) {

        if (!pecas.containsKey(codigo)) {
            System.out.println("Peça inexistente.");
            return false;
        }

        if (!casaLivre(destino)) {
            System.out.println("A casa já está ocupada.");
            return false;
        }

        String origem = pecas.get(codigo);

        int colunaOrigem = origem.charAt(0) - 'A';
        int linhaOrigem = 8 - Character.getNumericValue(origem.charAt(1));

        casas[linhaOrigem][colunaOrigem] = "   ";

        int colunaDestino = destino.toUpperCase().charAt(0) - 'A';
        int linhaDestino = 8 - Character.getNumericValue(destino.charAt(1));

        casas[linhaDestino][colunaDestino] = codigo;

        pecas.put(codigo, destino.toUpperCase());

        return true;
    }

    public boolean acabouOJogo() {
        return false;
    }
}
