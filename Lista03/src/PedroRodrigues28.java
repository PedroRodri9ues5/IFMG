import java.util.Scanner;

public class PedroRodrigues28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;
        System.out.println("Vamos fazer a tabuada ate um numero N.\nDigite o valor de N: ");
        N = teclado.nextInt();
        for(int i = 1; i <= N; i++){
            System.out.println("A Tabuada de " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(N + " x " + j + " = " + i * j);
            }
        }
    }
}
