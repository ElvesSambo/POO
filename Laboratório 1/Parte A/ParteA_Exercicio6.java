import javax.swing.*;
import java.awt.*;
public class ParteA_Exercicio6 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // ======== ÁREA A ALTERAR EM CADA EXERCÍCIO ========
        // ======== RADIOBUTTONS E CHECKBOXES ========

        JPanel root = new JPanel(); 
 
        ButtonGroup tamanhos = new ButtonGroup(); 
        JRadioButton p = new JRadioButton("Pequeno", true); 
        JRadioButton m = new JRadioButton("Médio"); 
        JRadioButton g = new JRadioButton("Grande"); 
        tamanhos.add(p); tamanhos.add(m); tamanhos.add(g); 
        
        root.add(new JLabel("Tamanho:")); 
        root.add(p); root.add(m); root.add(g); 
        
        root.add(new JLabel("Extras:")); 
        root.add(new JCheckBox("Queijo")); 
        root.add(new JCheckBox("Bacon")); 
        
        f.setContentPane(root);

        // ==================================================

        f.setVisible(true);
    }

}