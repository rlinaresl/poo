package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controlador.ClienteControlador;
import controlador.UsuarioControlador;
import dominio.OperacionCabecera.Estado;
import dominio.OperacionCabecera.TipoOperacion;
import dominio.Usuario.Perfil;



public class BaseDatos {

	public List<OperacionCabecera> devolverOperacion(){
		
		List<OperacionCabecera> lista = new ArrayList<OperacionCabecera>();
		
		OperacionDetalle ventaDeta = null;
		OperacionCabecera ventaCabe = null;
		Date fechaVencimiento = null;
		Date fechaPago = null;
		Date fechaEmision = null;
		        
		ClienteControlador clienteCo = new ClienteControlador();
		UsuarioControlador usuarioCo = new UsuarioControlador();
		
        Cliente cli = clienteCo.BuscarCliente("0610428");
        Usuario usu = usuarioCo.BuscarUsuario(2);
        
        fechaEmision = Util.getIsFecha("24/06/2012");
        fechaVencimiento = Util.getIsFecha("08/07/2012");
        fechaPago = Util.getIsFecha("05/07/2012");
        
        
        ventaDeta = new OperacionDetalle("Inscripcion", 410, 1, 90, 500);                        
        ventaCabe = new OperacionCabecera(1, 1, cli, 1, TipoOperacion.VENTA, usu, "IN00001", fechaEmision, "",fechaVencimiento, fechaPago, Estado.CANCELADA, ventaDeta);        
        lista.add(ventaCabe);
        
        fechaEmision = Util.getIsFecha("30/06/2012");
        fechaVencimiento = Util.getIsFecha("10/07/2012");
        fechaPago = Util.getIsFecha("08/07/2012");        
        
        ventaDeta = new OperacionDetalle("Matricula", 200, 1, 36, 236);                        
        ventaCabe = new OperacionCabecera(2, 1, cli, 1, TipoOperacion.VENTA, usu, "IN00002", fechaEmision, "",fechaVencimiento, fechaPago, Estado.CANCELADA, ventaDeta);        
        lista.add(ventaCabe);
        
        fechaEmision = Util.getIsFecha("01/07/2012");
        fechaVencimiento = Util.getIsFecha("08/07/2012");    
        fechaPago = null;  
        //fechaEmision = Util.getFecha("24/06/2012");  
        
        ventaDeta = new OperacionDetalle("Mensualidad", 1000, 1, 180, 1180);                        
        ventaCabe = new OperacionCabecera(3, 1, cli, 1, TipoOperacion.VENTA, usu, "IN00003", fechaEmision, "",fechaVencimiento, fechaPago, Estado.NUEVO, ventaDeta);        
        lista.add(ventaCabe);
        
        fechaEmision = Util.getIsFecha("05/07/2012");
        fechaVencimiento = Util.getIsFecha("15/07/2012");        
        //fechaEmision = Util.getFecha("24/06/2012");  
        
        ventaDeta = new OperacionDetalle("Libro POO I", 150, 1, 27, 177);
        ventaCabe = new OperacionCabecera(4, 1, cli, 1, TipoOperacion.VENTA, usu, "IN00004", fechaEmision, "",fechaVencimiento, fechaPago, Estado.NUEVO, ventaDeta);        
        lista.add(ventaCabe);
        
        ventaDeta = new OperacionDetalle("Finalito", 150, 1, 27, 177);                        
        ventaCabe = new OperacionCabecera(5, 1, cli, 1, TipoOperacion.VENTA, usu, "IN00005", fechaEmision, "",fechaVencimiento, fechaPago, Estado.NUEVO, ventaDeta);        
        lista.add(ventaCabe);        
                
        cli = clienteCo.BuscarCliente("0610430");                
        usu = usuarioCo.BuscarUsuario(3);
        
        fechaEmision = Util.getIsFecha("10/08/2012");
        fechaVencimiento = Util.getIsFecha("25/08/2012");        
        fechaPago = Util.getIsFecha("24/08/2012"); 
        
        ventaDeta = new OperacionDetalle("Inscripcion", 410, 1, 90, 500);                        
        ventaCabe = new OperacionCabecera(6, 1, cli, 1, TipoOperacion.VENTA, usu, "IN00006", fechaEmision, "",fechaVencimiento, fechaPago, Estado.NUEVO, ventaDeta);        
        lista.add(ventaCabe);
        
		return lista;
	}

	public List<OperacionCabecera> devolverCompra(){
		List<OperacionCabecera> lista = new ArrayList<OperacionCabecera>();
		OperacionDetalle compraDeta = null;
		OperacionCabecera compraCabe = null;
        
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610430");
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);    
        
        Date fechaVencimiento = Util.getFecha("10/08/2012");
        Date fechaPago = Util.getFecha("10/10/2012");        
        Date fechaEmision = Util.getFecha("10/09/2012");  
        
        compraDeta = new OperacionDetalle("servicio de hosting", 410, 1, 90, 500);
        
        compraCabe = new OperacionCabecera();        
        compraCabe = new OperacionCabecera(1, 1, cli, 1, TipoOperacion.COMPRA, usu, "CO00001", fechaEmision, "",fechaVencimiento, fechaPago, Estado.CANCELADA, compraDeta);
        
        lista.add(compraCabe);
        
		return lista;
	}
	
	public List<Cliente> devolverClientes(){
    	
		List<Cliente> lista = new ArrayList<Cliente>();
    	Cliente obj = null;
    	obj = new Cliente("0610428", "Luis", "Perez", 3, 1, "02145252", "5642012", "luisperez@gmail.com", "Av. La Paz 586", "Lima", "1", "Perú");
    	lista.add(obj);
    	obj = new Cliente("0610429", "carla", "Medina", 3, 1, "02145262", "5622010", "carlamedina@gmail.com", "Av. Larco 144", "Lima", "1", "Perú");
    	lista.add(obj);
    	obj = new Cliente("0610430", "Juan", "Caceres", 3, 1, "02145272", "5552012", "juancaceres@gmail.com", "Av. La Mar 255", "Lima", "1", "Perú");
    	lista.add(obj);
    	obj = new Cliente("0610431", "Maria", "Lozada", 3, 1, "02145282", "5603512", "marialozada@gmail.com", "Av. Diagonal 386", "Lima", "1", "Perú");
    	lista.add(obj);
    	obj = new Cliente("0610434", "Martha", "Lopez", 3, 1, "02145292", "5642100", "marthalopez@gmail.com", "Av. Ricardo Palma 222", "Lima", "1", "Perú");
    	lista.add(obj);    	
    	return lista;
    	
    }
    
    
public List<Usuario> devolverUsuarios(){
    	
    	List<Usuario> lista = new ArrayList<Usuario>();
    	
    	Usuario obj = null;
    	obj = new Usuario(1, "Ricardo", "Linares", "rlinareslivia@gmail.com", "11111",Perfil.ADMINISTRADOR);
    	lista.add(obj);
    	obj = new Usuario(2, "Ronald", "Linares", "rquilca@gmail.com", "22222",Perfil.USUARIO);
    	lista.add(obj);
    	obj = new Usuario(3, "Yovani", "Cueva", "yovanicueva@gmail.com", "33333",Perfil.USUARIO);
    	lista.add(obj);
    	
    	return lista;
    	
    }
    	
 }
    
    
    
        


