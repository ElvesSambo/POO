import javax.swing.*;
import java.awt.*;
public class ParteA_Exercicio5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // ======== ÁREA A ALTERAR EM CADA EXERCÍCIO ========
        // ======== COMBOBOX E LISTA ========

        JPanel root = new JPanel(); 
 
        JComboBox<String> cb = new JComboBox<>(new String[]{"Azul", "Verde", 
        "Vermelho"}); 
        root.add(new JLabel("Cor:")); 
        root.add(cb); 
        
        JList<String> lst = new JList<>(new String[]{"Maçã", "Banana", "Uva"}); 
        root.add(new JLabel("Fruta:")); 
        root.add(new JScrollPane(lst)); 
        
        f.setContentPane(root);

        // ==================================================

        f.setVisible(true);
    }

}