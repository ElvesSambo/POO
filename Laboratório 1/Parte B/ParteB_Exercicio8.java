import javax.swing.*;
import java.awt.*;
public class ParteB_Exercicio8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // ======== ÁREA A ALTERAR EM CADA EXERCÍCIO ========
        // ========BORDERLAYOUT ========

        JPanel root = new JPanel(new BorderLayout(5, 5)); 
        root.add(new JLabel("NORTH", JLabel.CENTER), BorderLayout.NORTH); 
        root.add(new JLabel("SOUTH", JLabel.CENTER), BorderLayout.SOUTH); 
        root.add(new JLabel("EAST", JLabel.CENTER), BorderLayout.EAST); 
        root.add(new JLabel("WEST", JLabel.CENTER), BorderLayout.WEST); 
        root.add(new JTextArea("CENTER"), BorderLayout.CENTER); 
        f.setContentPane(root);

        // ==================================================

        f.setVisible(true);
    }

}