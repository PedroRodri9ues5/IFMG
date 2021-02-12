import java.util.Scanner;

public class PedroRodrigues11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetorUm[] = new int[10];
        int vetorDois[] = new int[10];
        int vetorTres[] = new int[20];
        System.out.println("Preencha os dois vetores a seguir.\nO primeiro: ");
        int i = 0;
        do {
            vetorUm[i] = sc.nextInt();
            i++;
        }while (i < 10);
        System.out.println("Agora o segundo: ");
        i = 0;
        do {
            vetorDois[i] = sc.nextInt();
            i++;
        }while (i < 10);
        int j = 0, k = 0;
        for (i = 0; i < 20; i++){
            if (i % 2 == 0){
                vetorTres[i] = vetorUm[j];
                j++;
            }else {
                vetorTres[i] = vetorDois[k];
                k++;
            }
            System.out.println(vetorTres[i]);
        }

        sc.close();
    }
}