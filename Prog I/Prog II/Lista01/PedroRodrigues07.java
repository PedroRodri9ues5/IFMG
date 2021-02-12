import java.util.Scanner;

public class PedroRodrigues07 {
    static double calcularMediaVetorInt (int[] vetor){
        double media, soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        media = soma / vetor.length;
        return media;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
        double media;

        System.out.println("Insira o tamanho desejado do vetor: ");
        tam = sc.nextInt();

        int[] vetor = new int[tam];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o valor para a posicao " + (i+1) + " do vetor: ");
            vetor[i] = sc.nextInt();
        }

        media = calcularMediaVetorInt(vetor);

        System.out.println("A media do vetor e: " + media);

        sc.close();
    }
}
