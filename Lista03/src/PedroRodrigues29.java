import java.util.Scanner;

public class PedroRodrigues29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, a, b;
        System.out.print("Insira um numero X para ser dividido por Y: ");
        x = sc.nextInt();
        y = sc.nextInt();
        a = 0;

       do {
            a++;
            x = x-y;
        } while(y <= x);

        b = x;

        System.out.printf("Quociente = " + a + " \nResto = " + b);

        sc.close();
    }

}
