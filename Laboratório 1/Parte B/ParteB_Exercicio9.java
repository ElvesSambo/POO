import javax.swing.*;
import java.awt.*;
public class ParteB_Exercicio9 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // ======== ÁREA A ALTERAR EM CADA EXERCÍCIO ========
        // ======== GRIDLAYOUT ========

        JPanel root = new JPanel(new GridLayout(3, 3, 5, 5)); 
        for (int i = 1; i <= 9; i++) { 
            root.add(new JButton("Botão " + i)); 
        } 
        f.setContentPane(root); 

        // ==================================================

        f.setVisible(true);
    }

}