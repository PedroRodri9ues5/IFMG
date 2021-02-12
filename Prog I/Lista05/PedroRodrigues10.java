import java.util.Random;
import java.util.Scanner;

public class PedroRodrigues10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n, i;
        double custo = 0;
        System.out.println("Insira quantas cidades possuem na rota:");
        n = sc.nextInt();
        double[][] custos = new double[n][n];
        int[] rota = new int[n];
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    custos[i][j] = 0;
                } else {
                    custos[i][j] = random.nextInt(101);
                }
            }
        }
        System.out.println("Matriz de Custos");
        i = 0;
        while (i < n){
            for (int j = 0; j < n; j++) {
                System.out.println(custos[i][j] + "");
            }
            System.out.println();
            i++;
        }
        for (i = 0; i < n; i++) {
            do {
                System.out.println("Insira a " + (i + 1) + " cidade visitada na rota:");
                rota[i] = sc.nextInt();
            } while (rota[i] < 0 || rota[i] >= n);
        }
        System.out.println("Rota do caminhao:");
        i = 0;
        while (i < n){
            System.out.println(rota[i] + "");
            rota[i] = sc.nextInt();
            i++;
        }

        System.out.println();
        while (i < n-1){
            custo += custos[rota[i]][rota[i + 1]];
            i++;
        }

        System.out.println("Custo da Rota do caminhao:" + custo);
        sc.close();
    }
}