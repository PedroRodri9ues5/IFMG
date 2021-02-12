import java.util.Scanner;

public class PedroRodrigues20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double pares = 0.0, impares = 0.0, entrada, auxP = 0.0, auxI = 0.0, mediaP, mediaI, maiorP = 0.0, menorI = 0.0;
        int i = 0;

        System.out.println("Vamos calcular a media dos valores pares e impares positivos digitados. \nPara sair digite um valor negativo");
        do {
            entrada = sc.nextDouble();
            if (entrada > 0) {
                if (entrada % 2 == 0) {
                    pares = pares + entrada;
                    auxP++;
                    if (entrada > maiorP) {maiorP = entrada;}
                }
                if (entrada % 2 == 1){
                    impares = impares + entrada;
                    auxI++;
                    if (i < 2){menorI = entrada; }
                    if (entrada < menorI) {menorI = entrada; }
                    i++;
                }

            }
        } while (entrada > 0);

        mediaI = impares / auxI;
        mediaP = pares / auxP;
        System.out.printf("O maior numero par e: %.2f e a media dos numeros pares e: %.2f", maiorP, mediaP);
        System.out.printf("\nO menor numero impar e: %.2f e a media dos numeros impares e: %.2f", menorI, mediaI);

        sc.close();
    }
}
