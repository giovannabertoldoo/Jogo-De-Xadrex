import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JogoDeXadrezTest {

    @Test
    public void testarTabuleiro() {

        Tabuleiro tabuleiro = new Tabuleiro();

        assertFalse(tabuleiro.acabouOJogo());
    }

    @Test
    public void testarBispo() {

        Bispo bispo = new Bispo("B1b");

        assertEquals(1, bispo.mover());
    }

    @Test
    public void testarRei() {

        Rei rei = new Rei("K0b");

        assertEquals(1, rei.mover());
    }

    @Test
    public void testarTorre() {

        Torre torre = new Torre("T1b");

        assertEquals(1, torre.mover());
    }

    @Test
    public void testarRainha() {

        Rainha rainha = new Rainha("Q0b");

        assertEquals(1, rainha.mover());
    }
}
