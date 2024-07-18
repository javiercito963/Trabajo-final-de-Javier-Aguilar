
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class VentanaUs extends JFrame implements ActionListener{
    private Texto titulo = new Texto("Registrar Nuevo Usuario", 10, 10, 150, 10);

    private Texto txtUsuario= new Texto("Nombre de Usuario", 20, 40, 150, 10);
    private Texto textPass= new Texto("Contraseña", 20, 70, 150, 10);

    private Caja tbUsuario= new Caja(150, 30);
    private Caja tbPass= new Caja(150, 60);

    private Boton btnRegistrar = new Boton("REGISTRAR", 20, 100);
    private Boton btnCancelar = new Boton("CANCELAR", 130, 100);

    public VentanaUs(){
        add(titulo);
        add(txtUsuario);
        add(tbUsuario);
        add(tbPass);
        add(textPass);

        add(btnRegistrar);
        add(btnCancelar);

        btnCancelar.addActionListener(this);
        btnRegistrar.addActionListener(this);

        setLayout(null);
        setTitle("LOGIN"); 
        setSize(300, 200); 
        setVisible(true);
    }
    
    public void registroUsuario(){
        String us = tbUsuario.getText();
        String pas = tbPass.getText();

            Usuario usu = new Usuario(us, pas); // Ajusta el constructor de Animal según corresponda
            DBA.setUsuario(usu);
            
            // Limpiar los campos después del registro
            tbUsuario.setText("");
            tbPass.setText("");
        
        setVisible(false);
    }
    
    public void abrirLogin(){
        Login lg= new Login();
        lg.setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            registroUsuario();
            abrirLogin();
        }

        if (e.getSource() == btnCancelar) {
            // Obtener el componente raíz (ventana) que contiene el botón cancelar
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());

            // Cerrar la ventana actual
            window.dispose();
        }
    }
}
