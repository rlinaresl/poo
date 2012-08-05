package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dominio.Cliente;
import dominio.OperacionCabecera.Estado;
import dominio.Util;
import dominio.BaseDatos;
import dominio.OperacionCabecera;
import dominio.OperacionDetalle;
import dominio.Usuario;

public class CompraControlador {

	Util util = new Util();
	BaseDatos BD = new BaseDatos();
	
	public static void main(String args[]) {
		
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610430");
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);
        
        OperacionCabecera compraCabe = null;
        OperacionDetalle compraDeta = null;

        Date fechaVencimiento = Util.getFecha("01/10/2012");
        Date fechaPago = Util.getFecha("01/10/2012");        
        Date fechaEmision = Util.getFecha("01/10/2012");               
        
        compraDeta = new OperacionDetalle("servicio de consultoria", 400, 1, 72, 472);
        compraCabe = new OperacionCabecera(1, 1, cli, 1, 2, usu, "VE00001", fechaEmision, "", fechaVencimiento, fechaPago, Estado.NUEVO, compraDeta);
        
        CompraControlador compraCo = new CompraControlador();
        int resultado = compraCo.crearCompraCabe(compraCabe);
        System.out.print(resultado);
	}
		
	public int crearCompraCabe(OperacionCabecera obj) {
		
		ClienteControlador clienteCo = new ClienteControlador();		
        Cliente cli = obj.getCliente();
        if(clienteCo.BuscarCliente(cli.getCodigo())==null)//validar cliente
        {
        	System.out.println("Cliente no existe");
        	return 0;
        }
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = obj.getUsuario();
        if (usuarioCo.BuscarUsuario(usu.getCodigo())== null) //validar usuario
        {
        	System.out.println("Usuario no existe");
        	return 0;
        }
		
		if (obj.getFecha_emision() == null || !util.isFechaValida(obj.getFecha_emision().toString()))//validar fecha emision 
		{
        	System.out.println("Fecha de Emision incorrecta: "+ obj.getFecha_emision());
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
		
		if (obj.getTipoOperacion() != 2)//Si no es una compra
		{
        	System.out.println("No es una Compra");
        	return 0;
        }
		
		if (buscarCompra(obj))//Si la compra existe
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
		
		//"servicio de hosting", 410, 1, 90, 500							
		return 1;	
		
	}
	
	public int crearCompraDeta(OperacionDetalle obj){
		return 1;		
	}
	
	public boolean buscarCompra(OperacionCabecera compra) {
		
		List<OperacionCabecera> listaVentas = BD.devolverOperacion();
		
		for (OperacionCabecera item : listaVentas) 
		{		
            if (item.getCodigo() == compra.getCodigo())
            	return true;
        }
        
        return false;
	}
	
}
