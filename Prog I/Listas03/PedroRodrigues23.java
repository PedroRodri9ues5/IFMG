public class PedroRodrigues23 {
    public static void main(String[] args) {
        int scDist = 0, csDist = 0, tempo = 0;
        do {
            if (scDist + csDist == 400000){
                break;
            }else {
                scDist = scDist + 30;
                csDist = csDist + 40;
                tempo ++;
            }
        }while (scDist + csDist < 400000);
        int horas, min, segundos;
        horas = tempo / 3600;
        min = tempo % 3600;
        segundos = min % 60;
        min = min / 60;

        double scKm, csKm;
        scKm = scDist / 1000;
        csKm = csDist / 1000;
        
        System.out.printf("\nAs locomotivas se cruzam %d horas, %d minutos e %d segundos apos a saida", horas, min, segundos);
        System.out.println("\nA locomotiva que saiu de Sao Paulo, percorreu: " + scKm + "quilometros");
        System.out.println("A locomotiva que saiu de Curitiba, percorreu: " + csKm + "quilometros");
    }
}