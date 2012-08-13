package controlador;
/*
import java.util.ArrayList;
import java.util.Calendar;
*/
import java.util.Date;
/*import java.util.GregorianCalendar;*/
import java.util.List;
/*
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.ParseConversionEvent;
*/
import dominio.Cliente;
/*import dominio.OperacionCabecera.TipoOperacion;*/
import dominio.Util;
import dominio.BaseDatos;
import dominio.OperacionCabecera;
import dominio.OperacionDetalle;
import dominio.Usuario;
import dominio.BusinessException;
import dominio.Validation;
import dominio.OperacionCabecera.Estado;

public class CompraControlador {

	Util util = new Util();
	BaseDatos BD = new BaseDatos();
		
	public static void main(String args[])	
	{
				
		Date resultado = Util.getFecha("13/08/2012");
		System.out.println(resultado);
				
		//CompraControlador compraC = new CompraControlador();		
		/*
		CompraControlador compraCo = new CompraControlador();
		OperacionCabecera compra = compraCo.buscarCompra(1);		
		boolean resultado = compraCo.cambiarEstadoCompra(compra);
		System.out.println(resultado);
		*/		
		/*
		try {
			
			//OperacionCabecera obj = compraC.buscarVenta2("1");
			OperacionCabecera compra = compraC.buscarVenta2("1");
			VentaControlador dao = new CompraControlador();
			dao.cambiarEstadoCompra(compra);
			
		} catch (BusinessException be) {
        	
			System.out.print(be.getMessage());
        	//be.printStackTrace();        	
            //Logger.getLogger(CompraControlador.class.getName()).log(Level.SEVERE, null, be);            
        }
		*/
		
		/*
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610428");       
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);
        
        */
        
	}	
	
	List<OperacionCabecera> listaCompra = null;
    //private String mensajeError = "";

    public static Usuario usuarioAutenticado = new Usuario();

    public CompraControlador() {
    	//listaCompra = BD.devolverOperacion();    	
    	listaCompra = BD.devolverCompra();
    }
	
	public OperacionCabecera buscarCompra2(Object codigo) throws BusinessException {
		Validation o = new Validation();
		
		int ncodigo = 0;
		String mensaje = "";
		
		if (o.isNotNumber(codigo))
		{
			mensaje = "Codigo incorrecto.";
		}
		else
		{
			ncodigo = Integer.parseInt(codigo.toString());		
		
	        for (OperacionCabecera obj : listaCompra) {
	            if (obj.getCodigo() == ncodigo) {
	                return obj;
	            }
	        }
	        mensaje = "No existe el codigo de compra.";
		}
		
		throw new BusinessException(mensaje);
		
    }	
	
	public int eliminarCompraCabe(OperacionCabecera obj)  throws BusinessException
	{					
		if (verificarEstado(obj))
			return 1;
		
		return 0;
	}
	
	public int editarCompraCabe(OperacionCabecera obj) throws BusinessException
	{
		OperacionCabecera c = buscarCompra(obj.getCodigo());
				
		int validaFecha = Util.getComparaFechas(obj.getFechaVencimiento(), c.getFechaVencimiento());
		
		if (validaFecha == 0)
    		throw new BusinessException("Error: La nueva fecha de vencimiento es incorrecta");
		
		if (!verificarEstado(obj))
    		throw new BusinessException("Error: La compra no puede ser actualizada");
		
		return 1;		
	}
	
	public int crearCompraCabe(OperacionCabecera obj){
		
		ClienteControlador clienteCo = new ClienteControlador();		
        Cliente cli = obj.getCliente();
        System.out.print("Busqueda de Cliente ");
        if(clienteCo.BuscarCliente(cli.getCodigo())==null)//validar cliente
        {
        	System.out.println("Cliente no existe");
        	return 0;
        }
        System.out.println("(Ok): " + cli.getNombres() + " " + cli.getApellidos());
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = obj.getUsuario();
        System.out.print("Busqueda de Usuario ");
        if (usuarioCo.BuscarUsuario(usu.getCodigo())== null)//validar usuario
        {
        	System.out.println("Usuario no existe");
        	return 0;
        }
        System.out.println("(Ok): " + usu.getNombres() + " " + usu.getApellidos());
        
        System.out.print("Observaciones: ");
		if (obj.getFecha_emision() == null || !util.isFechaValida(obj.getFecha_emision().toString()))//validar fecha emision 
		{
        	System.out.println("Fecha de emision incorrecta: "+ obj.getFecha_emision());
        	return 0;
        }
		
		if (obj.getFechaPago() == null || !util.isFechaValida(obj.getFechaPago().toString()))//validar fecha pago
		{
        	System.out.println("No ingreso fecha de Pago");
        	//return 0;
        }
		
		if (obj.getFechaVencimiento() == null || !util.isFechaValida(obj.getFechaVencimiento().toString()))//validar fecha vencimiento 
		{
        	System.out.println("Fecha de Vencimiento incorrecta");
        	return 0;
        }
		
		if (obj.getCodigoTipoDocumento() != 1)//Si no es una venta
		{
        	System.out.println("No es una Compra");
        	return 0;
        }
		
		if (buscarCompra(obj))//valida por codigo y numero de documento.
		{
        	System.out.println("Compra ya existe");
        	return 0;
        }
		
		if (obj.getOperacionDetalle() == null)
		{
        	System.out.println("Ingrese detalle");
        	return 0;
        }
		
		if (obj.getOperacionDetalle().getConcepto() == null || obj.getOperacionDetalle().getConcepto().equals(""))
		{
        	System.out.println("Ingrese concepto");
        	return 0;
        }		
		System.out.println("Resultado(OK): Compra (" + obj.getNumeroDocumento() + ") registrada correctamente.");
		return 1;	
		
	}
		
	
	public boolean buscarCompra(OperacionCabecera compra)
	{
		
		List<OperacionCabecera> listaCompras = BD.devolverOperacion();
		
		for (OperacionCabecera item : listaCompras) {
			
			if (compra.getCodigo() != 0 && item.getCodigo() == compra.getCodigo())
            	return true;
			
			if (compra.getNumeroDocumento() != null && item.getNumeroDocumento().equalsIgnoreCase(compra.getNumeroDocumento()))
            	return true;
            
        }
        
        return false;
	}
	
	public boolean buscarCompraUsuario(Usuario usuario)
	{
		
		List<OperacionCabecera> listaCompras = BD.devolverCompra();
		
		for (OperacionCabecera item : listaCompras) {
			
            if (item.getUsuario().getCodigo() == usuario.getCodigo())
            	return true;
            
        }
        
        return false;
	}
	
	public boolean buscarCompraCliente(Cliente cliente)
	{
		
		List<OperacionCabecera> listaCompras = BD.devolverCompra();
		
		for (OperacionCabecera item : listaCompras) {
			
            if (item.getCliente().getCodigo() == cliente.getCodigo())
            	return true;
            
        }
        
        return false;
	}
	
	public boolean verificarEstado(OperacionCabecera item) throws BusinessException
	{
		
		if (item.getEstado().equals(Estado.CANCELADA))
    		throw new BusinessException("Error: La compra ya ha sido cancelada");
    	
    	if (item.getEstado().equals(Estado.ANULADA))
    		throw new BusinessException("Error: La compra ya ha sido Anulada");
		
		return true;
		
	}
	
	
	public boolean cambiarEstadoCompra(OperacionCabecera compra) throws BusinessException
	{
				
		OperacionCabecera item = buscarCompra(compra.getCodigo());
		
		if (item == null)
			throw new BusinessException("Error: No se encontro la compra");
			
		/*
		if (Util.getValidaFechaActual("13/08/2012")==0)//validar fecha pago        		
			throw new BusinessException("Error: Fecha de Pago incorrecta");
    	*/
		
    	if (item.getEstado().equals(Estado.CANCELADA))
    		throw new BusinessException("Error: La compra ya ha sido cancelada");
    	
    	if (item.getEstado().equals(Estado.ANULADA))
    		throw new BusinessException("Error: La compra ya ha sido Anulada");
    	
    	if (!compra.getEstado().equals(Estado.CANCELADA))
    		throw new BusinessException("Error: La compra no puede ser actualizada");

    	return true;
	
	}
	
	public OperacionCabecera buscarCompra(int codigo)
	{
		
		List<OperacionCabecera> listaCompras = BD.devolverOperacion();
		
		for (OperacionCabecera item : listaCompras) {
			
            if (item.getCodigo() == codigo)
            	return item;
        }
        
        return null;
        
	}
	
	
}
