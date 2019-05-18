
/**
 * Write a description of class ColorDisplay here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Monday, 28 May 2018)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
public class ColorDisplay implements ActionListener
{
    private JPanel upperPanel, buttomPanel;
    private JButton jbDisplayColor;
    private JLabel jlRed, jlGreen, jlBlue;
    private JTextField jtfRed, jtfGreen, jtfBlue;
    JFrame frame;
    public ColorDisplay(){
        colorPanel();
    }
    
    public void colorPanel(){
        frame=new JFrame("Color Display");
        frame.setSize(250,220);
        frame.setLayout(null);
        
        upperPanel=new JPanel();
        upperPanel.setBorder(BorderFactory.createTitledBorder("Color Display"));
        upperPanel.setBounds(5,5,240,90);
        upperPanel.setLayout(null);
        frame.add(upperPanel);
        
        buttomPanel=new JPanel(); 
        buttomPanel.setBorder(BorderFactory.createTitledBorder("Input Panel"));
        buttomPanel.setBounds(5,100,240,115);
        buttomPanel.setLayout(null);
        frame.add(buttomPanel);
            jlRed= new JLabel("Red");
            jlRed.setBounds(20,10,50,30);
            buttomPanel.add(jlRed);
                jtfRed= new JTextField("");
                jtfRed.setBounds(20,40,50,20);
                buttomPanel.add(jtfRed);
            
            jlGreen= new JLabel("Greed");
            jlGreen.setBounds(90,10,50,30);
            buttomPanel.add(jlGreen);
                jtfGreen= new JTextField("");
                jtfGreen.setBounds(90,40,50,20);
                buttomPanel.add(jtfGreen);
            
            jlBlue= new JLabel("Blue");
            jlBlue.setBounds(170,10,50,30);
            buttomPanel.add(jlBlue);
                jtfBlue= new JTextField("");
                jtfBlue.setBounds(170,40,50,20);
                buttomPanel.add(jtfBlue);
                
            jbDisplayColor=new JButton("Display Color");
            jbDisplayColor.setBounds(55,70,127,35);
            jbDisplayColor.addActionListener(this);
            buttomPanel.add(jbDisplayColor);
        
        frame.setVisible(true);
    }
    
    public void displayColor(){
        try{
            if(jtfRed.getText().equals("") || jtfGreen.getText().equals("") || jtfBlue.getText().equals("")){
                throw new NullPointerException();
            }
            else{
                int red = Integer.parseInt(jtfRed.getText());
                int green = Integer.parseInt(jtfGreen.getText());
                int blue = Integer.parseInt(jtfBlue.getText());
                if((red>=0 && green>=0 && blue>=0)){
                    if((red<=255 && green<=255 && blue<=255)){
                        Color colour= new Color(red,green,blue);
                        upperPanel.setBackground(colour);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Please, input RGB value below 255","Error!!! Invalid RGB value" , JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Please, input RGB value above 0","Error!!! Invalid RGB value" , JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(NullPointerException npe){
            JOptionPane.showMessageDialog(frame, "Please, Fill the all text field","Error!!! empty textfield" , JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException nfe){
           JOptionPane.showMessageDialog(frame, "Please, Enter the numerical value ","Error!!! Number format error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actionPerformed(ActionEvent cd){
        if(cd.getSource()==jbDisplayColor){
           displayColor();
        }
    }
    
    public static void main(String[]args){
        new ColorDisplay();
    }
}
