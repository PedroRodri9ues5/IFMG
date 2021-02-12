import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedroRodrigues02 {

    private static void dadosLivroCadastrado( List<Livro> biblioteca, int codigoLivro){
        System.out.println(biblioteca.get(codigoLivro).getNome());
        System.out.println(biblioteca.get(codigoLivro).getAutor());
        System.out.println(biblioteca.get(codigoLivro).getDescricao());
        System.out.println(biblioteca.get(codigoLivro).getAno());
        System.out.println(biblioteca.get(codigoLivro).getPreco());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cadastros;

        System.out.println("Insira a quantidade de livros a serem cadastrados(entre 1 e 100): ");
        cadastros = sc.nextInt();

        while (cadastros > 100 || cadastros < 1){
            System.err.println("NUMERO INVALIDO, TENTE NOVAMENTE");
            System.out.println("Insira a quantidade de livros a serem cadastrados(entre 1 e 100): ");

            cadastros = sc.nextInt();
        }

        List<Livro> biblioteca = new ArrayList<>(cadastros);

        for (int i = 0; i < cadastros; i++) {

            Livro livro = new Livro();

            System.out.println("Insira o nome do " + (i+1) + " livro: ");
            String nome = sc.next();
            livro.setNome(nome);

            System.out.println("Insira o autor do " + (i+1) + " livro: ");
            nome = sc.next();
            livro.setAutor(nome);

            System.out.println("Insira a descricao do " + (i+1) + " livro: ");
            nome = sc.next();
            livro.setDescricao(nome);

            System.out.println("Insira o ano do " + (i+1) + " livro: ");
            Integer ano = sc.nextInt();
            livro.setAno(ano);

            System.out.println("Insira o preco do " + (i+1) + " livro: ");
            Double preco = sc.nextDouble();
            livro.setPreco(preco);

            System.out.println("O codigo desse livro para consulta e: " + i +"\n");
            livro.setCodigo(i);

            biblioteca.add(livro);

        }
        int codigo;

        do {
            System.out.println("Para consultar um livro cadastrado insira seu codigo: ");
            System.err.println("Para sair insira o codigo 999");
            codigo = sc.nextInt();

            if (codigo == 999) System.exit(999);

            if (codigo >= cadastros){
                System.err.println("CODIGO NAO CADASTRADO, TENTE NOVAMENTE!");
            }else dadosLivroCadastrado(biblioteca, codigo);

        }while (codigo < 99 || codigo > 0);

        sc.close();

        }
}
