import java.util.Scanner;

public class PedroRodrigues04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double triplo, num = 0;
        do{
            System.out.println("Insira um numero para ver seu triplo: ");
            System.err.println("Para sair digite '-999'");
            num = sc.nextDouble();
            if (num == -999){
                System.out.println("Finalizando.");
                System.exit(1);
            }
            triplo = 3 * num;
            System.out.println(triplo);
        }while (!(num == -999));
    }
}
