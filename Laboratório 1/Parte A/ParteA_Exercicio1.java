import javax.swing.*;
import java.awt.*;
public class ParteA_Exercicio1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // ======== ÁREA A ALTERAR EM CADA EXERCÍCIO ========
        // ======== PRIMEIRA JANELA COM JLABEL ========

        JPanel root = new JPanel(); // Layout padrão: FlowLayout 
        JLabel lbl = new JLabel("Bem-vindos ao Java Swing!"); 
        root.add(lbl); 
        f.setContentPane(root);

        // ==================================================

        f.setVisible(true);
    }

}