import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Factorial implements ActionListener
{
    JFrame frame;
    JLabel label;
    JLabel label1;
    JTextField text;
    JButton btn;
    JTextField output;

    Factorial()
    {   
        frame = new JFrame();

        label = new JLabel();
        label.setText("Enter number to check Factorial ");
        label.setBounds(80,20,200,30); 
        frame.add(label);

        text = new JTextField();
        text.setBounds(100, 50, 150, 30);
        frame.add(text);

        btn = new JButton();
        btn.setText("Submit");
        btn.setBounds(100, 100, 100, 25);
        btn.addActionListener(this);
        frame.add(btn);


        label1 = new JLabel("Output");
        label1.setBounds(130, 110, 100, 90);
        frame.add(label1);

        output = new JTextField();
        output.setBounds(100, 170, 150, 30);
        frame.add(output);

        frame.setTitle("Factorial of number");
        frame.setLayout(null);
        frame.setSize(400,350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int val = Integer.parseInt(text.getText()) ;
        int f=1;

        for(int i=1; i<=val ;i++)
        {
            f=f*i;
        }
        String value = String.valueOf(f);

        output.setText(value);
          
    }
}

public class Demogui {
    public static void main(String[] args) {
        
        Factorial fac = new Factorial();
    }
}
