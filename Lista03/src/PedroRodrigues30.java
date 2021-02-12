public class PedroRodrigues30 {
    public static void main(String[] args) {
        double despesas = 200, publico = 120, valorIngresso = 5, lucro, arrecadacao, lucroMaximo = 0, valorMaximo = 0, publicoMax = 0;
        for (int i = 0; i < 9; i++){
            arrecadacao = valorIngresso * publico;
            lucro = arrecadacao - despesas;
            System.out.println("-------------------------");
            System.out.println("Valor dos ingressos: " + valorIngresso);
            System.out.println("Publico esperado: " + publico);
            System.out.println("Lucro calculado: " + lucro);
            System.out.println("-------------------------");
            if (lucro >= lucroMaximo){
                lucroMaximo = lucro;
                valorMaximo = valorIngresso;
                publicoMax = publico;
            }
            valorIngresso -= 0.5;
            publico += 26;
        }

        System.out.printf("O lucro maximo esperado e de %.2f reais, vendendo %.0f ingressos a R$%.2f", lucroMaximo, publicoMax, valorMaximo);

    }
}
