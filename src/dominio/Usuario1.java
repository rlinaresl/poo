package dominio;

public class Usuario1 {
	
	
	
	public boolean datos(String usuario, String pass){
		boolean resultado;
		if(usuario=="Ricardo" && pass=="jojolete"){
            resultado = true;
            System.out.println("Usuario y contraseña correctos");
        }else if (usuario==" "&& pass==" "){
        	resultado=false;
        	System.out.println("Error: Vuelva a ingresar sus datos");
        }  else {      
        	resultado=false;
        	System.out.println("Error: Vuelva a ingresar sus datos");
        }
        return resultado;
	}

	
}