package controlador;

import java.util.List;

import dominio.BaseDatos;
import dominio.Usuario;

public class UsuarioControlador {
	
	BaseDatos BD = new BaseDatos();
	
	public Usuario BuscarUsuario(int codigo){		
		
		List<Usuario> listaUsuarios = BD.devolverUsuarios();
		
		for (Usuario item:listaUsuarios)
		{
			if (codigo == item.getCodigo())
				return item;
		}
		
		return null;
		
	}
	
	

}
