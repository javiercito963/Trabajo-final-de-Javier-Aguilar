
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JPasswordField;
public class Login extends JFrame implements ActionListener
{
    Texto titulo= new Texto("Iniciar sesión", 10, 10, 100, 10);
    Texto txtUsuario= new Texto("Nombre de Usuario", 20, 40, 150, 10);
    Texto textPass= new Texto("Contraseña", 20, 70, 150, 10);
    Caja tbUsuario= new Caja(150, 30);
    Caja tbPass= new Caja(150, 60);
    Boton btnAceptar= new Boton("ACEPTAR", 20, 110);
    Boton btnCancelar= new Boton("CANCELAR", 150, 110);
    Boton btnNuevo = new Boton("NUEVO", 80, 150);
    
    public Login()
    {

        //AÑADIR OBJETOS
        add(titulo);
        add(txtUsuario);
        add(tbUsuario);
        add(tbPass);
        add(textPass);
        
        add(btnNuevo);
        add(btnAceptar);
        add(btnCancelar);
        
        btnNuevo.addActionListener(this);
        btnAceptar.addActionListener(this);
        btnCancelar.addActionListener(this);
        
        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(300,250);
        setVisible(true);
        
        //PARA CONFIGURAR LA ESCRITURA DE LA CONTRASENA A ASTERISCOS
        //tbPass.setEchochar('*');
    }
    
    public static void main()
    {
        Sistema login= new Sistema();
    }
    
    public static Sistema frmLogin;
    public static VentanaUs frmUsuario;
    
    public void ingresar(){
        
        Usuario usu= new Usuario(tbUsuario.getText(),tbPass.getText());
        if (DBA.existeUsuario(usu)) {
                frmLogin= new Sistema();//Esta ref al Sistema
                dispose();
            } else {
                setTitle("ERROR");
            }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== btnAceptar){
            ingresar();
        }
        
        if (e.getSource()== btnNuevo){
            setVisible(false);
            frmUsuario = new VentanaUs();
        }
    }
}
