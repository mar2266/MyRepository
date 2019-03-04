/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iq;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Maryoom
 */
public class Test extends JPanel {
    
    private JLabel age, name;
    private JPanel pn1, pn2, pn3;
    private JTextField ageTx, nameTx;
    private JButton done, reset;
    private JLabel[] q;
    private JRadioButton[] ans;
    private ButtonGroup[] group;
    private double score=0;
    private GridBagLayout lay;
    private GridBagConstraints constraints;
    private int mark;
    
    public Test(){
        lay=new GridBagLayout();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        constraints =new GridBagConstraints();
        mark=0;
        pn1=new JPanel();
        pn2=new JPanel();
        pn3=new JPanel();
        
        age=new JLabel("Your age:");
        name=new JLabel("Your name:");
        ageTx=new JTextField(5);
        nameTx=new JTextField(10);
        pn1.add(age);
        pn1.add(ageTx);
        pn1.add(name);
        pn1.add(nameTx);
        pn1.setLayout(new BoxLayout(pn1,BoxLayout.Y_AXIS));
        done=new JButton("Done");
        reset=new JButton("Reset");
        pn2=new JPanel();
        pn2.setLayout(new BoxLayout(pn2, BoxLayout.X_AXIS));
        pn2.add(done);
        pn2.add(reset);
        
        pn3=new JPanel();
        pn3.setLayout(new BoxLayout(pn3, BoxLayout.Y_AXIS));
        
        q=new JLabel[20];
        ans=new JRadioButton[90];
        group=new ButtonGroup[30];
        
        for(int i=0; i<20; i++)
            group[i]=new ButtonGroup();
        
        for(int i=0; i<20; i++)
        q[i]=new JLabel();
            
        for(int i=0; i<60; i++)
        ans[i]=new JRadioButton();
        
        ActionHandler Buttonhandler=new ActionHandler();
        done.addActionListener(Buttonhandler);
        reset.addActionListener(Buttonhandler);
        
        ItemHandler1 handler1=new ItemHandler1();
        
        //for(int i=0; i<60; i+=3)
           // ans[i].addItemListener(handler1);
        
        
    
        //add(age); add(ageTx); add(name);add(nameTx);
        
        for(int i=0; i<20; i++)
            q[i].setText("Question"+(i+1)+": ");
        
        for(int a=0; a<60; a+=3)
            ans[a].setText("a. ");
        for(int b=1; b<60; b+=3)
            ans[b].setText("b. ");
        for(int c=2; c<60; c+=3)
            ans[c].setText("c. ");
        
        q[0].setText(q[0].getText()+"Find the answer that best completes the analogy:\nBook is to Reading as Fork is to:");
        ans[0].setText(ans[0].getText()+"drawing");
        ans[1].setText(ans[1].getText()+"Reading");
        ans[2].setText(ans[2].getText()+"eating");  ans[2].addItemListener(handler1);
        
        q[1].setText(q[1].getText()+"What number best completes the analogy:\n8:4 as 10:");
        ans[3].setText(ans[3].getText()+"3");
        ans[4].setText(ans[4].getText()+"5"); ans[4].addItemListener(handler1);
        ans[5].setText(ans[5].getText()+"24");
        
        q[2].setText(q[2].getText()+"Which number should come next in the pattern?\n37, 34, 31, 28");
        ans[6].setText(ans[6].getText()+"25"); ans[6].addItemListener(handler1);
        ans[7].setText(ans[7].getText()+"33");
        ans[8].setText(ans[8].getText()+"23");
        
        q[3].setText(q[3].getText()+"Which one of the five is least like the other four?");
        ans[9].setText(ans[9].getText()+"Mouse");
        ans[10].setText(ans[10].getText()+"Lion");
        ans[11].setText(ans[11].getText()+"Snake"); ans[11].addItemListener(handler1);
        
        q[4].setText(q[4].getText()+"Mary, who is sixteen years old, is four times as old as her brother.\n How old will Mary be when she is twice as old as her brother?");
        ans[12].setText(ans[12].getText()+"20");
        ans[13].setText(ans[13].getText()+"24"); ans[13].addItemListener(handler1);
        ans[14].setText(ans[14].getText()+"25");
        
        q[5].setText(q[5].getText()+"Which one of the five choices makes the best comparison?\n PEACH is to HCAEP as 46251 is to:");
        ans[15].setText(ans[15].getText()+"25641");
        ans[16].setText(ans[16].getText()+"26451");
        ans[17].setText(ans[17].getText()+"15264");  ans[17].addItemListener(handler1);
        
        q[6].setText(q[6].getText()+" Which one of the numbers does not belong in the following series?\n2 - 3 - 6 - 7 - 8 - 14 - 15 - 30");
        ans[18].setText(ans[18].getText()+"EIGHT"); ans[18].addItemListener(handler1);
        ans[19].setText(ans[19].getText()+"FIFTEEN");
        ans[20].setText(ans[20].getText()+"THIRTY");
        
        q[7].setText(q[7].getText()+" If you rearrange the letters \"CIFAIPC\" you would have the name of a(n):");
        ans[21].setText(ans[21].getText()+"Ocean");  ans[21].addItemListener(handler1);
        ans[22].setText(ans[22].getText()+"River");
        ans[23].setText(ans[23].getText()+"Country");
        
        q[8].setText(q[8].getText()+" Choose the number that is 1/4 of 1/2 of 1/5 of 200:");
        ans[24].setText(ans[24].getText()+"2");
        ans[25].setText(ans[25].getText()+"5"); ans[25].addItemListener(handler1);
        ans[26].setText(ans[26].getText()+"25");
        
        q[9].setText(q[9].getText()+"John needs 13 bottles of water from the store. John can only carry 3 at a time.\n What's the minimum number of trips John needs to make to the store?");
        ans[27].setText(ans[27].getText()+"4");
        ans[28].setText(ans[28].getText()+"5"); ans[28].addItemListener(handler1);
        ans[29].setText(ans[29].getText()+"6");
        
        q[10].setText(q[10].getText()+" What is the missing number in the sequence shown below?: 1-8-27-?-125-246"); 
        ans[30].setText(ans[30].getText()+"36"); 
        ans[31].setText(ans[31].getText()+"46");
        ans[32].setText(ans[32].getText()+"64");ans[32].addItemListener(handler1);
        
        q[11].setText(q[11].getText()+" Which one of the following things is the least like the others?:"); 
        ans[33].setText(ans[33].getText()+"Painting");
        ans[34].setText(ans[34].getText()+"Novel"); 
        ans[35].setText(ans[35].getText()+"Flower"); ans[35].addItemListener(handler1);
        
        q[12].setText(q[12].getText()+"Ahmad likes 25 but not 24, he likes 400 but not 300, he likes 144 but not 145. What does he like ?:");
        ans[36].setText(ans[36].getText()+"124");
        ans[37].setText(ans[37].getText()+"1600");  ans[37].addItemListener(handler1);
        ans[38].setText(ans[38].getText()+"200");
        
        q[13].setText(q[13].getText()+"which one of the numbers does not belong in the following serial \n 1,2,5,10,13,26,29,48 ?:"); 
        ans[39].setText(ans[39].getText()+"1");
        ans[40].setText(ans[40].getText()+"48"); ans[40].addItemListener(handler1);
        ans[41].setText(ans[41].getText()+"29");
        
        q[14].setText(q[14].getText()+"If you arrange the letters  CIFAIPC  you will have the name of a/an:");
        ans[42].setText(ans[42].getText()+"ocean"); ans[42].addItemListener(handler1);
        ans[43].setText(ans[43].getText()+"animal");
        ans[44].setText(ans[44].getText()+"county");
        
        q[15].setText(q[15].getText()+"choose the word most similar to  trustworthy :");
        ans[45].setText(ans[45].getText()+"reliable");  ans[45].addItemListener(handler1);
        ans[46].setText(ans[46].getText()+"relevant"); 
        ans[47].setText(ans[47].getText()+"tenacity");
        

        
        for(int i=0; i<15; i++){
            pn3.add(q[i]);
             for(int j=0; j<3; j++){
                pn3.add(ans[(i*3+j)]);
                group[i].add(ans[i*3+j]);
            }
        }
   //addComponent(pn1, 5,5,10,7);
        constraints.fill= GridBagConstraints.BOTH;
   add(pn3);
   constraints.fill= GridBagConstraints.BOTH;
  add(pn2);
        
    }
    	

    private class ActionHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==reset){
           for(int i=0; i<15; i++)
               group[i].clearSelection();
            }
           else if(e.getSource()==done)
               JOptionPane.showMessageDialog(null, "Yor mark is "+mark+" ..!");
        }
        }
        
    
    private class ItemHandler1 implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            mark+=1;
        }
        
    }
    
}
