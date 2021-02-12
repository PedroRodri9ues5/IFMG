import javax.swing.JOptionPane;

public class Teste{
    public static void main( String args[] ){

        String num = new String();
        num = JOptionPane.showInputDialog(null,
                "Entre com um número de 5 digitos",
                "PALINDROMOS", JOptionPane.QUESTION_MESSAGE);

        while( num.length() != 5 ){
            JOptionPane.showMessageDialog(null,
                    "O número possui apenas " +num.length()+
                            " algarismos!\nTente novamente!");

            num = JOptionPane.showInputDialog(null,
                    "Entre com um número de 5 digitos",
                    "PALINDROMOS", JOptionPane.QUESTION_MESSAGE);
        }

        if( num.charAt(0) == num.charAt(4) && num.charAt(1) == num.charAt(3)){
            JOptionPane.showMessageDialog(null,
                    "O número: " +num+ " é palindromo",
                    "PALINDROMOS", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "O número: " +num+ " não é palindromo",
                    "PALINDROMOS", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}