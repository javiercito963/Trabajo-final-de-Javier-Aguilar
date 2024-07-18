
public class DB
{
    public static Clientes[] clientes= new Clientes[100];
    public static int ci= 0;
    
    public static Productos[] productos= new Productos[100];
    public static int pi= 0;
    
    public static Pedidos[] pedidos= new Pedidos[100];
    public static int di= 0;
    
    public static Usuario[] usuario = new Usuario[100];
    public static int ius = 0;
    
    //REGISTRAR
    
    public static void registrarClientes(Clientes cl)
    {
        clientes[ci] = cl;
        ci++;
    }
    
    public static void registrarProductos(Productos pd)
    {
        productos[pi] = pd;
        pi++;
    }
    
    public static void registrarPedidos(Pedidos ps)
    {
        pedidos[di] = ps;
        di++;
    }
    
    public static void registrarUsuario(Usuario us){
        usuario[ius] = us;
        ius++;
    }
    
    //POSISION
    
    public static Clientes clientesPos(int pos)
    {
        return clientes[pos];
    }
    
    public static Productos productosPos(int pos)
    {
        return productos[pos];
    }
    
    public static Pedidos pedidosPos(int pos)
    {
        return pedidos[pos];
    }
    
    public static Usuario usuarioPos(int pos){
        return usuario[pos];
    }
}