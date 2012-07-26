package controlador;

import java.util.List;

import dominio.BaseDatos;
import dominio.Cliente;

public class ClienteControlador {
	
		BaseDatos BD = new BaseDatos();
	
		public Cliente BuscarCliente(String codigo){		
				
				List<Cliente> listaCliente = BD.devolverClientes();
				
				for (Cliente item:listaCliente)
				{
					if (codigo.equals(item.getCodigo()))
						return item;				
				}
				
				return null;
				
			}
	
}
