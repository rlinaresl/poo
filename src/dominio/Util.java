package dominio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Util {
	
//		public static void main(String args[])
//		{
//			//comparaFecha();
//		}
	
		public boolean isFechaValida(String fechax) {
		
		  try {
		      SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
		      formatoFecha.setLenient(false);
		      formatoFecha.parse(fechax);
		  } catch (Exception e) {
		      return false;
		  }
		  
		  return true;
		  
		}
	
	    public static Date StrtoDate(String pformat, String pdatestr)
	    {
	        Date date = null;
	        SimpleDateFormat df = new SimpleDateFormat(pformat);
	        try {
	            date = df.parse(pdatestr);
	        } catch (Exception e) {            
	            e.printStackTrace();
	        }
	        return date;
	    }

	
		private boolean comparaFecha() {
			
		      java.util.Date utilDate = new java.util.Date(); //fecha actual			  
			  System.out.println("util.Date: "+utilDate);
			  return true;
		}
		
		public static java.sql.Date getFecha(String sfecha)
	    {
	        try {
	            System.out.println("sfecha => " + sfecha);
	            int fechaCorrecta = getValida(sfecha);
	            if (fechaCorrecta==0)	return null;
	            if(sfecha==null) return null;
	            if(sfecha.isEmpty()) return null;
	            SimpleDateFormat ffecha = new SimpleDateFormat("dd/MM/yyyy");
	            return new java.sql.Date(ffecha.parse(sfecha).getTime());
	        } catch (Exception ex) {
	            return null;
	        }
	    }
		
		public static int getValida(String fechaBus)
	    {   
			
			try{
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				Date fechaActual = new Date();
		        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		        String fechaHoy = formato.format(fechaActual);
		        
	        	Date date1 = sdf.parse(fechaHoy);
	        	Date date2 = sdf.parse(fechaBus);
	 
	        	System.out.println(sdf.format(date1) + " " + date2);	        	
	 
	        	if(date1.compareTo(date2)>0){
	        		System.out.println("Date1 is after Date2");	        		
	        	}else if(date1.compareTo(date2)<0){
	        		System.out.println("Date1 is before Date2");
	        		return 1;
	        	}else if(date1.compareTo(date2)==0){
	        		System.out.println("Date1 is equal to Date2");
	        	}else{
	        		System.out.println("How to get here?");
	        	}
        	
		    }catch(Exception ex){
	    		ex.printStackTrace();
	    	}
	        return 0;
	        
	    }
		

}
