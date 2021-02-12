import java.util.Scanner;

public class PedroRodrigues08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double soma = 1, aux = 2;
        System.out.println("Vamos calcular a soma da sequência apresentada: H = 1 - 1/2 + 1/3 – 1/4 + 1/5... 1/N. \n Insira um valor inteiro para N");
        num = sc.nextInt();
        for (int i = 2; i <= num; i++){
            int cond = i%2;
            if (cond == 0) {
                soma -= (1 / aux);
            }else if (cond == 1){
                soma += (1 / aux);
            }
            aux++;
        }

        System.out.printf("A soma é: %.2f", soma);
    }
}
