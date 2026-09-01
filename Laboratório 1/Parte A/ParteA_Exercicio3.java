import javax.swing.*;
import java.awt.*;
public class ParteA_Exercicio3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // === ÁREA A ALTERAR EM CADA EXERCÍCIO ===
        // === CAMPOS DE TEXTO ===
        
        JPanel root = new JPanel(); 
        root.add(new JLabel("Nome:")); 
        root.add(new JTextField(15)); 
        root.add(new JLabel("Senha:")); 
        root.add(new JPasswordField(15)); 
        f.setContentPane(root);

        // ========================================

        f.setVisible(true);
    }

}
