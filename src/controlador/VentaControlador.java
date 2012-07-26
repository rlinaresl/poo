package controlador;

import java.util.List;

import dominio.Util;

import dominio.BaseDatos;
import dominio.OperacionCabecera;
import dominio.OperacionDetalle;
import dominio.Usuario;

public class VentaControlador {

	Util util = new Util();
		
	public int crearVentaCabe(OperacionCabecera obj){
		
		if (!util.isFechaValida(obj.getFecha_emision().toString()))//validar fecha emision 
			return 0;
		
		if (!util.isFechaValida(obj.getFechaPago().toString()))//validar fecha pago
			return 0;
		
		if (!util.isFechaValida(obj.getFechaVencimiento().toString()))//validar fecha vencimiento 
			return 0;

		
		
		
		return 1;		
	}
	
	public int crearVentaDeta(OperacionDetalle obj){		
		
		
		return 1;		
	}
	
	
	
	
}
