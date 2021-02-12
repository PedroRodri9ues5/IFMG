import java.util.Scanner;

public class PedroRodrigues01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int aux = 1;
        int carro;
        int op;
        int[] garagem = new int[20];
        int[] carros = new int[20];
        while (aux == 1) {
            System.out.println("=============\n" +
                    "MENU\n" +
                    "=============\n" +
                    "1 – Cadastrar Veículo\n" +
                    "2 – Consultar Veículo\n" +
                    "3 - Sair\n" +
                    "=============");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Insira o numero do carro: ");
                    carro = sc.nextInt();

                    for (i = 0; i < garagem.length; i++) {
                        if (garagem[i] == carro) {
                            System.out.println("CARRO JA CADASTRADO!");
                            break;
                        }
                    }
                    garagem[carro] = carro;


            }
        }
        sc.close();
    }
}