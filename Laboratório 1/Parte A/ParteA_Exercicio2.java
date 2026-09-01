import javax.swing.*;
import java.awt.*;
public class ParteA_Exercicio2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // === ÁREA A ALTERAR EM CADA EXERCÍCIO ===
        // === JLABEL COM ICON ===

        JPanel root = new JPanel(); 
        ImageIcon icon = new ImageIcon("logo.png"); // imagem no diretório do projeto 
        JLabel lbl = new JLabel("UEM - POO II", icon, JLabel.CENTER); 
        lbl.setHorizontalTextPosition(SwingConstants.RIGHT); 
        root.add(lbl); 
        f.setContentPane(root);
        
        // ========================================

        f.setVisible(true);
    }

}
