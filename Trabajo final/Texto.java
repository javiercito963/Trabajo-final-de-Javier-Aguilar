
import javax.swing.*;
public class Texto extends JLabel
{
    public Texto(String txt, int px, int py, int tx, int ty)
    {
        setText(txt);
        setLocation(px, py);
        setSize(tx, ty);
    }
}
