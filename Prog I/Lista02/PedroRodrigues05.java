import java.util.Scanner;

public class PedroRodrigues05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double custoFab;
        System.out.println("Vamos calcular o valor de um carro!\nInsira o custo da fabrica:");
        custoFab = sc.nextDouble();

        if (custoFab <= 28000){
            custoFab = custoFab * 1.05;
            valFinal(custoFab);
        }else if (28000 < custoFab && custoFab >= 45000){
            custoFab = custoFab * 1.25;
            valFinal(custoFab);
        }else if (custoFab > 45000){
            custoFab = custoFab * 1.35;
            valFinal(custoFab);
        }

        sc.close();
    }
    static void valFinal(double valor){
        System.out.println("O valor do carro sera: "+ valor);
        System.exit(1);
    }
}