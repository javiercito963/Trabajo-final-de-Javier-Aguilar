
import javax.swing.*;
import java.awt.event.*;

public class Sistema extends JFrame implements ActionListener
{
    Texto titulo= new Texto("MANCHAS", 10, 10, 100, 10);
    Caja tbPass= new Caja(150, 60);
    Boton btnCliente= new Boton("CLIENTES", 20, 60);
    Boton btnPedido= new Boton("PEDIDOS", 150, 60);
    Boton btnProducto= new Boton("PRODUCTOS", 280, 60);
    
    public Sistema()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(btnCliente);
        add(btnPedido);
        add(btnProducto);
        
        //ACTION BUTTONS
        btnCliente.addActionListener(this);
        btnPedido.addActionListener(this);
        btnProducto.addActionListener(this);
        
        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(700, 200);
        setVisible(true);
    }
    
    public static VentanaCli frmVentanaCliente;
    public static VentanaPer frmVentanaPedido;
    public static VentanaPro frmVentanaProducto;
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== btnCliente){
            frmVentanaCliente= new VentanaCli();
        }
        if (e.getSource()== btnPedido){
            frmVentanaPedido= new VentanaPer();
        }
        if (e.getSource()== btnProducto){
            frmVentanaProducto= new VentanaPro();
        }
        
    }
}
