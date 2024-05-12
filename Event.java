import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
import java.time.format.TextStyle;



class eventwork implements ActionListener
{
    JFrame frame = new JFrame("java");
        JTextField text = new JTextField();
        JButton btn = new JButton("click the button");
        
    eventwork()
    {
        

        btn.setBounds(100, 100,80,20);

        text.setBounds(100, 50, 150, 40);
        
        btn.addActionListener(this);
        
        frame.add(btn);
        frame.add(text);


        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
            {
                text.setText("Working");
            }
}


public class Event  {
    
    public static void main(String[] args) {
        
           eventwork obj = new eventwork();
        
    }
    
}