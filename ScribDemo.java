
package ScribEditor;

import javax.swing.JFrame;


public class ScribDemo {

  
    public static void main(String[] args) {
        ScribPadGui obj = new ScribPadGui();
        obj.setBounds(0, 0, 600, 500);
        obj.setTitle("Scrib");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
