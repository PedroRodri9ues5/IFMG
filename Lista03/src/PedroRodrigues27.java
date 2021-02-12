import java.util.Scanner;

public class PedroRodrigues27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Digite a altura do triângulo:");
        a = sc.nextInt();

        for(int i = 1; i <= a; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("#");
            }

            System.out.println("");
        }
        sc.close();

    }
}
