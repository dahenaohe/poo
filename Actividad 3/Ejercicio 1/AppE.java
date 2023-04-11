import javax.swing.SwingUtilities;
public class AppE {
    public static void main (String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                VentanaE ventana = new VentanaE();
                ventana.setVisible(true);
            }
        });
    }
}