import java.util.Scanner;

public class PedroRodrigues22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aPais = 500000, bPais = 700000;
        int ano = 2015;
        do {
            if (bPais > aPais){
                aPais = (int) (1.03 * aPais);
                bPais = (int) (1.02 * bPais);
                ano++;
            }

        }while (bPais > aPais);

        System.out.println("O pais A ultrapassara a populacao do pais B no ano " + ano);

        sc.close();
    }
}
