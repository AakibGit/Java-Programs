import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class key implements KeyListener
{
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    ImageIcon image = new ImageIcon("Rocket.jpg");
    key()
    {
        label.setBounds(0, 0, 0, 0);
        // label.setOpaque(true);
        // label.setBackground(Color.BLACK);
        label.setIcon(image);

        

        frame.add(label);

        // frame.getContentPane().setBackground(Color.gray);
        frame.addKeyListener(this);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void keyPressed (KeyEvent e) {        
        // System.out.println(e.getKeyChar());
        if(e.getKeyChar()=='a')
        {
            label.setLocation(label.getX()-10,label.getY());
        }
        else if(e.getKeyChar()=='w')
        {
            label.setLocation(label.getX(), label.getY()-10);
        }
        else if(e.getKeyChar()=='s')
        {
            label.setLocation(label.getX(), label.getY()+10);
        }
        else if(e.getKeyChar()=='d')
        {
            label.setLocation(label.getX()+10, label.getY());
        }
    }    
    public void keyReleased (KeyEvent e) {    
      
        // System.out.println(e.getKeyChar());  
    }    

    public void keyTyped (KeyEvent e) {    
           
        // System.out.println(e.getKeyChar());
    }    
}

public class Keyevent {
    
    public static void main(String[] args) {
        
        key k = new key();
    }
}
