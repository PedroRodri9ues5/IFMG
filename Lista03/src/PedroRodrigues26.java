import java.util.Scanner;

public class PedroRodrigues26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  sen, x, d = 3.0, fatorial = 1;
        System.out.println("\nVamos calcular o seno de um angulo, insira o valor do angulo ( em graus ): ");
        x = sc.nextDouble();
        x = Math.toRadians(x);
        sen = x;

        for (int i = 2; i <= 16; i++){
            for (int j = 1; j <= d; j++){
                fatorial = fatorial * j;
            }
            if (i % 2 == 0){
                sen -= (Math.pow(x, d) / fatorial);
            }
            if (i % 2 == 1){

                sen += (Math.pow(x, d) / fatorial);
            }
            fatorial = 1;
            d += 2;
        }
        System.out.printf("O valor do seno desse angulo e: %.2f", sen);
    }
}

