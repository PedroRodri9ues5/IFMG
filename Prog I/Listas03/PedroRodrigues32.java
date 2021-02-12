public class PedroRodrigues32 {
    public static void main(String[] args) {
        int i,  j, perf = 1, x = 1;
        for (i = 1; x <= 5; i++ ) {
            for (j = 1; j< i; j++) {
                if ((i % j) == 0) {
                    perf = perf + j;
                }
            }
            if (i == perf) {
                System.out.println("O numero " + i + " é perfeito");
                x++;
            }
            perf = 0;
        }
    }

}
