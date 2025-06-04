package nickolasaranha.introducao;
import javax.swing.*;

public class Ex0802 {
    public static void main(String[] args) {

        String cpf;
        boolean cpfvalido = false;
        while (cpfvalido == false) {
            cpf = JOptionPane.showInputDialog(null, "Insira o CPF: ");

            if(cpf == null) {
                System.exit(0);
            } else if (cpf.matches(".*\\D+.*") ) {
                JOptionPane.showMessageDialog(null, "O CPF não é válido: Só pode ter números");
            } else if (cpf.length() != 11) {
                JOptionPane.showMessageDialog(null, "O CPF não é válido: Deve haver 11 dígitos");
            }
            else cpfvalido = true;

        }
    }
}
