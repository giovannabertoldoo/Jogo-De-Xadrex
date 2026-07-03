import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TabuleiroTest {

    @Test
    public void testaCasaLivre() {

        Tabuleiro tabuleiro = new Tabuleiro();

        // Casa vazia
        assertTrue(tabuleiro.casaLivre("E4"));

        // Casa ocupada
        assertTrue(!tabuleiro.casaLivre("A1"));
    }
}
