
import javax.swing.*;
public class Boton extends JButton
{
    public Boton(String txt, int px, int py)
    {
        setText(txt);
        setLocation(px, py);
        setSize(100, 35);
    }
}