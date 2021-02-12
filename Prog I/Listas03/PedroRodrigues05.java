public class PedroRodrigues05 {
    public static void main(String[] args) {
        int media, soma = 0;
        for (int i = 1; i <= 10; i++){
            soma = soma + i;
        }
        media = soma / 10;
        System.out.printf("A soma é: %d e a media e: %d", soma, media);
    }
}
