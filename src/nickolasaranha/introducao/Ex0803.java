package nickolasaranha.introducao;

import javax.swing.*;

public class Ex0803 {
    public static void main(String[] args) {
        int n = 0;
        boolean numerovalido = false;

        while (numerovalido == false) {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número a ser fatorado de 0 a 25: "));

            int fatorial = 0;
            if (n < 0 || n > 25) {
                JOptionPane.showMessageDialog(null, "Número Invalido: Deve ser um número entre 0 e 25");
            }
            }

            while (n != 1) {

        }
}
}
