import java.util.Scanner;

public class PedroRodrigues05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;
        double soma = 0, media;
        System.out.println("Insira a quantidade de atletas: ");
        qtd = sc.nextInt();

        double atletas[] = new double[qtd];
        int autorizados[] = new int[qtd];

        for (int i = 0; i < qtd; i++){
            System.out.println("Digite a altura do " + (i+1) + " atleta: ");
            atletas[i] = sc.nextDouble();
            soma = atletas[i];
        }
        media = soma / qtd;
        for (int i = 0; i < qtd; i++){
            if (atletas[i] >= media){
                autorizados[i] = i + 1;
            }
            if (autorizados[i] > i){
                System.out.println("O " + autorizados[i] + " atleta esta autorizado a participar");
            }
        }
        sc.close();
    }
}
