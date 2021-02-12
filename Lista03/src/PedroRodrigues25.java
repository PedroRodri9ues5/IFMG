public class PedroRodrigues25 {
    public static void main(String[] args) {
        double s = 1.0, d = 3.0, pi;
        for (int i = 2; i < 53; i++){
            if (i % 2 == 0){
                s = s - (1/Math.pow(d, 3));
            }
            if (i % 2 == 1){
                s = s + (1/Math.pow(d, 3));
            }
            d += 2;
        }
        pi = Math.cbrt((s*32.0));
        System.out.println("O valor de pi e: " + pi);
    }
}
