import java.awt.Component;
import java.awt.event.*;    
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
class Radio extends JFrame implements ActionListener{    
JRadioButton rb1,rb2,rb3;        
Radio(){      
rb1=new JRadioButton("IT");    
rb1.setBounds(100,50,100,30);      
rb2=new JRadioButton("CS");    
rb2.setBounds(100,100,100,30);    
rb3=new JRadioButton("CIVIL");    
rb3.setBounds(100,150,100,30);     
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2); bg.add(rb3);        
    Component Component = add(rb1);   
add(rb2);add(rb3);    
setSize(300,300);    
setLayout(null);    
setVisible(true);    
}    
public void actionPerformed(ActionEvent e){    
System.exit(0);
}
public static void main(String args[]){    
new Radio();    
}
}   