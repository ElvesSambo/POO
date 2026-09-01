import javax.swing.*;
import java.awt.*;
public class ParteA_Exercicio4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // ======== ÁREA A ALTERAR EM CADA EXERCÍCIO ========
        // ======== ÁREA DE TEXTO COM SCROLLBAR ========
        JPanel root = new JPanel(); 
        JTextArea ta = new JTextArea(8, 25); 
        ta.setLineWrap(true); 
        root.add(new JScrollPane(ta)); 
        f.setContentPane(root);

        // ==================================================

        f.setVisible(true);
    }

}