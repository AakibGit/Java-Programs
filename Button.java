import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

class abc 
{
    JFrame j = new JFrame("Java");
    JButton b = new JButton("click me");
    JLabel label = new JLabel("First value");
    JLabel label1 = new JLabel("Second value");
    JLabel label2 = new JLabel();
    JTextField t = new JTextField();
    JTextField t1 = new JTextField();

     

   abc()
   {
    b.setBounds(130, 250, 100, 30);
    t.setBounds(100, 30, 100, 30);
    t1.setBounds(100, 100, 100, 30);
    label.setBounds(0,0,100,100);
    label1.setBounds(0, 60, 100, 100);
    label2.setBounds(190, 120, 100, 100);

    j.add(label);
    j.add(label1);
    j.add(label2);
    j.add(b);
    j.add(t);
    j.add(t1);
 

    j.setSize(500, 350);
    j.setLayout(null);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    b.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) {       
            
            int val1 = Integer.parseInt(t.getText());
            int val2 = Integer.parseInt(t1.getText());

            int sum = val1 + val2;
            label2.setText(sum);
        }  
     });   
   }
}

public class Button{
    public static void main(String[] args) {
        abc a = new abc();         
    }
}

