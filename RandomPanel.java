
/**
 * Write a description of class RandomPanel here.
 *
 * @author (Indra Bahadur Oli)
 * @version (Monday, 28 May 2018)
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.BorderFactory;
import java.awt.Font;
public class RandomPanel extends JPanel implements ActionListener
{
    private JPanel textPanel, buttonPanel;
    private JButton jbNewRandom;
    private Random randomNum;
    private JLabel randomLabel1, randomLabel2;
    public int number;
    public Font font1, font2;
    public RandomPanel(){
        panel();
    }
    
    public void panel(){
        JFrame frame=new JFrame("Random Number");
        frame.setSize(157,180);
        frame.setLayout(null);
        
        textPanel=new JPanel();
        textPanel.setBorder(BorderFactory.createTitledBorder("Text Panel"));
        textPanel.setBounds(5,5,145,90);
        textPanel.setLayout(null);
        frame.add(textPanel);
        
        font1 = new Font("Arial Black", Font.BOLD,70);
        font2 = new Font("Arial Black", Font.BOLD,60);
        
            randomLabel1 =new JLabel();
            randomLabel1.setBounds(0,5,140,90);
            randomLabel1.setFont(font1);
            randomLabel1.setHorizontalAlignment(JLabel.CENTER);
            randomLabel1.setVerticalAlignment(JLabel.CENTER);
            textPanel.add(randomLabel1);
            
            randomLabel2 =new JLabel();
            randomLabel2.setBounds(0,5,140,90);
            randomLabel2.setFont(font2);
            randomLabel2.setHorizontalAlignment(JLabel.CENTER);
            randomLabel2.setVerticalAlignment(JLabel.CENTER);
            textPanel.add(randomLabel2);
        
        buttonPanel=new JPanel(); 
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Button Panel"));
        buttonPanel.setBounds(5,105,145,70);
        buttonPanel.setLayout(null);
        frame.add(buttonPanel);
            jbNewRandom=new JButton("New Random");
            jbNewRandom.setBounds(9,20,127,35);
            jbNewRandom.addActionListener(this);
            buttonPanel.add(jbNewRandom);
        
        frame.setVisible(true);
    }
    
    public void randomNumber(){
        randomNum = new Random(); 
        number = randomNum.nextInt(100);
        String num= String.valueOf(number);
        
        if(num.length()==1){
           randomLabel2.setVisible(false);
           randomLabel1.setVisible(true);
           randomLabel1.setText(String.valueOf(number));
        }
        else if(num.length()>=2){
            randomLabel2.setVisible(true); 
            randomLabel1.setVisible(false); 
            randomLabel2.setText(String.valueOf(number));
        }
    } 
    
    public void actionPerformed(ActionEvent rn){
        if(rn.getSource()==jbNewRandom){
           randomNumber();
        }
    }
}
