import java.util.Scanner;

public class PedroRodrigues14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, aux = 1;
        System.out.println("Vamos calcular o fatorial de N. Insira um valor para N: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            aux = aux * i;
        }
        System.out.println("O valor do fatorial de " + num + " e: " + aux);

        sc.close();
    }
}
