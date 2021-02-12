import java.util.Scanner;

public class PedroRodrigues10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s, a[] = new double[10];
        System.out.println("Preencha as 10 posicoes do vetor: ");
        int i = 0;
        do {
            a[i] = sc.nextDouble();
            i++;
        }while (i < 10);
        s = Math.pow((a[0] - a[9]), 2 ) + Math.pow((a[1] - a[8]), 2 ) + Math.pow((a[2] - a[7]), 2 )
                + Math.pow((a[3] - a[6]), 2 ) + Math.pow((a[4] - a[5]), 2 );
        System.out.println(s);
        sc.close();
    }
}