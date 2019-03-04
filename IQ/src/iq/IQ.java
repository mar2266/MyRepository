/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iq;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Maryoom
 */
public class IQ extends JFrame {
  static  Test ts=new Test();
JMenuBar bar;
JMenu menu1, menu2;
JMenuItem about, exit;
static JScrollPane scr;

public IQ(){
    super("IQ Test");
    setLayout(new BorderLayout());
    scr=new JScrollPane(ts,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    
    bar=new JMenuBar();
    this.setJMenuBar(bar);
    menu1=new JMenu("File");
    menu2=new JMenu("Style");
    about=new JMenuItem("About..");
    exit=new JMenuItem("Exit");
    menu1.add(about);
    menu1.add(exit);
    bar.add(menu1);
    bar.add(menu2);
    ActionHandler handler=new ActionHandler();
    about.addActionListener(handler);
    exit.addActionListener(handler);
    
}

private class ActionHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==exit)
                System.exit(0);
            else if(e.getSource()==about)
                JOptionPane.showMessageDialog(rootPane, "An intelligence quotient (IQ)\n is a total score derived from\n several standardized tests\n designed to assess human intelligence.", "About IQ test", JOptionPane.PLAIN_MESSAGE);
                    }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IQ a=new IQ();
        LogIn log=new LogIn();
        a.add(scr);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(800, 800);
        
        
        // TODO code application logic here
    }
    
}
