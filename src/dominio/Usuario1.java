package dominio;
import java.util.List;

import dominio.Validation;


public class Usuario1 {
	BaseDatos BD =new BaseDatos();
	
	public enum Perfil
	{
		USUARIO, ADMINISTRADOR
	}
	private int codigo;
	private String nombres;
	private String apellidos;
	private String correos;
	private String clave;
	private Perfil perfil; // 1 Administrador / 2 Asistente
	
	public Usuario1(){
		
	}
	
	public Usuario1(int codigo,String nombres,
					String apellidos,String correos,
					String clave,Perfil perfil){
		
		this.codigo=codigo;
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.correos=correos;
		this.clave=clave;
		this.setPerfil(perfil);
		
	}
	
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	public String getNombres(){
		return nombres;
	}
	public void setNombres(String nombres){
		this.nombres=nombres;
	}
	public String getApellidos(){
		return apellidos;
	}
	public void setApellidos(String apellidos){
		this.apellidos=apellidos;
	}
	public String getCorreo(){
		return correos;
	}
	public void setCorreo(String correos){
		this.correos=correos;
	}
	public String getClave(){
		return clave;
	}
	public void setClave(String clave){
		this.clave=clave;
	}
	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	
	
	public int datos(String correo, String clave){
		int resultado;
		if(correo=="rlinareslivia@gmail.com" && clave=="11111"){
            resultado = 1;
            System.out.println("Usuario y contraseña correctos");
        }else if (correo==" "&& clave==" "){
        	resultado=0;
        	System.out.println("Error: Vuelva a ingresar sus datos");
        }  else {      
        	resultado=0;
        	System.out.println("Error: Vuelva a ingresar sus datos");
        }
        return resultado;
        
	}

	public String RegistrarUsuario()throws Exception {
		String mensaje="";
		
		if(this.getCodigo()==0)mensaje= "ERROR, ingrese el codigo.";
		else if(this.getNombres()=="") mensaje= "ERROR, ingrese el nombre.";
		else if(this.getApellidos()=="") mensaje=  "ERROR, ingrese el apellido.";
		else if(!Validation.isEmail(this.getCorreo()))
		{
			 mensaje= "ERROR, ingrese el Correo.";
			
		}
			
		else if(this.getClave()=="") mensaje= "ERROR, ingrese ela Clave.";
		else if(!this.getPerfil().equals(Perfil.USUARIO)) 
			mensaje= "ERROR, ingrese el Perfil.";
		else return "OK";
	
		throw new Exception(mensaje);
	}

	public int BuscarUsuario(int codigo) {
					
			List<Usuario1> lista =  BD.devolverUsuarios();
			
			for (Usuario1 item:lista){
				if (item.getCodigo()==codigo){
					int codigo1=item.getCodigo();
				  System.out.println("Usuario encontrado: "+item.getNombres()+" "+item.getApellidos());
					return codigo1 ;
				}
						
			}
			return 0;
				
		
	}
	
	public boolean EliminarUsuario(int codigo) {
		
		List<Usuario1> lista =  BD.devolverUsuarios();
		
		for (Usuario1 item:lista){
			if (item.getCodigo()==codigo&&codigo==1){
				lista.remove(2);
			  System.out.println("Listo para eliminar usuarios ");
				return true ;
			}
					
		}
		return false;

		
	}
}
