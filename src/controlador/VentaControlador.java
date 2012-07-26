package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dominio.Cliente;
import dominio.Util;
import dominio.BaseDatos;
import dominio.OperacionCabecera;
import dominio.OperacionDetalle;
import dominio.Usuario;

public class VentaControlador {

	Util util = new Util();
	BaseDatos BD = new BaseDatos();
	
	public static void main(String args[])
	
	{
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
        ventaCabe = new OperacionCabecera(1, 1, cli, 1, 1, usu, "IN00001", fechaEmision, "",fechaVencimiento, fechaPago, 1, ventaDeta);
        
        VentaControlador ventaCo = new VentaControlador();
        int resultado = ventaCo.crearVentaCabe(ventaCabe);
        System.out.print(resultado);
	}
		
	public int crearVentaCabe(OperacionCabecera obj){
		
		ClienteControlador clienteCo = new ClienteControlador();		
        Cliente cli = obj.getCliente();
        if(clienteCo.BuscarCliente(cli.getCodigo())==null)//validar cliente
        {
        	System.out.println("Cliente no existe");
        	return 0;
        }
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = obj.getUsuario();
        if (usuarioCo.BuscarUsuario(usu.getCodigo())== null)//validar usuario
        {
        	System.out.println("Usuario no existe");
        	return 0;
        }
		
		if (obj.getFecha_emision() == null || !util.isFechaValida(obj.getFecha_emision().toString()))//validar fecha emision 
		{
        	System.out.println("Fecha de emision incorrecta: "+ obj.getFecha_emision());
        	return 0;
        }
		
		if (obj.getFechaPago() == null || !util.isFechaValida(obj.getFechaPago().toString()))//validar fecha pago
		{
        	System.out.println("Fecha de Pago incorrecta");
        	return 0;
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
		
		if (buscarVenta(obj))//Si la venta existe
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
		
		//"servicio de hosting", 410, 1, 90, 500
		
					
		return 1;	
		
	}
	
	public int crearVentaDeta(OperacionDetalle obj){
		return 1;		
	}
	
	public boolean buscarVenta(OperacionCabecera venta)
	{
		
		List<OperacionCabecera> listaVentas = BD.devolverOperacion();
		
		for (OperacionCabecera item : listaVentas) {
			
            if (item.getCodigo() == venta.getCodigo())
            	return true;
        }
        
        return false;
	}
	
	
	
	
}
