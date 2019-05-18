
/**
 * Write a description of class Phone here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Monday, 29 May 2018)
 */
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class Phone implements ActionListener
{
    private JTextField jtfDisplay;
    private JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7,
    jb8, jb9, jbCall, jbHangup, jbClear;
    private JFrame jframe;
    String phoneNumber="";
    public Phone(){
        jframe= new JFrame("Phone App");
        jframe.setSize(357,260);
        
        jtfDisplay=new JTextField();
        jtfDisplay.setBounds(20,10,320,35);
        jtfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        jframe.add(jtfDisplay);
        
        jb1=new JButton("1");
        jb1.setBounds(20,50,100,40);
        jb1.addActionListener(this);
        jframe.add(jb1);
        
        jb2=new JButton("2");
        jb2.setBounds(130,50,100,40);
        jb2.addActionListener(this);
        jframe.add(jb2);
        
        jb3=new JButton("3");
        jb3.setBounds(240,50,100,40);
        jb3.addActionListener(this);
        jframe.add(jb3);
        
        jb4=new JButton("4");
        jb4.setBounds(20,100,100,40);
        jb4.addActionListener(this);
        jframe.add(jb4);
        
        jb5=new JButton("5");
        jb5.setBounds(130,100,100,40);
        jb5.addActionListener(this);
        jframe.add(jb5);
        
        jb6=new JButton("6");
        jb6.setBounds(240,100,100,40);
        jb6.addActionListener(this);
        jframe.add(jb6);
        
        jb7=new JButton("7");
        jb7.setBounds(20,150,100,40);
        jb7.addActionListener(this);
        jframe.add(jb7);
        
        jb8=new JButton("8");
        jb8.setBounds(130,150,100,40);
        jb8.addActionListener(this);
        jframe.add(jb8);
        
        jb9=new JButton("9");
        jb9.setBounds(240,150,100,40);
        jb9.addActionListener(this);
        jframe.add(jb9);
        
        jbClear=new JButton("CLEAR");
        jbClear.setBounds(20,200,100,40);
        jbClear.addActionListener(this);
        jframe.add(jbClear);
        
        jb0=new JButton("0");
        jb0.setBounds(130,200,100,40);
        jb0.addActionListener(this);
        jframe.add(jb0);
        
        jbCall=new JButton("CALL");
        jbCall.setBounds(240,200,100,40);
        jbCall.addActionListener(this);
        jframe.add(jbCall);
        
        jbHangup=new JButton("HANG UP");
        jbHangup.setBounds(240,200,100,40);
        jbHangup.addActionListener(this);
        jbHangup.setVisible(false);
        jframe.add(jbHangup);
        
        jframe.setLayout(null);
        jframe.setVisible(true);
        
        phoneNumber= jtfDisplay.getText();
    }
    
    public void call(String phoneNumber){
        jtfDisplay.setText(phoneNumber+"   Calling...");
        jtfDisplay.setHorizontalAlignment(SwingConstants.LEFT);
        
        jbHangup.setVisible(true);
        jbCall.setVisible(false);
        jb1.setEnabled(false);
        jb2.setEnabled(false);
        jb3.setEnabled(false);
        jb4.setEnabled(false);
        jb5.setEnabled(false);
        jb6.setEnabled(false);
        jb7.setEnabled(false);
        jb8.setEnabled(false);
        jb9.setEnabled(false);
        jb0.setEnabled(false);
        jbClear.setEnabled(false);
    }
    
    public void hangup(){
        jbHangup.setVisible(false);
        jbCall.setVisible(true);
        jtfDisplay.setText("");
        jtfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        jb1.setEnabled(true);
        jb2.setEnabled(true);
        jb3.setEnabled(true);
        jb4.setEnabled(true);
        jb5.setEnabled(true);
        jb6.setEnabled(true);
        jb7.setEnabled(true);
        jb8.setEnabled(true);
        jb9.setEnabled(true);
        jb0.setEnabled(true);
        jbClear.setEnabled(true);
    }
    
    public void actionPerformed(ActionEvent ph){
        if(ph.getActionCommand()=="1"){
            jtfDisplay.setText(jtfDisplay.getText()+"1");
        }
        
        if(ph.getActionCommand()=="2"){
            jtfDisplay.setText(jtfDisplay.getText()+"2");
        }
        
        if(ph.getActionCommand()=="3"){
            jtfDisplay.setText(jtfDisplay.getText()+"3");
        }
        
        if(ph.getActionCommand()=="4"){
            jtfDisplay.setText(jtfDisplay.getText()+"4");
        }
        
        if(ph.getActionCommand()=="5"){
            jtfDisplay.setText(jtfDisplay.getText()+"5");
        }
        
        if(ph.getActionCommand()=="6"){
            jtfDisplay.setText(jtfDisplay.getText()+"6");
        }
        
        if(ph.getActionCommand()=="7"){
            jtfDisplay.setText(jtfDisplay.getText()+"7");
        }
        
        if(ph.getActionCommand()=="8"){
            jtfDisplay.setText(jtfDisplay.getText()+"8");
        }
        
        if(ph.getActionCommand()=="9"){
            jtfDisplay.setText(jtfDisplay.getText()+"9");
        }
        
        if(ph.getActionCommand()=="0"){
            jtfDisplay.setText(jtfDisplay.getText()+"0");
        }
        
        if(ph.getActionCommand()=="CALL"){
            phoneNumber= jtfDisplay.getText();
            if(!phoneNumber.equals("")){
                if(phoneNumber.length()>=10){
                    call(phoneNumber);
                }
                else{
                    JOptionPane.showMessageDialog(jframe, "Sorry the phone number is not vallid.");
                }
            }
            else{
                JOptionPane.showMessageDialog(jframe, "Please enter phone number to make a call");   
            }
        }
        
        if(ph.getActionCommand()=="HANG UP"){
            hangup();
        }
        
        if(ph.getActionCommand()=="CLEAR"){
            jtfDisplay.setText("");
        }
        
    }
    
    public static void main(String[]args){
        new Phone();
    }
}
