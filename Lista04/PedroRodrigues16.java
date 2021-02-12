public class PedroRodrigues16 {
    public static void main(String[] args) {
        int aux0 = 0, aux1 = 0, vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i ++){
            vetor[i] = i;
            if (i > 2){
                aux1 = i;
                aux0 = i;
                while (aux1 > 1){
                    aux0 = aux0 * (aux1 - 1);
                    aux1--;
                }
                vetor[i] = aux0;
            }
            System.out.println(vetor[i]);
        }
    }
}
