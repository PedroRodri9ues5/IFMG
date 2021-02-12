import java.util.Scanner;

public class PedroRodrigues13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdA, qtdB, qtdC;
        System.out.println("Insira o tamanho do vetor A (entre o e 100): ");
        qtdA = sc.nextInt();
        if (qtdA > 100 || qtdA < 0) {
            do {
                System.err.println("TENTE NOVAMENTE!");
                qtdA = sc.nextInt();
            } while (qtdA > 100 || qtdA < 0);
        }
        int vetorA[] = new  int[qtdA];
        for (int i = 0; i < qtdA; i++) {
            System.out.println("Insira o " + (i+1) + " numero");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Insira o tamanho do vetor B (entre o e 100): ");
        qtdB = sc.nextInt();
        if (qtdB > 100 || qtdB < 0) {
            do {
                System.err.println("TENTE NOVAMENTE!");
                qtdB = sc.nextInt();
            } while (qtdB > 100 || qtdB < 0);
        }
        int vetorB[] = new  int[qtdB];
        for (int i = 0; i < qtdB; i++) {
            System.out.println("Insira o " + (i+1) + " numero");
            vetorB[i] = sc.nextInt();
        }

        qtdC = qtdA + qtdB;
        int a = 0, b = 0, c, vetorC[] = new  int[qtdC];

        System.out.println("O vetor C intercalado a e b: ");
        for (c = 0; c < qtdC; c++) {
            if (c %2 == 0){
                vetorC[c] = vetorA[a];
                a++;
            }else {
                vetorC[c] = vetorB[b];
                b++;
            }
            System.out.println(vetorC[c]);
        }


        sc.close();
    }
}