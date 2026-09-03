import javax.swing.*; class SimpleFrame 
{  public static void main(String args[ ])  { 
  JFrame frame = new JFrame("Swing Application"); 
  JButton but = new JButton("I am a Swing button"); 
  JLabel texto = new JLabel("Number of button clicks: 0");    
  JPanel painel = new JPanel();    

  painel.add(but);   painel.add(texto);       
   frame.getContentPane( ).add(painel);   
   frame.pack( );   
   frame.show( ); 
 } 
} 

/*
  Como metodo show, a IDE (VS Code) sugere que o metodo show() esta obsoleto, 
e recomenda o uso do metodo setVisible(true), mas o programa ainda assim corre normalmente, 
e o botão é exibido na tela.
  No enunciado, as aspas dos JButtons sao curvas e nao retas, e isso causa erro
de compilacao. Para poder compilar, foi necessario trocar as aspas ccurvas por
retas.
  Por nao se definir o que acontece quando se fecha a janela do programa, 
o programa continua rodando em background, mesmo apos o fechamento da janela.
  O botao nao tem funcionalidade, e nao ha nenhum evento associado a ele.
  Por nao existir tamanho pre-definido para a janela, o tamanho da janela se 
ajusta automaticamente ao tamanho do painel que por su vez se ajusta ao tamanho
do botao e do label.
*/
