package dominio;

import java.util.ArrayList;
import java.util.List;

import controlador.VentaControlador;


import dominio.Cliente;
import dominio.Usuario;
import dominio.OperacionCabecera;
import dominio.OperacionDetalle;



public class BaseDatos {


	public List<OperacionCabecera> devolverOperacion(){
		List<OperacionCabecera> lista = new ArrayList<OperacionCabecera>();
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
    	obj = new Usuario(1, "Abel", "Rodriguez", "abel@gmail.com", "11111", 1);
    	lista.add(obj);
    	obj = new Usuario(2, "Marcelo", "Mendoza", "marcelo@gmail.com", "22222", 1);
    	lista.add(obj);
    	obj = new Usuario(3, "Carlos", "Rios", "carlos@gmail.com", "33333", 1);
    	lista.add(obj);
    	
    	return lista;
    	
    }
        

}
