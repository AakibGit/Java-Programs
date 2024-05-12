import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Javagui 
{
  public static void main(String[] args) {

    Frame f = new Frame("Java Gui");
    Button b = new Button("Button");
    TextField t = new TextField();
    TextArea a = new TextArea();

    a.setBounds(-30, 50, 300, 400);
    f.add(a);
    
    t.setBounds(0, 100, 100, 60);
    f.add(t);
    b.setBounds(20, 40, 50, 50);
    f.add(b);

    f.setSize(600, 550);
  
    f.setLayout(null);
    f.setVisible(true);
    }
}