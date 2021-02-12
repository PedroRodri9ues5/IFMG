import java.util.Scanner;

public class PedroRodrigues01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0, matriz[][] = new int[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Insira o valor da linha "+ i +" coluna "+ j);
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               matriz[i][j] = matriz[i][j] * maior;
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
        sc.close();
    }
}