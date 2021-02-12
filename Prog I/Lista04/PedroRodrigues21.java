import java.util.Scanner;

public class PedroRodrigues21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tam, aux = 0;

        System.out.print("Insira o tamanho da montanha: ");
        tam = sc.nextInt();

        int[] vetor = new int[tam];

        for(int i = 0; i < tam; i++){
            System.out.println("Insira a altura da montanha na posicao "+(i+1)+": ");
            vetor[i] = sc.nextInt();
        }
        for(int i = 1; i < tam-1; i++){
            if(vetor[i] > vetor[i+1] && vetor[i] > vetor[i-1]){
                aux++;
            }
        }
        if(aux>1){
            System.out.println("S");
        }
        else System.out.println("N");

        sc.close();
    }
}
