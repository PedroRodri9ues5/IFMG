import java.util.Scanner;

public class PedroRodrigues03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiro, segundo, raiz = 0, potencia = 0;

        System.out.println("Insira o primeiro numero:");
        primeiro = scanner.nextDouble();
        System.out.println("Insira o primeiro numero:");
        segundo = scanner.nextDouble();

        if (primeiro > segundo) {
            if (primeiro > 0){
                raiz = Math.sqrt(primeiro);
                potencia = segundo * segundo;
            }
        }else if (segundo > primeiro) {
            if (segundo > 0){
                raiz = Math.sqrt(segundo);
                potencia = primeiro * primeiro;
            }
        }else if (primeiro == segundo) {
            System.err.println("Os numeros sao iguais!");
            System.exit(0);
        }

        System.out.println("O quadrado do menor numero e: "+ potencia +" e a raiz quadrada do maior número e: "+ raiz);

        scanner.close();
    }
}