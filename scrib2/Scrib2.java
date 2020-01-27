/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrib2;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author robertsonbrinker
 */
public class Scrib2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
    //WINDOW WITH FONT
         // create a rich text pane
    JTextPane textPane = new JTextPane(); //Pane created
    JScrollPane scrollPane = new JScrollPane(textPane,
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //scrolling defined
    
    // install the editor kit
    StyledEditorKit editorKit = new StyledEditorKit();
    textPane.setEditorKit(editorKit);
    
    // build the menu
    JMenu fontMenu = new JMenu("Font Size"); //create menu
    for (int i = 48; i >= 8; i -= 10) {
      JMenuItem menuItem = new JMenuItem("" + i); // create menu items
      
      // add an action
      menuItem.addActionListener(new StyledEditorKit.FontSizeAction("myaction-" + i, i));
      fontMenu.add(menuItem);
    }
    
    JMenuBar menuBar = new JMenuBar();
    menuBar.add(fontMenu);
    
    // show in a frame
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    frame.setJMenuBar(menuBar);
    frame.setContentPane(scrollPane);
    frame.setVisible(true);
    
    //-------
    
    //WINDOW WITH BOLDING
     Frame canvas = new Frame();
        canvas.setBounds(0, 0, 433, 400);
        canvas.setVisible(true);
        canvas.setTitle("SCRIB");
        canvas.setResizable(true);
                //btnBold.addActionListener(new StyledEditorKit.BoldAction());

        
        //btnBold.addActionListener(new StyledEditorKit.BoldAction());
        
    
        
    }
    
}
