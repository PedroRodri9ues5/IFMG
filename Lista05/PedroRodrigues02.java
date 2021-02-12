import java.util.Scanner;

public class PedroRodrigues02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double valorMaiorLinha = 0.0;
        Double[][] matriz = new Double[3][5];
        Double[] linha = new Double[3];
        int maiorLinha = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Insira o valor da linha "+ (i+1) +" coluna "+ (j+1));
                matriz[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < 3; i++) {
            Double aux = 0.0;
            for (int j = 0; j < 5; j++) {
                aux += matriz[i][j];
                linha[i] = aux;
                if (linha[i] > valorMaiorLinha){
                    maiorLinha = i+1;
                    valorMaiorLinha = linha[i];
                }
            }
        }

        System.out.println("A linha com maior valor somado e a " + maiorLinha);
        sc.close();
    }
}