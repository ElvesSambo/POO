import javax.swing.*;
import java.awt.*;
public class AppDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // === ÁREA A ALTERAR EM CADA EXERCÍCIO ===
        JPanel root = new JPanel();
        root.add(new JLabel("Exemplo"));
        f.setContentPane(root);
        // ========================================

        f.setVisible(true);
    }

}
