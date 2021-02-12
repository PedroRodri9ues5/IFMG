import java.util.Random;

public class PedroRodrigues01 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] red = new int[10][10];
        int[][] green = new int[10][10];
        int[][] blue = new int[10][10];
        int[][] gray = new int[10][10];
        int media;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                red[i][j] = aleatorio.nextInt(255);
            }
        }for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                green[i][j] = aleatorio.nextInt(255);
            }
        }for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                blue[i][j] = aleatorio.nextInt(255);
            }
        }
        System.out.println("A matriz em escala de cinza: ");
        for (int i = 0; i < 10; i++) {
            media = 0;
            System.out.print("|");
            for (int j = 0; j < 10; j++) {
                media+=red[i][j];
                media+=green[i][j];
                media+=blue[i][j];
                media = media/3;
                gray[i][j] = media;
                System.out.print(gray[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("A matriz em negativo: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gray[i][j] = 255-gray[i][j];
                System.out.print(gray[i][j] + "|");
            }
            System.out.println();
        }
    }
}
