import java.util.Scanner;

public class PedroRodrigues12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Foi realizado um estudo estatístico sobre acidentes de trânsito em 5 cidades brasileiras" +
                "\nOs dados coletados devem ser inseridos abaixo:");
        int numCidades = 5;
        String cidades[] = new String[numCidades];
        Integer carros[] = new Integer[numCidades];
        Integer acidentes[] = new Integer[numCidades];
        for(int i = 0; i < numCidades; ++i) {
            System.out.println("Digite o nome da " +(i+1) + "º cidade: ");
            cidades[i] = sc.nextLine();
            System.out.println("Digite a quantidade de carros da cidade: ");
            carros[i] = sc.nextInt();
            System.out.println("Digite a quantidade de acidentes na cidade: ");
            acidentes[i] = sc.nextInt();
            sc.nextLine();
        }
        Integer maisAcidentes = acidentes[0];
        String maisAcidentesCidade = cidades[0];
        for (int i = 0; i < acidentes.length; i++) {
            if (acidentes[i] > maisAcidentes){
                maisAcidentes = acidentes[i];
                maisAcidentesCidade = cidades[i];
            }
        }
        Integer menosAcidentes = acidentes[0];
        String menosAcidentesCidade = cidades[0];
        for (int i = 0; i < acidentes.length; i++) {
            if (acidentes[i] < menosAcidentes){
                menosAcidentes = acidentes[i];
                menosAcidentesCidade = cidades[i];
            }
        }

        System.out.println("A cidade com mais acidentes e a " +maisAcidentesCidade+ " com: " +maisAcidentes+ " acidentes.");
        System.out.println("A cidade com menos acidentes e a " +menosAcidentesCidade+ " com: " +menosAcidentes+ " acidentes.");

        System.out.println("A razão entre quantidade de acidentes por quantidade de veículos em: ");
        Double razao, acidentesD, carrosD;
        for (int i = 0; i < cidades.length; i++){
            acidentesD = Double.valueOf(acidentes[i]);
            carrosD = Double.valueOf(carros[i]);
            razao = acidentesD/carrosD;
            System.out.println(cidades[i] + " e de: " + razao);
        }

        Integer media = 0;
        for (int i = 0; i < cidades.length; i++){
            media = media + carros[i];
        }
        System.out.println("A média de veículos nas cinco cidades e de: " + media/5);

        Integer mediaComMenosDeDuzentos = 0, aux = 0;
        for (int i = 0; i < cidades.length; i++){
            if (carros[i] < 200){
                mediaComMenosDeDuzentos = carros[i];
                aux++;
            }
        }
        System.out.println("A média de veículos nas cinco cidades com menos de duzentos veiculos e de: " + mediaComMenosDeDuzentos/aux);
        sc.close();
    }
}
