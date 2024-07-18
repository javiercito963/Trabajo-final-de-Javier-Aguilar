
/**
 *  Personal class object.
 * 
 * @author (Javier) 
 * @version (a version number or a date)
 */

public class Pedidos
{
    public int idpedido, idcliente;
    public double fecha;
    
    public Pedidos()
    {
        this.idpedido= 0;
        this.idcliente= 0;
        this.fecha= 0;
    }
    
    public Pedidos(int idpedidos, int idcliente, double fecha)
    {
        this.idpedido= idpedido;
        this.idcliente= idcliente;
        this.fecha= fecha;
    }
    
    public void setInfobasica(int idpedido, int idcliente, double fecha)
    {
        this.idpedido= idpedido;
        this.idcliente= idcliente;
        this.fecha = fecha;
    }
    
    //ENTRADA
    
    public void setIdpedido(int idpedido)
    {
        this.idpedido= idpedido;
    }
    
    public void setIdcliente(int idcliente)
    {
        this.idcliente= idcliente;
    }
    
    public void setFecha(double fecha)
    {
        this.fecha= fecha;
    }
    
    //RETORNO
    
    public int getIdpedido()
    {
        return this.idpedido;
    }
    
    public int getIdcliente()
    {
        return this.idcliente;
    }
    
    public double getFecha()
    {
        return this.fecha;
    }
}
