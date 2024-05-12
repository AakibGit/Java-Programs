import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Firtsswing
{
    public static void main(String[] args) {
        

        JFrame j = new JFrame("Swing Gui java");
        String[] item = {"one","two","three","four","five"};

        JComboBox c = new JComboBox(item);

        c.setBounds(50, 50, 100, 100);
        j.add(c);

        j.setLayout(null);
        j.setSize(400, 500);
        j.setVisible(true);
    }
}