import java.util.Scanner;

public class PedroRodrigues19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numeros para calcular sua media: ");
        Double j = 0.0, soma = 0.0, entrada;
        do {
            entrada = sc.nextDouble();
            if (entrada != -1){
                soma = soma + entrada;
                j++;
                System.out.println("Digite outro numero. \nPara sair, insira -1");
            }
        }while (entrada != -1);

        double media;
        media = soma / j;
        System.out.printf("A media dos valores digitados e:%.2f ", media);

        sc.close();
    }
}
