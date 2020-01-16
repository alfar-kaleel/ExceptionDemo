/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//This class demostrates The most specific child Filenotfound is caught when the exception occurs


public class FileException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
        
        FileReader filereader = new FileReader("/sample.txt");
     
        BufferedReader bufferedreader = new BufferedReader(filereader);
                
                    
        }
        
        
        
        
     catch (FileNotFoundException ex) {
            System.out.println("Caught FileNotFound : " +ex.getMessage());
            
        } 
        
     catch (IOException e){
        
     System.out.println("Caught IOEXception :" +e.getMessage());
        
        }   
        
        
        
    
        
        
        
}
}