import java.util.Scanner;

public class PedroRodrigues14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[10];

        for(int i = 0; i < 10; i++){

            System.out.print("Insira os valores para vetor 1: ");
            vet1[i] = sc.nextInt();

        }

        for(int i = 0; i < 10; i++){

            System.out.print("Insira os valores para vetor 2: ");
            vet2[i] = sc.nextInt();

            vet3[i] = vet1[i]+vet2[i];
            System.out.println(vet3[i]);

        }
        sc.close();
    }
}
