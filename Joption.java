import javax.swing.*;
import java.awt.event.*;

class Window implements ActionListener
{
    JFrame f;
    JButton b;
    JTextField t;
    JButton b1;

    Window()
    {
        f = new JFrame("Joption in java ");

        b = new JButton("Click");
        b.setBounds(0, 0, 80, 50);
        f.add(b);
        b.addActionListener(this);

        t = new JTextField();
        t.setBounds(20, 80, 150, 80);
        f.add(t);
        t.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e){
                System.out.println(e.getKeyChar());
            }

            public void keyPressed(KeyEvent e)
            {

            }

            public void keyReleased(KeyEvent e)
            {

            }
        });

        b1 = new JButton("right click");
        b1.setBounds(40, 180, 100, 50);
        f.add(b1);
        b1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e)
            {
                System.out.println(e.getX());
                System.out.println(e.getY());
                
            }
            public void mousePressed(MouseEvent e)
            {

            }
            public void mouseReleased(MouseEvent e)
            {

            }
            public void mouseEntered(MouseEvent e)
            {

            }
            public void mouseExited(MouseEvent e)
            {

            }
        });

        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(300, 300);
    }

    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(b, "You clicked btn just");
    }

}

public class Joption {
    public static void main(String[] args) {
        
        new Window();
    }
}
