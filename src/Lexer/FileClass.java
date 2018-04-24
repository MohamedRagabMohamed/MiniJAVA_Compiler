package Lexer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileClass {
    private Scanner in ;
    private Formatter x ;
    
    void OpenWrite(String fileName) throws FileNotFoundException
    {
        try{
            x = new Formatter(fileName) ; 
        }
        catch (Exception e) {
            System.out.println("Error Opening File");
        }
    }
    
   void WriteData(ArrayList<TokenLabel> output )
   {
       for(int i = 0 ; i < output.size() ; i++ )
       {
           x.format("<%s> : %s \n", output.get(i).getLabel(), output.get(i).getToken()) ;
       }
   }
   void closeWrite()
   {
       x.close(); 
   }

   
   public String BufferMethod(String fileName) throws IOException
   {
       String result = "" ;
        try { 
            BufferedReader br  = new BufferedReader( new FileReader(fileName) ) ;
            for( String line ; (line = br.readLine()) != null ; )
                result+= RemoveSpaces(line)+"\n" ; 
           
            
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, ex);
        }
       return result ;
   }
   
   public String RemoveSpaces(String input)
   {
       Boolean flag =false ; 
       String edit = "" ; 
       
       int last_idx = input.length() ;
       for(int i = input.length()-1 ; i >= 0 ; i-- )
       {
           if(input.charAt(i) != ' ' ) break ; 
           last_idx = i ; 
       }
      
       for(int i = 0  ; i < last_idx ; i++ )
       {
           if( (input.charAt(i) == ' ' || input.charAt(i) == 9 )  && flag == false  ) continue; 
           else{
               flag = true ; 
               edit+=input.charAt(i) ;
           } 
       }
       return  edit ; 
   }
      
}
