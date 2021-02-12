import java.util.Scanner;

public class PedroRodrigues10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, idade;
        imprimir("Insira a idade do paciente: ");
        idade = sc.nextDouble();
        if (idade < 0){
            System.err.println("IDADE INVALIDA!");
            System.exit(2);
        }
        imprimir("Insira o peso do paciente(em quilos): ");
        peso = sc.nextDouble();
        if (peso < 0){
            System.err.println("PESO INVALIDO!");
            System.exit(1);
        }

        if(idade > 12){

            if (peso >= 60){
                System.out.println("O paciente deve tomar 40 gotas do medicamento.");
            }else {
                System.out.println("O paciente deve tomar 35 gotas do medicamento.");
            }

        }else if (idade < 12){
            if (peso >= 5 && peso <= 9){
                System.out.println("O paciente deve tomar 5 gotas do medicamento.");
            }else if (peso >= 9.1 && peso <= 16){
                System.out.println("O paciente deve tomar 10 gotas do medicamento.");
            }else if (peso >= 16.1 && peso <= 24){
                System.out.println("O paciente deve tomar 15 gotas do medicamento.");
            }else if (peso >= 24.1 && peso <= 30){
                System.out.println("O paciente deve tomar 20 gotas do medicamento.");
            }else if (peso > 30){
                System.out.println("O paciente deve tomar 30 gotas do medicamento.");
            }

        }


        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
}