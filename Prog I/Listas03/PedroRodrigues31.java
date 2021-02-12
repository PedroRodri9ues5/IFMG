import java.util.Scanner;

public class PedroRodrigues31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voto, op1 = 0, op2 = 0, op3 = 0, op4 = 0, op5 = 0, op6 = 0;

        do {
            System.out.println("====================\n" +
                    "Votacao presidencial\n" +
                    "====================\n" +
                    "Opções:\n" +
                    "1 - Candidato 1\n" +
                    "2 - Candidato 2\n" +
                    "3 - Candidato 3\n" +
                    "4 - Candidato 4\n" +
                    "5 – Voto em branco\n" +
                    "Outros valores positivos - Voto nulo\n" +
                    "Para sair digite - 0\n" +
                    "====================");
            voto = sc.nextInt();
            if (voto < 0) {
                System.err.println("VALOR INVALIDO, TENTE NOVAMENTE!");
            }else if (voto == 0) {
                System.err.println("Finalizando...");
            }else if (voto == 1){
                op1 ++;
                System.out.println("VOTO COMPUTADO");
            }else if (voto == 2){
                op2 ++;
                System.out.println("VOTO COMPUTADO");
            }else if (voto == 3){
                op3 ++;
                System.out.println("VOTO COMPUTADO");
            }else if (voto == 4){
                op4 ++;
                System.out.println("VOTO COMPUTADO");
            }else if (voto == 5){
                op5 ++;
                System.out.println("VOTO COMPUTADO");
            }else if (voto > 5){
                op6 ++;
                System.out.println("VOTO COMPUTADO");
            }
        } while (voto != 0);

        System.out.println(
                "====================\n" +
                "Resultado:\n" +
                "Candidato 1: " + op1 +
                "\nCandidato 2: " + op2 +
                "\nCandidato 3: " + op3 +
                "\nCandidato 4: " + op4 +
                "\nVotos em branco: " + op5 +
                "\nVotos nulo: " + op6 +
                "\n====================");

        sc.close();
    }
}
