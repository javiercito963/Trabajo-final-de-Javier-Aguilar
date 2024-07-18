
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class VentanaPer extends JFrame implements ActionListener
{
    private Texto titulo= new Texto("Registro Pedido:", 10, 10, 100, 30);
    private Texto txtIdpedido= new Texto("Idpedido:", 20, 40, 180, 20);
    private Texto txtFecha= new Texto("Fecha:", 20, 70, 180, 20);
    private Texto txtIdcliente= new Texto("Idcliente:", 20, 100, 180, 20);
    
    private Caja tbIdpedido= new Caja(150, 40);
    private Caja tbFecha= new Caja(150, 70);
    private Caja tbIdcliente= new Caja(150, 100);
    
    private Boton btnAceptar= new Boton("ACEPTAR", 20, 280);
    private Boton btnCancelar= new Boton("CANCELAR", 150, 280);
    
    private Texto txtPosicion = new Texto("Posición:", 20, 320, 100, 20);
    private Caja tbPosicion = new Caja(150, 320);
    private Boton btnVisualizar = new Boton("VISUALIZAR", 20, 350);
    
    public VentanaPer()
    {
        add(titulo);
        add(txtIdpedido);
        add(txtFecha);
        add(txtIdcliente);

        add(tbIdpedido);
        add(tbFecha);
        add(tbIdcliente);

        add(btnAceptar);
        add(btnCancelar);

        add(txtPosicion);
        add(tbPosicion);
        add(btnVisualizar);

        btnCancelar.addActionListener(this);
        btnAceptar.addActionListener(this);
        btnVisualizar.addActionListener(this);

        setLayout(null);
        setTitle("LOGIN"); 
        setSize(400, 450); 
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
    
            int pr = Integer.parseInt(tbIdpedido.getText());
            int ps = Integer.parseInt(tbIdcliente.getText());
            double th = Double.parseDouble(tbFecha.getText());

            Pedidos ra = new Pedidos(pr, ps, th); // Ajusta el constructor de Animal según corresponda
            DBA.setPedidos(ra);
            setTitle("GUARDADO");

            // Limpiar los campos después del registro
            tbIdpedido.setText("");
            tbIdcliente.setText("");
            tbFecha.setText("");
        }

        if (e.getSource() == btnVisualizar) {
            try {
                int pos = Integer.parseInt(tbPosicion.getText());
                Pedidos a = DBA.getPedidos(pos);
                if (a != null) {
                    tbFecha.setText(String.valueOf(a.getFecha()));
                    double pr = Double.parseDouble(tbIdpedido.getText());
                    double c = Double.parseDouble(tbIdcliente.getText());

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
