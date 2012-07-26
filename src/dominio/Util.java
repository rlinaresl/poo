package dominio;

import java.text.SimpleDateFormat;
import java.util.Locale;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Util {
	
//		public static void main(String args[])
//		{
//			//comparaFecha();
//		}
	
		public boolean isFechaValida(String fechax) {
		
		  try {
		      SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
		      formatoFecha.setLenient(false);
		      formatoFecha.parse(fechax);
		  } catch (Exception e) {
		      return false;
		  }
		  
		  return true;
		  
		}
	
	
		private boolean comparaFecha() {
			
		      java.util.Date utilDate = new java.util.Date(); //fecha actual			  
			  System.out.println("util.Date: "+utilDate);
			  return true;
		}

}
