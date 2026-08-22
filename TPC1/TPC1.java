package TPC1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;


public class TPC1 extends JFrame{

  TPC1(){
    //Frame
    this.setSize(300,450);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("L1");
    this.setLayout(new BorderLayout());

    //========================================
    //Tres panels para o Frame
    JPanel panel1=new JPanel(new FlowLayout(FlowLayout.RIGHT,10,5));
    JPanel panel2=new JPanel(new GridLayout(4,3));
    JPanel panel3=new JPanel(new FlowLayout(FlowLayout.CENTER,10,5));

    panel1.setSize(300,40);
    panel2.setSize(300,270);
    panel3.setSize(300,40);    

    //=========================================
    //Label para o painel  de cima
    JLabel label = new JLabel("5122299");
    label.setSize(300,40);
    panel1.add(label);


    //=========================================
    //Divisao do panel central contendo os teclados numericos
    JButton[] button = new JButton[12];
    for(int i=0; i <12; i++){
        button[i]= new JButton();
        if(i<9){
            button[i].setText(i+1+"");
        }
    }
    button[9].setText("*");
    button[10].setText("0");
    button[11].setText("#");
    for(int i=0;i<12;i++){
        panel2.add(button[i]);
    }

    //==========================================
    //Botoes do painel de baixo
    JButton button1 = new JButton("send");
    JButton button2 = new JButton("end");

    panel3.add(button1);
    panel3.add(button2);


    //==========================================
    //Adicao dos panels no Frame
    this.add(panel1, BorderLayout.NORTH);
    this.add(panel2, BorderLayout.CENTER);
    this.add(panel3, BorderLayout.SOUTH);

    this.setVisible(true);
  }

  public static void main(String[] args){
    new TPC1();
  }

}