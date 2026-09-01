import javax.swing.*;
import java.awt.*;
public class ParteB_Exercicio10 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Título do Exercício");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);

        // ======== ÁREA A ALTERAR EM CADA EXERCÍCIO ========
        // ======== LAYOUTS COMBINADOS ========

        JPanel root = new JPanel(new BorderLayout(10, 10)); 
 
        JPanel topo = new JPanel(new FlowLayout()); 
        topo.add(new JLabel("Formulário")); 
        root.add(topo, BorderLayout.NORTH); 
        
        JPanel form = new JPanel(new GridLayout(3, 2, 5, 5)); 
        form.add(new JLabel("Nome:")); form.add(new JTextField(15)); 
        form.add(new JLabel("Email:")); form.add(new JTextField(15)); 
        form.add(new JLabel("País:")); form.add(new JComboBox<>(new String[]{"Moz", 
        "PT", "BR"})); 
        root.add(form, BorderLayout.CENTER); 
        
        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.RIGHT)); 
        botoes.add(new JButton("Guardar")); 
        botoes.add(new JButton("Limpar")); 
        root.add(botoes, BorderLayout.SOUTH); 
        
        f.setContentPane(root);

        // ==================================================

        f.setVisible(true);
    }

}