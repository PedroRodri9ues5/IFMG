public class PedroRodrigues17 {

    public static boolean primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] vetor = new int[100];

        for (int i = 2; i <= 100; i++) {

            if (primo(i)) {
                vetor[i] = i;
            }

        }

        System.out.print("||");

        for (int i = 0; i < 100; i++) {

            if (vetor[i] > 1) {

                System.out.print(vetor[i] + "||");

            }
        }
    }
}