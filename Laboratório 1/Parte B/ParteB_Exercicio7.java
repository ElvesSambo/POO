import javax.swing.*;
import java.awt.*;
public class ParteB_Exercicio7 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // ======== ÁREA A ALTERAR EM CADA EXERCÍCIO ========
        // ======== FLOWLAYOUT ========

        JPanel root = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10)); 
        for (int i = 1; i <= 8; i++) { 
            root.add(new JButton("Botão " + i)); 
        } 
        f.setContentPane(root); 

        // ==================================================

        f.setVisible(true);
    }

}