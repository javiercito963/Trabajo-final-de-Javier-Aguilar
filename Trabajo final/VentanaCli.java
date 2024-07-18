
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class VentanaCli extends JFrame implements ActionListener
{
    private Texto titulo= new Texto("Registro Cliente:", 10, 10, 100, 30);
    private Texto txtIdcliente= new Texto("Idcliente:", 20, 40, 180, 20);
    private Texto txtNombre= new Texto("Nombre:", 20, 70, 180, 20);
    private Texto txtEmail= new Texto("Email:", 20, 100, 180, 20);
    private Texto txtDireccion= new Texto("Direccion:", 20, 130, 180, 20);
    private Texto txtTelefono= new Texto("Telefono:", 20, 160, 180, 20);
    
    private Caja tbIdcliente= new Caja(150, 40);
    private Caja tbNombre= new Caja(150, 70);
    private Caja tbEmail= new Caja(150, 100);
    private Caja tbDireccion= new Caja(150, 130);
    private Caja tbTelefono= new Caja(150, 160);
    
    private Boton btnAceptar= new Boton("ACEPTAR", 20, 280);
    private Boton btnCancelar= new Boton("CANCELAR", 150, 280);
    
    private Texto txtPosicion = new Texto("Posición:", 20, 320, 100, 20);
    private Caja tbPosicion = new Caja(150, 320);
    private Boton btnVisualizar = new Boton("VISUALIZAR", 20, 350);
    
    public VentanaCli()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(txtIdcliente);
        add(txtNombre);
        add(txtEmail);
        add(txtDireccion);
        add(txtTelefono);
        
        //ANADIR CAJAS
        add(tbIdcliente);
        add(tbNombre);
        add(tbEmail);
        add(tbDireccion);
        add(tbTelefono);
        
        add(btnAceptar);
        add(btnCancelar);
        
        add(txtPosicion);
        add(tbPosicion);
        add(btnVisualizar);
        
        btnCancelar.addActionListener(this);
        btnAceptar.addActionListener(this);
        btnVisualizar.addActionListener(this);
        
        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(300, 450);
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            
            String r = tbNombre.getText();
            String n = tbEmail.getText();
            String p = tbDireccion.getText();
            String pr = tbTelefono.getText();
            double t = Double.parseDouble(tbIdcliente.getText());
            

            Clientes ra = new Clientes(r, n, p, pr, t); // Ajusta el constructor de Animal según corresponda
            DBA.setClientes(ra);
            setTitle("GUARDADO");

            // Limpiar los campos después del registro
            tbIdcliente.setText("");
            tbEmail.setText("");
            tbNombre.setText("");
            tbDireccion.setText("");
            tbTelefono.setText("");
        }

        if (e.getSource() == btnVisualizar) {
            try {
                int pos = Integer.parseInt(tbPosicion.getText());
                Clientes a = DBA.getClientesPos(pos);
                if (a != null) {
                    tbNombre.setText(a.getNombre());
                    tbDireccion.setText(a.getDireccion());
                    tbEmail.setText(a.getEmail());
                    tbTelefono.setText(a.getTelefono());
                    tbIdcliente.setText(String.valueOf(a.getIdcliente()));
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Registro no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error en el formato de número: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al visualizar el registro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == btnCancelar) {
            // Obtener el componente raíz (ventana) que contiene el botón cancelar
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());

            // Cerrar la ventana actual
            window.dispose();
        }
    }
}
