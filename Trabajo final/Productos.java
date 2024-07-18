
/**
 *  Personal class object.
 * 
 * @author (Javier) 
 * @version (a version number or a date)
 */
public class Productos
{
    public String nombre, descripcion;
    public double precio, idproducto;
    
    /**
     * Constructor-1 for objects of class Medicamento
     */
    public Productos()
    {
        this.nombre= "";
        this.descripcion= "";
        this.precio= 0;
        this.idproducto= 0;
    }
    
    /**
     * Constructor-2 for objects of class Medicamento
     */
    public Productos(String nombre, String descripcion, double precio, double idproducto)
    {
        this.nombre= nombre;
        this.descripcion= descripcion;
        this.precio= precio;
        this.idproducto= idproducto;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    
    public void setDescripcion(String descripcion)
    {
        this.descripcion= descripcion;
    }
    
    public void setPrecio(double precio)
    {
        this.precio= precio;
    }
    
    public void setIdproducto(double idproducto)
    {
        this.idproducto= idproducto;
    }
    
    //RETURN
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getDescripcion()
    {
        return this.descripcion;
    }
    
    public double getPrecio()
    {
        return this.precio;
    }
    
    public double getIdproducto()
    {
        return this.idproducto;
    }
}
