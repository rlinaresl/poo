package dominio;

public class Usuario1 {
	
	private int codigo;
	private String nombres;
	private String apellidos;
	private String correos;
	private String clave;
	private int perfil; // 1 Administrador / 2 Asistente
	
	public Usuario1(){
		
	}
	
	public Usuario1(int codigo,String nombres,
					String apellidos,String correos,
					String clave,int estado){
		
		this.codigo=codigo;
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.correos=correos;
		this.clave=clave;
		this.perfil=estado;
		
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
	public int getPerfil(){
		return perfil;
	}
	public void setPerfil(int estado){
		this.perfil=estado;
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

	public String RegistrarUsuario() {
		
		if(this.getCodigo()==0)return "ERROR, ingrese el codigo.";
		else if(this.getNombres()=="") return "ERROR, ingrese el nombre.";
		else if(this.getApellidos()=="") return "ERROR, ingrese el apellido.";
		else if(this.getCorreo()=="") return "ERROR, ingrese el Correo.";
		else if(this.getClave()=="") return "ERROR, ingrese ela Clave.";
		else if(this.getPerfil()==0) return "ERROR, ingrese el Perfil.";
		else return "OK";
	
		
	}
	
	public String ValidarCorreo(String m) {
		
		
        char c1 = m.charAt(0);
        int pos1 = 0;
        int pos2 = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int x = 0;
        String cadena1 = "";
        String cadena2 = "";
        String cadena3 = "";

        if (c1 != '@' && c1 != '.') {


            for (int i=1; i < m.length(); i++) {
                if (m.charAt(i) == '@') {
                    pos1 = i;
                }
            }
            for (int i=1; i < m.length(); i++) {
                if (m.charAt(i) == '.') {
                    pos2 = i;
                }
            }

            cadena1 = m.substring(0, pos1);
            cadena2 = m.substring(pos1+1, pos2);
            cadena3 = m.substring(pos2+1, m.length());

            for (int i = 0;i < cadena1.length(); i++) {
                //System.out.println("carcater "+cadena1);
                a1 = cadena1.codePointAt(i);//
                if ((a1 > 47 && a1 < 58  ) || (a1 > 64 && a1 < 91)
                        || (a1 > 96 && a1 < 123) || a1==46 ) {
                    x++;
                }
            }
            //System.out.println("1 "+cadena2);
            for (int i = 0; i < cadena2.length(); i++) {
                a2 = cadena2.codePointAt(i);
                //System.out.println("carcater "+a2);
                if ((a2 > 47 && a2 < 58  ) || (a2 > 64 && a2 < 91)
                        || (a2 > 96 && a2 < 123)) {
                    x++;
                }
            }

            for (int i = 0;i < cadena3.length(); i++) {
                a3 = cadena3.codePointAt(i);
                if ((a3 > 47 && a3 < 58  ) || (a3 > 64 && a3 < 91)
                        || (a3 > 96 && a3 < 123)) {
                    x++;
                }
            }
            //System.out.println("xxx "+x+"    "+(m.length()-2));
            if (x == m.length()- 2) {
                if (pos1 != 0 && pos2 != 0 && (pos1 + 2) < pos2) {

                    if (m.length()-1 >= (pos2 + 2)) {

                        return "Correcto";
                    }else {
                        return "Error";
                    }
                }else{
                    return "Error";
                }
            }else {
                return "Error";
            }
        }else {
            return "Error";
        }

	
}
}