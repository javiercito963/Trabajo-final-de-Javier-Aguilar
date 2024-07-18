

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class VentanaPerr extends JFrame implements ActionListener
{
    private Texto titulo = new Texto("Registrar Personal", 10, 10, 150, 10); 
    private Texto txtNombre = new Texto("Nombre", 20, 40, 150, 10);
    private Texto txtIdcliente = new Texto("Idcliente", 20, 70, 150, 10);
    private Texto txtEmail = new Texto("Email", 20, 100, 150, 10);
    private Texto txtTelefono = new Texto("Telefono", 20, 130, 150, 10);
    private Texto txtDireccion = new Texto("Direccion", 20, 160, 150, 10);
    

    private Caja tbNombre = new Caja(150, 30);
    private Caja tbIdcliente = new Caja(150, 60);
    private Caja tbEmail = new Caja(150, 90);
    private Caja tbTelefono = new Caja(150, 120);
    private Caja tbDireccion = new Caja(150, 150);
    

    private Boton btnRegistrar = new Boton("REGISTRAR", 70, 250);
    private Boton btnCancelar = new Boton("CANCELAR", 180, 250);
    
    private Texto txtPosicion = new Texto("Posición:", 20, 320, 100, 20);
    private Caja tbPosicion = new Caja(150, 320);
    private Boton btnVisualizar = new Boton("VISUALIZAR", 20, 350);
    public VentanaPerr()
    {
        add(titulo);

        add(txtNombre);
        add(txtIdcliente);
        add(txtEmail);
        add(txtTelefono);
        add(txtDireccion);

        add(tbNombre);
        add(tbIdcliente);
        add(tbEmail);
        add(tbTelefono);
        add(tbDireccion);

        add(btnRegistrar);
        add(btnCancelar);

        add(txtPosicion);
        add(tbPosicion);
        add(btnVisualizar);
        
        btnCancelar.addActionListener(this);
        btnRegistrar.addActionListener(this);
        btnVisualizar.addActionListener(this);
        
        setLayout(null);
        setTitle("LOGIN"); 
        setSize(400, 350); 
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            String n = tbNombre.getText();
            String a = tbEmail.getText();
            String d = tbDireccion.getText();
            String t = tbTelefono.getText();
            double s = Double.parseDouble(tbIdcliente.getText());

            Clientes ra = new Clientes(n, a, d, t, s); // Ajusta el constructor de Animal según corresponda
            DBA.setClientes(ra);
            setTitle("GUARDADO");

            // Limpiar los campos después del registro
            tbNombre.setText("");
            tbIdcliente.setText("");
            tbEmail.setText("");
            tbDireccion.setText("");
            tbTelefono.setText("");
        }

        if (e.getSource() == btnVisualizar) {
            try {
                int pos = Integer.parseInt(tbPosicion.getText());
                Clientes a = DBA.getClientesPos(pos);
                if (a != null) {
                    tbNombre.setText(a.getNombre());
                    tbEmail.setText(a.getEmail());
                    tbDireccion.setText(a.getDireccion());
                    tbTelefono.setText(String.valueOf(a.getTelefono()));
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
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
            window.dispose();
        }
    }
}