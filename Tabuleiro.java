public class Tabuleiro
{
    private String[][] casas = new String[8][8];

    public Tabuleiro()
    {
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                casas[i][j] = "   ";
            }
        }

        colocarPecas();

        mostrar();
    }

    public void colocarPecas()
    {
        Rei reiBranco = new Rei("K0b");
        Rei reiPreto = new Rei("K0p");

        Rainha rainhaBranca = new Rainha("Q0b");
        Rainha rainhaPreta = new Rainha("Q0p");

        Torre torre1Branca = new Torre("T1b");
        Torre torre2Branca = new Torre("T2b");

        Torre torre1Preta = new Torre("T1p");
        Torre torre2Preta = new Torre("T2p");

        casas[0][4] = reiPreto.getNome();
        casas[7][4] = reiBranco.getNome();
    }

    public void mostrar()
    {
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                System.out.print("[" + casas[i][j] + "]");
            }

            System.out.println();
        }
    }

    public boolean acabouOJogo()
    {
        return false;
    }
}