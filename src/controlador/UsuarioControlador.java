package controlador;

import java.util.List;

import dominio.BaseDatos;
import dominio.Usuario1;

public class UsuarioControlador {
	
	BaseDatos BD = new BaseDatos();
	
	public Usuario1 BuscarUsuario(int codigo){		
		
		List<Usuario1> listaUsuarios = BD.devolverUsuarios();
		
		for (Usuario1 item:listaUsuarios)
		{
			if (codigo == item.getCodigo())
				return item;
		}
		
		return null;
		
	}
	
	

}
