
public class DBA
{
    //CLIENTES
    public static void setClientes(Clientes c){
        Clientes cli= new Clientes();
        
        cli.nombre= !c.nombre.equalsIgnoreCase("")?c.nombre:"Sin nombre";
        cli.email= !c.email.equalsIgnoreCase("")?c.email:"Sin email";
        cli.idcliente= c.idcliente>0?c.idcliente:0;
        cli.telefono= !c.telefono.equalsIgnoreCase("")?c.telefono:"Sin telefono";
        cli.direccion= !c.direccion.equalsIgnoreCase("")?c.direccion:"Sin direccion";
        DB.registrarClientes(cli);
    }
    
    public static Clientes getClientesPos(int pos){
        if (pos<=DB.ci){
            return DB.clientesPos(pos-1);
        }
        else{
            System.out.println("ERROR: Registro no encontrado.");
            return null;
        }      
    }
    
    public static void getClientes(Clientes a){
        System.out.println("\n================================================");
        System.out.println("Idcliente: "+a.idcliente);
        System.out.println("Nombre: "+a.nombre);
        System.out.println("Email: "+a.email);
        System.out.println("Direccion: "+a.direccion);
        System.out.println("Telefono: "+a.telefono);
    }
    
    //PRODUCTOS
    
    public static void setProductos(Productos p){
        Productos pro= new Productos();
        
        pro.nombre= !p.nombre.equalsIgnoreCase("")?p.nombre:"Sin nombre";
        pro.descripcion= !p.descripcion.equalsIgnoreCase("")?p.descripcion:"Sin descripcion";
        pro.idproducto= p.idproducto>0?p.idproducto:0;
        pro.precio= p.precio>0?p.precio:0;
        DB.registrarProductos(pro);
    }
    
    public static Productos getProductos(int pos){
        if (pos<=DB.pi){
            return DB.productosPos(pos-1);
        }
        else{
            System.out.println("ERROR: Registro no encontrado.");
            return null;
        }      
    }
    
    public static void getProductos(Productos p){
        System.out.println("\n================================================");
        System.out.println("Idproducto: "+p.idproducto);
        System.out.println("Nombre: "+p.nombre);
        System.out.println("descripcion: "+p.descripcion);
        System.out.println("precio: "+p.precio);
    }
    
    //PEDIDIOS
    
    public static void setPedidos(Pedidos s){
        Pedidos pdd= new Pedidos();
        
        pdd.idpedido= s.idpedido>0?s.idpedido:0;
        pdd.idcliente= s.idcliente>0?s.idcliente:0;
        pdd.fecha= s.fecha>0?s.fecha:0;
        
        DB.registrarPedidos(pdd);
    }
    
    public static Pedidos getPedidos(int pos){
        if (pos<=DB.di){
            return DB.pedidosPos(pos-1);
        }
        else{
            System.out.println("ERROR: Registro no encontrado.");
            return null;
        }      
    }
    
    public static void getPedidos(Pedidos s){
        System.out.println("\n================================================");
        System.out.println("Idpedidos: "+s.idpedido);
        System.out.println("Idcliente: "+s.idcliente);
        System.out.println("Fecha: "+s.fecha);
    }
    
    public static void setUsuario(Usuario us){
        DB.registrarUsuario(us);
    }

    public static Usuario getUsuarioPos(int pos) {
        if (pos <= DB.ius) {
            return DB.usuarioPos(pos - 1);
        } else {
            return null;
        }
    }
 
    public static boolean existeUsuario(Usuario usu){
        boolean res= false;
        
        for(int i=0; i<DB.ius; i++){
            if(usu.getUsuario().equals(DB.usuario[i].getUsuario())&&usu.getContrasenha().equals(DB.usuario[i].getContrasenha()))
                res= true;
        }
        return res;
    }
}
