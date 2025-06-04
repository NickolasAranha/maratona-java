package nickolasaranha.introducao;

import javax.swing.*;

public class swing {
    public static void main (String[] args) {

        String name = "";
        boolean nomevalido = false;
        while(nomevalido == false) {
            name = JOptionPane.showInputDialog(null, "Insira seu nome:");
            name.trim();
            if (name.matches(".*\\d+.*")) {
                JOptionPane.showMessageDialog(null, "Nome inválido: Não pode ter números");
            } else if (name.length() < 5 || name.length() > 50) {
                JOptionPane.showMessageDialog(null, "Nome inválido");

            } else nomevalido = true;


        }
        JOptionPane.showMessageDialog(null, "Nome válido: " + name);
        System.exit(0);



    }
}
