import java.util.Random;

public class PedroRodrigues04 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int x;
        boolean repete = false;
        int[][] matriz = new int[9][9];


        for(int i = 0; i < 9 ; i++){
            for(int j = 0; j < 9 ; j++){
                x = aleatorio.nextInt(9);
                matriz[i][j] = x;
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        for( x = 0; x < 9 ; x++){
            for(int y = 0; y < 9 ; y++){
                for (int i = 0; i < 9 && !repete; i++)
                {
                    for (int j = 0; j < 9; j++)
                    {
                        if(matriz[x][y] == matriz[i][j])
                        {
                            repete = true;
                        }
                    }
                }
                if(repete) {
                    x++;
                }
            }
        }
        if(x > 0) {
            System.out.println("Nao e Sudoku");
        }else {
            System.out.println("E Sudoku");
        }





    }
}
