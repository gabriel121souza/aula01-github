
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

import java.util.Date;




public class Program {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       
        Date d = new Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        //coletando a data com os millisegundos 
        System.out.println(sdf.format(d));
            
    
    }
}