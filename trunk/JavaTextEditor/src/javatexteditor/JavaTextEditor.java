/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatexteditor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
        
        


/**
 *
 * @author mhcrnl
 */
public class JavaTextEditor {
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Mihai's TextEditor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(375, 300));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        
        frame.pack();
        frame.setVisible(true);
    }
    /**
    JPanel pane = new JPanel();
    
    JavaTextEditor(){
        super("Mihai JavaTextEditor"); setBounds(100, 100, 300, 100);
        
        Container con = this.getContentPane();
        con.add(pane);
        setVisible(true);
        
    }
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new JavaTextEditor();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
