import java.util.Scanner;

public class PedroRodrigues03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhasB, colunasB;
        System.out.println("Insira um valor para as linhas da matriz B: ");
        linhasB = sc.nextInt();
        System.out.println("Agora para as colunas: ");
        colunasB = sc.nextInt();

        int matrizA[][] = new int[3][4];
        int matrizB[][] = new int[linhasB][colunasB];

        int n = matrizA[0].length;
        if(n != matrizB.length){
            System.err.println("NAO E POSSIVEL MULTIPLICAR ESSAS MATRIZES!");
            System.exit(1);
        }

        System.out.println("Preenchendo a matriz A [3][4]: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.println("Insira o valor da linha "+ (i+1) +" coluna "+ (j+1));
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Preenchendo a matriz B [" +linhasB + "][" + colunasB + "]: ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.println("Insira o valor da linha "+ (i+1) +" coluna "+ (j+1));
                matrizB[i][j] = sc.nextInt();
            }
        }

        int linhas = matrizA.length;
        int colunas = matrizB[0].length;
        double[][] matrizC = new double[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                for(int k = 0; k < n; k++){
                    matrizC[i][j] = matrizC[i][j] + matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Resultado: ");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.print("|" + matrizC[i][j]);
            }
            System.out.println("|");
        }
        sc.close();
    }
}