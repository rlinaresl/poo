package dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
		
		public static String devolverFechaString(Date fechax)
		{
						
			Calendar c = new GregorianCalendar(); 
			String dia = Integer.toString(c.get(Calendar.DATE));
			String mes = Integer.toString(c.get(Calendar.MONTH)+1);
			String annio = Integer.toString(c.get(Calendar.YEAR));								
						
			dia = (dia.length()==1) ? ("0"+dia) : dia;
			mes = (mes.length()==1) ? ("0"+mes) : mes;
			
			String f = dia + "/" + mes + "/" + annio;

			return f;
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
			  //System.out.println("util.Date: "+utilDate);
			  return true;
		}
		
		public static java.sql.Date getFecha(String sfecha)
	    {
	        try {
	            //System.out.println("sfecha => " + sfecha);
	            int fechaCorrecta = getValida(sfecha);
	            //System.out.println(fechaCorrecta);
	            
	            if (fechaCorrecta==0)	return null;
	            if(sfecha==null) return null;
	            if(sfecha.isEmpty()) return null;
	            SimpleDateFormat ffecha = new SimpleDateFormat("dd/MM/yyyy");
	            return new java.sql.Date(ffecha.parse(sfecha).getTime());
	        } catch (Exception ex) {
	        	System.out.println(ex.getMessage());
	        	ex.printStackTrace();
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
	 
	        	//System.out.println(sdf.format(date1) + " " + date2);	        	
	 
	        	if(date1.compareTo(date2)>0){
	        		//System.out.println("Date1 is after Date2");	        		
	        	}else if(date1.compareTo(date2)<0){
	        		//System.out.println("Date1 is before Date2");
	        		return 1;
	        	}else if(date1.compareTo(date2)==0){
	        		//System.out.println("Date1 is equal to Date2");
	        		return 1;
	        	}else{
	        		//System.out.println("How to get here?");
	        	}	        	
        	
		    }catch(Exception ex){
	    		ex.printStackTrace();
	    	}
	        return 0;
	        
	    }
		
		public static int getValidaFechaActual(String fechaBus)
	    {   
			
			System.out.println(fechaBus);
			
			try{
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				Date fechaActual = new Date();
		        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		        String fechaHoy = formato.format(fechaActual);
		        
	        	Date date1 = sdf.parse(fechaHoy);
	        	Date date2 = sdf.parse(fechaBus);
	 
	        	//System.out.println((date1) + " " + date2);	        	
	 
	        	if(date1.compareTo(date2)>0){
	        		//System.out.println("Date1 is after Date2");	        		
	        	}else if(date1.compareTo(date2)<0){
	        		//System.out.println("Date1 is before Date2");	        		
	        	}else if(date1.compareTo(date2)==0){
	        		//System.out.println("Date1 is equal to Date2");
	        		return 1;
	        	}else{
	        		//System.out.println("How to get here?");
	        	}	        	
        	
		    }catch(Exception ex){
	    		//ex.printStackTrace();
	    	}
	        return 0;
	        
	    }
		
		//public static int getComparaFechas(String fechaBus1, String fechaBus2)
		public static int getComparaFechas(Date date1, Date date2)
	    {   
			
			//Date date1 = StrtoDate("dd/MM/yyyy", fechaBus1);
			//Date date2 = StrtoDate("dd/MM/yyyy", fechaBus2);			
			
			try{
		 
	        	if(date1.compareTo(date2)>0){
	        		//System.out.println("Date1 is after Date2");	
	        		return 1;
	        	}else if(date1.compareTo(date2)<0){
	        		//System.out.println("Date1 is before Date2");	        		
	        	}else if(date1.compareTo(date2)==0){
	        		//System.out.println("Date1 is equal to Date2");
	        		//return 1;
	        	}else{
	        		//System.out.println("How to get here?");
	        	}	        	
        	
		    }catch(Exception ex){
	    		//ex.printStackTrace();
	    	}
	        return 0;
	        
	    }
		
		
		public static int getRangoFechas(Date f, Date date1, Date date2)
	    {   
			
			//Date date1 = StrtoDate("dd/MM/yyyy", fechaBus1);
			//Date date2 = StrtoDate("dd/MM/yyyy", fechaBus2);			
			
			try{
		 
	        	if((f.after(date1) || f.equals(date1)) && (f.before(date2) || f.equals(date2))){
	        		//System.out.println("Date2 is after Date1");	
	        		return 1;
	        	}else{
	        		return 0;
	        	}	        	
        	
		    }catch(Exception ex){
	    		//ex.printStackTrace();
	    	}
	        return 0;
	        
	    }
		
		public static java.sql.Date getIsFecha(String sfecha)
	    {
	        try {

	            int fechaCorrecta = getIs(sfecha);	            //
	            
	            if (fechaCorrecta==0)	return null;
	            if(sfecha==null) return null;
	            if(sfecha.isEmpty()) return null;
	            SimpleDateFormat ffecha = new SimpleDateFormat("dd/MM/yyyy");
	            return new java.sql.Date(ffecha.parse(sfecha).getTime());
	        } catch (Exception ex) {
	        	System.out.println(ex.getMessage());
	        	ex.printStackTrace();
	            return null;
	        }
	    }
		
		public static int getIs(String sfecha)
	    {   
			
			
			try{
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				Date fechaActual = new Date();
		        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		        String fechaHoy = formato.format(fechaActual);
		        
	        	Date date1 = sdf.parse(fechaHoy);
	        	Date date2 = sdf.parse(sfecha);
	 
	        	//System.out.println((date1) + " " + date2);	        	
	 
	        	if(date1.compareTo(date2)>0){
	        		//System.out.println("Date1 is after Date2");	
	        		return 1;
	        	}else if(date1.compareTo(date2)<0){
	        		//System.out.println("Date1 is before Date2");	 
	        		return 1;
	        	}else if(date1.compareTo(date2)==0){
	        		//System.out.println("Date1 is equal to Date2");
	        		return 1;
	        	}else{
	        		//System.out.println("How to get here?");
	        	}	        	
        	
		    }catch(Exception ex){
	    		//ex.printStackTrace();
	    	}
	        return 0;
	        
	    }
		
		

}
