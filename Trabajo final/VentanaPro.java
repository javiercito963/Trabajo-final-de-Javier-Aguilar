
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class VentanaPro extends JFrame implements ActionListener
{
    private Texto titulo= new Texto("Registro Producto:", 10, 10, 100, 30);
    private Texto txtIdproducto= new Texto("Idproducto:", 20, 40, 180, 20);
    private Texto txtNombre= new Texto("Nombre:", 20, 70, 180, 20);
    private Texto txtDescripcion= new Texto("Descripcion:", 20, 100, 180, 20);
    private Texto txtPrecio= new Texto("Precio:", 20, 160, 180, 20);
    
    private Caja tbIdproducto= new Caja(150, 40);
    private Caja tbNombre= new Caja(150, 70);
    private Caja tbDescripcion= new Caja(150, 100);
    private Caja tbPrecio= new Caja(150, 130);
    
    private Boton btnAceptar= new Boton("ACEPTAR", 20, 280);
    private Boton btnCancelar= new Boton("CANCELAR", 150, 280);
    
    private Texto txtPosicion = new Texto("Posición:", 20, 320, 100, 20);
    private Caja tbPosicion = new Caja(150, 320);
    private Boton btnVisualizar = new Boton("VISUALIZAR", 20, 350);
    
    public VentanaPro()
    {
        add(titulo);
        add(txtNombre);
        add(txtIdproducto);
        add(txtDescripcion);
        add(txtPrecio);

        add(tbNombre);
        add(tbIdproducto);
        add(tbDescripcion);
        add(tbPrecio);

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
            String n = tbNombre.getText();
            String c = tbDescripcion.getText();
            double p = Double.parseDouble(tbPrecio.getText());
            double pr = Double.parseDouble(tbIdproducto.getText());

            Productos ra = new Productos(n, c, p, pr); // Ajusta el constructor de Animal según corresponda
            DBA.setProductos(ra);
            setTitle("GUARDADO");

            // Limpiar los campos después del registro
            tbNombre.setText("");
            tbIdproducto.setText("");
            tbDescripcion.setText("");
            tbPrecio.setText("");
        }

        if (e.getSource() == btnVisualizar) {
            try {
                int pos = Integer.parseInt(tbPosicion.getText());
                Productos s = DBA.getProductos(pos);
                if (s != null) {
                    tbNombre.setText(s.getNombre());
                    tbDescripcion.setText(s.getDescripcion());
                    double a = Double.parseDouble(tbIdproducto.getText());
                    double p = Double.parseDouble(tbPrecio.getText());

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
