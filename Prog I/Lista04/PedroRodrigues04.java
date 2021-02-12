public class PedroRodrigues04 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        for (int i = 0; i < 10; i++){
            vetor[i] = i;
            vetor[i] = vetor[i] * vetor[i];
            System.out.println(vetor[i]);
        }
    }
}
