import java.util.Scanner;

public class PedroRodrigues17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aLado, bLado, cLado;
        boolean trianguloValido;

        imprimir("Digite o valor do primeiro lado de um triangulo: ");
        aLado = sc.nextDouble();

        imprimir("Digite o valor do segundo lado: ");
        bLado = sc.nextDouble();

        imprimir("Digite o valor do terceiro lado: ");
        cLado = sc.nextDouble();

        trianguloValido = (aLado < bLado + cLado) && (aLado > bLado - cLado);

        if (trianguloValido){
            if (!(aLado == bLado) && !(bLado == cLado) && !(aLado == cLado)){
                imprimir("O triangulo formado sera escaleno!");
            }else if ((aLado == bLado) && (bLado == cLado) && (aLado == cLado)){
                imprimir("O triangulo formado sera equilaero!");
            }else if ((aLado == bLado ^ bLado == cLado) ^ aLado == cLado){
                imprimir("O triangulo formado sera isosceles!");
            }
        }else {
            erroUm("VALORES NAO FORMAM UM TRIANGULO!");
        }

        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
    static void erroUm(String texto ){
        System.err.println(texto);
        System.exit(1);
    }
}
