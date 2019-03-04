/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iq;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
/**
 *
 * @author Maryoom
 */
public class LogIn extends JPanel{
    JPanel logger=new JPanel();
    private JButton user, admin;
    private JLabel yourName, yourAge, pic;
    private JTextField name,age;
    private JPasswordField password;
    private Icon mg;
    
    public LogIn(){
        mg=new ImageIcon(getClass().getResource("IQ1.png"));
        yourName=new JLabel("Username:");
        pic=new JLabel(mg,SwingConstants.CENTER);
        yourAge=new JLabel("Age:");
        name=new JTextField(20);
        age=new JTextField(10);
        password=new JPasswordField(10);
        user=new JButton("User");
        admin=new JButton("Admin");
        logger.setLayout(new  BoxLayout(logger,BoxLayout.Y_AXIS));
        logger.add(pic);
        logger.add(yourName);
        logger.add(name);
        logger.add(yourAge);
        logger.add(age);
        JOptionPane.showMessageDialog(null,logger, "Login", JOptionPane.PLAIN_MESSAGE);
        
    }
    public int getAge(){
        int age1;
        age1=Integer.parseInt(age.getText());
        return age1;
    }
}
