import javax.swing.*;  
public class TestaJanela {  // Objeto Janela 
    static JFrame janela = new JFrame("Título da janela"); 
    public static void main (String args[]) { 
      janela.setBounds(50, 100, 400, 150); // Seta posição e tamanho       
      janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      janela.setVisible(true);  // Exibe a janela  } 

      // Alinea b)
      
      for(int i=0; i<400; i++){
        janela.setBounds(50+i,100,400+i,150+i);
        try{
          Thread.sleep(5);

        }catch(InterruptedException e){
          e.printStackTrace(); 
        }

        //===============================
      }
 }
}
/*
  O programa do enunciado tinha uma falta de uma chaveta de fechamento e por 
 isso nao compilava.
  
  a) - DISPOSE ON CLOSE: fecha a janela, mas o programa continua rodando em background se existirem outras 
  janelas abetras.
     - DO NOTHING ON CLOSE: nao faz nada, a janela continua aberta.
     - HIDE ON CLOSE: fecha a janela, mas o programa continua rodando em background.

  b) -  for(int i=0; i<400; i++){
          janela.setBounds(50+i,100,400+i,150+i);
          try{
            Thread.sleep(5);

          }catch(InterruptedException e){
            e.printStackTrace(); 
          }
      }
*/ 