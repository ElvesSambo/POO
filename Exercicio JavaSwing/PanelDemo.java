import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*; 
public class PanelDemo extends JFrame { 
   private JPanel buttonPanel;     
   private JButton buttons[ ]; 
   public PanelDemo( ) { 
      super( "Panel Demo" ); 
      Container c = getContentPane();       
      buttonPanel = new JPanel();        
      buttons = new JButton[ 5 ]; 
      buttonPanel.setLayout( new GridLayout( 1, buttons.length ) ); 
      for ( int i = 0; i < buttons.length; i++ ) { 
         buttons[ i ] = new JButton( "Button " + (i + 1) );           
         buttonPanel.add( buttons[ i ] ); 
      } 

      // ALINEA a)

       //c.add( buttonPanel, BorderLayout.SOUTH);     
       c.add(buttonPanel, BorderLayout.NORTH);
       JPanel lowerPanel = new JPanel();
       JButton OKButton = new JButton( "OK" );
       JButton CancelButton = new JButton( "CANCEL" ); 
       lowerPanel.add( OKButton );
       lowerPanel.add( CancelButton );
       c.add(lowerPanel, BorderLayout.SOUTH);

      //=====================================================================



      setSize( 425, 150 );      
      show( ); 

      } 


      //===========================================
      // ALINEA b)
      public PanelDemo(boolean b) {
        super( "Panel Demo Alinea b)" );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton sideButtons[ ] = new JButton[ 5 ];
        JButton topButtons[ ] = new JButton[ 4 ];
        JTextField textField = new JTextField( 20 );
        textField.setPreferredSize(new Dimension(425,30));

        Container c = getContentPane();

        JPanel topButtonsPanel = new JPanel();
        JPanel sideButtonsPanel = new JPanel(new GridLayout(5, 1,5,5));
        JPanel textPanel = new JPanel();

        for(int i = 0; i < topButtons.length; i++) {
            topButtons[i] = new JButton("BUT" + (i + 1));
            topButtonsPanel.add(topButtons[i]);
        }
        for(int i = 0; i < sideButtons.length; i++) {
            sideButtons[i] = new JButton("BUT" + (i + 1));
            sideButtonsPanel.add(sideButtons[i]);
        }
        textPanel.add(textField);

        topButtonsPanel.setPreferredSize(new Dimension(425,40));
        sideButtonsPanel.setPreferredSize(new Dimension(100, 150));
        textPanel.setPreferredSize(new Dimension(425, 40));

        c.add(topButtonsPanel, BorderLayout.NORTH);
        c.add(sideButtonsPanel, BorderLayout.WEST);
        c.add(textPanel, BorderLayout.SOUTH);

      //=====================================================================



      setSize( 425, 230 );      
      show( ); 

      } 

      public static void main( String args[] ){ 
      //PanelDemo app = new PanelDemo( );        
    //   app.addWindowListener( new WindowAdapter() {              
    //      public void windowClosing( WindowEvent e ){  
    //                System.exit( 0 );  
    //              }   
    //       }  ); 

          PanelDemo app = new PanelDemo(true);
          app.addWindowListener( new WindowAdapter() {              
         public void windowClosing( WindowEvent e ){  
                   System.exit( 0 );  
                 }   
          }  ); 
      } 
}

// Para a alinea b), foi criado um outro construtor, que vai receber um parametro
//booleano para se diferenciar do consrutor original do enunciado