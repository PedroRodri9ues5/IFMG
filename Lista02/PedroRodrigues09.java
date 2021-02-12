import java.util.Scanner;

public class PedroRodrigues09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCarro, anoFabricacao, taxa = 0;
        imprimir("Vamos calcular a taxa de transferencia de um veiculo!\nInsira o ano de fabricacao: ");
        anoFabricacao = sc.nextDouble();

        boolean validacaoAno = anoFabricacao > 0 && anoFabricacao < 2021;
        if (!validacaoAno){
            System.err.println("ANO DE FABRICACAO INVALIDO");
            System.exit(0);
        }

        imprimir("Insira o valor de tabela do carro: ");
        valorCarro = sc.nextDouble();

        if (anoFabricacao < 2021 && anoFabricacao > 1990){
            taxa = valorCarro * 0.015;
        }else if (anoFabricacao > 0 && anoFabricacao < 1990){
            taxa = valorCarro * 0.01;
        }

        System.out.printf("O valor da taxa a ser pago sera de: %.2f", taxa);

        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
}
