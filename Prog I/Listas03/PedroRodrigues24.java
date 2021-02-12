import java.util.Scanner;

public class PedroRodrigues24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numConsumidor = 0, consMes, codigoConsumidor, custoIndividual, consumoTotal = 0.0, consumoUmDois = 0.0, aux = 0.0;
        do {
            System.out.println("Insira o codigo do consumidor: ");
            codigoConsumidor = sc.nextDouble();

            if (codigoConsumidor < 1 ||codigoConsumidor > 3){
                System.err.println("CODIGO INVALIDO");
                continue;
            }

            System.out.println("Insira o numero do consumidor: ");
            numConsumidor = sc.nextDouble();

            if (numConsumidor == 0){
                break;
            }

            System.out.println("Insira a quantidade de kWh consumida: ");
            consMes = sc.nextDouble();

            if (codigoConsumidor == 1){
                aux ++;
                custoIndividual = consMes * 0.3;
                consumoUmDois += consMes;
                consumoTotal += consMes;
                System.out.println("O custo desse consumidor e: " + custoIndividual);
            }else if (codigoConsumidor == 2){
                aux ++;
                custoIndividual = consMes * 0.5;
                consumoUmDois += consMes;
                consumoTotal += consMes;
                System.out.println("O custo desse consumidor e: " + custoIndividual);
            }else if (codigoConsumidor == 3){
                custoIndividual = consMes * 0.7;
                consumoTotal += consMes;
                System.out.println("O custo desse consumidor e: " + custoIndividual);
            }

        }while (numConsumidor != 0);

        System.out.println("O consumo de todos os consumidores juntos e: " + consumoTotal);
        System.out.println("A media dos consumidores do tipo 1 e 2 e: " + consumoUmDois/aux);

        sc.close();
    }
}
