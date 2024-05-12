import javax.swing.*;

class Gui extends JFrame
{
    JLabel l;
    JTextField tname;

    Gui()
    {   
        super("this is gui in java by jframe ");
        super.setSize(400,400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(null);
        super.setVisible(true);

        l = new JLabel("Enter your name");
        l.setBounds(10, 10, 100, 100);
        super.add(l);
       
        tname = new JTextField();
		// tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
        super.add(tname);
    }
}

public class Java {
    public static void main(String[] args) {
        
      Gui window = new Gui();

    }
}
