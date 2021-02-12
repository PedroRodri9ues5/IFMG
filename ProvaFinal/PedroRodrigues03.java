import java.util.Scanner;

public class PedroRodrigues03 {
    static int abss(int a) {
        return a < 0 ? -a : a;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int I1, I2, F1, F2 = 0;
        int res, res2 = 0;
        System.out.println("Digite os valores:");
        I1 = teclado.nextInt();
        I2 = teclado.nextInt();
        F1 = teclado.nextInt();
        F2 = teclado.nextInt();
        while (I1 != 0 && I2 != 0 && F1 != 0 && F2 != 0) {
            if (I1 == F1 && I2 == F2) {
                System.out.println("0\n");
            } else if (I1 == F1 || I2 == F2) {
                System.out.println("1\n");
            } else {
                res = abss(I1 - F1);
                res2 = abss(I2 - F2);

                if (res - res2 == 0) {
                    System.out.println("1\n");
                    break;
                } else {
                    System.out.println("2\n");
                    break;
                }
            }

        }
    }
}