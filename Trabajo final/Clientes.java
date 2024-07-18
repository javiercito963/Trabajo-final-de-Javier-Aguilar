
/**
 *  Personal class object.
 * 
 * @author (Javier) 
 * @version (a version number or a date)
 */
public class Clientes
{
    public String nombre, email, telefono, direccion;
    public double idcliente;
    /**
     * Constructor-1 for objects of class Personal
     */
     public Clientes()
    {
        this.idcliente= 0;
        this.nombre= "";
        this.email= "";
        this.telefono= "";
        this.direccion= "";
    }
    
    /**
     * Constructor-2 for objects of class Personal
     * 
     * @param  <nombre> de tipo String
     * @param  <email> de tipo String
     * @param  <idcliente> de tipo int
     * @param  <telefono> de tipo String
     * @param  <direccion> de tipo String
    */
   
    public Clientes(String nombre, String email, String direccion, String telefono, double idcliente)
    {
        this.nombre= nombre;
        this.email= email;
        this.direccion= direccion;
        this.telefono= telefono;
        this.idcliente = idcliente;
    }
    
    /**
     * Metodo setInfobasica
     * 
     * @param  <nombre> de tipo String
     * @param  <email> de tipo String
     * @param  <telefono> de tipo String
     * @return  void 
     */
    public void setInfobasica(String nombre, String email, String telefono, double idcliente)
    {
        this.nombre= nombre;
        this.email= email;
        this.telefono= telefono;
    }
    
    /**
     * Metodo setNombre
     * 
     * @param  <nombre> de tipo String
     * @return  void 
     */
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    
    /**
     * Metodo setEmail
     * 
     * @param  <email> de tipo String
     * @return  void 
     */
    public void setEmail(String email)
    {
        this.email= email;
    }
    
    /**
     * Metodo setIdcliente
     * 
     * @param  <idcliente> de tipo int
     * @return  void 
     */
    public void setIdcliente(int idcliente)
    {
        this.idcliente= idcliente;
    }
    
    /**
     * Metodo setTelefono
     * 
     * @param  <telefono> de tipo String
     * @return  void 
     */
    public void setTelefono(String telefono)
    {
        this.telefono= telefono;
    }
    
    /**
     * Metodo setDireccion
     * 
     * @param  <direccion> de tipo String
     * @return  void 
     */
    public void setDireccion(String direccion)
    {
        this.direccion= direccion;
    }
    
    //RETURN
    
    /**
     * Metodo getNombre
     * 
     * @return  String
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Metodo getEmail
     * 
     * @return  String
     */
    public String getEmail()
    {
        return this.email;
    }
    
    /**
     * Metodo getIdcliente
     * 
     * @return  int
     */
    public double getIdcliente()
    {
        return this.idcliente;
    }
    
    /**
     * Metodo getTelefono
     * 
     * @return  String
     */
    public String getTelefono()
    {
        return this.telefono;
    }
    
    /**
     * Metodo getDireccion
     * 
     * @return  String
     */
    public String getDireccion()
    {
        return this.direccion;
    }
}
