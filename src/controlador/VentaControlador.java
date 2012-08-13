package controlador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.ParseConversionEvent;

import dominio.Cliente;
import dominio.OperacionCabecera.TipoOperacion;
import dominio.Util;
import dominio.BaseDatos;
import dominio.OperacionCabecera;
import dominio.OperacionDetalle;
import dominio.Usuario;
import dominio.BusinessException;
import dominio.Validation;
import dominio.OperacionCabecera.Estado;

public class VentaControlador {

	Util util = new Util();
	BaseDatos BD = new BaseDatos();
	
	
	public static void main(String args[])	
	{
				
		Date resultado = Util.getFecha("13/08/2012");
		System.out.println(resultado);
				
		//VentaControlador ventaC = new VentaControlador();
		
		/*
		VentaControlador ventaCo = new VentaControlador();
		OperacionCabecera venta = ventaCo.buscarVenta(1);		
		boolean resultado = ventaCo.cambiarEstadoVenta(venta);
		System.out.println(resultado);
		*/
		
		/*
		try {
			
			//OperacionCabecera obj = ventaC.buscarVenta2("1");
			OperacionCabecera venta = ventaC.buscarVenta2("1");
			VentaControlador dao = new VentaControlador();
			dao.cambiarEstadoVenta(venta);
			
			
			
		} catch (BusinessException be) {
        	
			System.out.print(be.getMessage());
        	//be.printStackTrace();        	
            //Logger.getLogger(VentaControlador.class.getName()).log(Level.SEVERE, null, be);
        	
            
        }
		*/
		
		
		/*
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610428");
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);
        
        //ventaCabe = new OperacionCabecera(codigo, codigoTipoDocumento, cliente, codigoMoneda, tipoOperacion, usuario, numeroDocumento, concepto, fecha_emision, empresa, fechaVencimiento, fechaPago, estado)        
        OperacionCabecera ventaCabe = null;
        OperacionDetalle ventaDeta = null;

        Date fechaVencimiento = Util.getFecha("10/10/2012");
        Date fechaPago = Util.getFecha("10/10/2012");        
        Date fechaEmision = Util.getFecha("10/10/2012");               
        
        ventaDeta = new OperacionDetalle("servicio de hosting", 410, 1, 90, 500);
        //ventaCabe = new OperacionCabecera(1, 1, cli, 1, 1, usu, "IN00001", fechaEmision, "",fechaVencimiento, fechaPago, 1, ventaDeta);
        ventaCabe = new OperacionCabecera(4, 1, cli, 1, TipoOperacion.VENTA, usu, "IN00001", fechaEmision, "",fechaVencimiento, fechaPago, Estado.NUEVO, ventaDeta);
        
        VentaControlador ventaCo = new VentaControlador();
        int resultado = ventaCo.crearVentaCabe(ventaCabe);
        System.out.print(resultado);
        */
        
	}
	
	
	List<OperacionCabecera> listaVenta = null;
    private String mensajeError = "";

    public static Usuario usuarioAutenticado = new Usuario();

    public VentaControlador() {
    	listaVenta = BD.devolverOperacion();    	
    }
	
	public OperacionCabecera buscarVenta2(Object codigo) throws BusinessException {
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
		
	        for (OperacionCabecera obj : listaVenta) {
	            if (obj.getCodigo() == ncodigo) {
	                return obj;
	            }
	        }
	        mensaje = "No existe el codigo de venta.";
		}
		
		throw new BusinessException(mensaje);
		
    }	
	
	public int eliminarVentaCabe(OperacionCabecera obj)  throws BusinessException
	{					
		if (verificarEstado(obj))
			return 1;
		
		return 0;
	}
	
	public int editarVentaCabe(OperacionCabecera obj) throws BusinessException
	{
		OperacionCabecera v = buscarVenta(obj.getCodigo());
				
		int validaFecha = Util.getComparaFechas(obj.getFechaVencimiento(), v.getFechaVencimiento());
		
		if (validaFecha == 0)
    		throw new BusinessException("Error: La nueva fecha de vencimiento es incorrecta");
		
		if (!verificarEstado(obj))
    		throw new BusinessException("Error: La venta no puede ser actualizada");
		
		return 1;		
	}
	
	public int crearVentaCabe(OperacionCabecera obj){
		
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
        	System.out.println("No es una Venta");
        	return 0;
        }
		
		if (buscarVenta(obj))//valida por codigo y numero de documento.
		{
        	System.out.println("Venta ya existe");
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
		System.out.println("Resultado(OK): Venta (" + obj.getNumeroDocumento() + ") registrada correctamente.");
		return 1;	
		
	}
		
	
	public boolean buscarVenta(OperacionCabecera venta)
	{
		
		List<OperacionCabecera> listaVentas = BD.devolverOperacion();
		
		for (OperacionCabecera item : listaVentas) {
			
			if (venta.getCodigo() != 0 && item.getCodigo() == venta.getCodigo())
            	return true;
			
			if (venta.getNumeroDocumento() != null && item.getNumeroDocumento().equalsIgnoreCase(venta.getNumeroDocumento()))
            	return true;
            
        }
        
        return false;
	}
	
	public boolean buscarVentaUsuario(Usuario usuario)
	{
		
		List<OperacionCabecera> listaVentas = BD.devolverOperacion();
		
		for (OperacionCabecera item : listaVentas) {
			
            if (item.getUsuario().getCodigo() == usuario.getCodigo())
            	return true;
            
        }
        
        return false;
	}
	
	public boolean buscarVentaCliente(Cliente cliente)
	{
		
		List<OperacionCabecera> listaVentas = BD.devolverOperacion();
		
		for (OperacionCabecera item : listaVentas) {
			
            if (item.getCliente().getCodigo() == cliente.getCodigo())
            	return true;
            
        }
        
        return false;
	}
	
	public boolean verificarEstado(OperacionCabecera item) throws BusinessException
	{
		
		if (item.getEstado().equals(Estado.CANCELADA))
    		throw new BusinessException("Error: La venta ya ha sido cancelada");
    	
    	if (item.getEstado().equals(Estado.ANULADA))
    		throw new BusinessException("Error: La venta ya ha sido Anulada");
		
		return true;
		
	}
	
	
	public boolean cambiarEstadoVenta(OperacionCabecera venta) throws BusinessException
	{
				
		OperacionCabecera item = buscarVenta(venta.getCodigo());
		
		if (item == null)
			throw new BusinessException("Error: No se encontro la venta");
			
		/*
		if (Util.getValidaFechaActual("13/08/2012")==0)//validar fecha pago        		
			throw new BusinessException("Error: Fecha de Pago incorrecta");
    	*/
		
    	if (item.getEstado().equals(Estado.CANCELADA))
    		throw new BusinessException("Error: La venta ya ha sido cancelada");
    	
    	if (item.getEstado().equals(Estado.ANULADA))
    		throw new BusinessException("Error: La venta ya ha sido Anulada");
    	
    	if (!venta.getEstado().equals(Estado.CANCELADA))
    		throw new BusinessException("Error: La venta no puede ser actualizada");

    	return true;
	
	}
	
	public OperacionCabecera buscarVenta(int codigo)
	{
		
		List<OperacionCabecera> listaVentas = BD.devolverOperacion();
		
		for (OperacionCabecera item : listaVentas) {
			
            if (item.getCodigo() == codigo)
            	return item;
        }
        
        return null;
        
	}
	
	
}
