import javax.swing.*; import java.awt.*; 
public class TestaContainer {   // Objeto Janela 
static JFrame janela = new JFrame("Título da janela"); 
 public static void main (String args[ ]) {    
int i; 
 janela.setBounds(50, 100, 400, 150); // Seta posição e tamanho 
janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); 
//FlowLayout flow = new FlowLayout();   // Define o layout do container  
FlowLayout flow = new FlowLayout(FlowLayout.LEFT);   // Define o layout do container  
  
Container caixa = janela.getContentPane(); // Define o tamanho do container   
 caixa.setLayout(flow);   // Seta layout do container    
for (i=1; i<=6; i++){ 
caixa.add(new JButton("Aperte " + i));  // Adiciona um botão   
  } 

  // Alinea c)
  
  JLabel label = new JLabel("Exemplo de texto:"); 
  caixa.add(label); 
  JTextField campo = new JTextField(15);    
  caixa.add(campo); 
  janela.pack(); // Redimensiona a janela

  //========================

 janela.setVisible(true);  // Exibe a janela 
 } 
        } 

/*
    a) - Por causa do FlowLayout(), os botoes sao adicionados na horizontal
  no meio e no topo do container de preferencia, e quando nao ha mais espaco na linha,
  passa para aproxima, comecando sempre do meio.

    b) - Depois dessa troca, os botoes sao adicionados agora comecando da esquerda
  para a direita seguindo a mesma preferencia do topo. Ao ajustar o tamanho da janela
  os botoes passam para a linha a seguir, comecando sempre da esquerda.

    c) - Foi adicionado um JLabel e um JTextField e eles ficam seguindo a mesma 
  preferencia do FlowLayout, ou seja, da esquerda para a direita e do topo para o fundo.
  Ao ajustar o tamanho da janela, eles passam para a linha a seguir,
  comecando sempre da esquerda.

*/