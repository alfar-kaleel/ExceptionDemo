/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author alfar
 */
public class TestException {
    
    
    public static void main(String[] args) throws MyException{
    
        String line;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a value : ");
    
    line = scan.nextLine();
    
    if (line.length() ==0){
    
    throw new MyException("Please enter a value");
    
    
    }
    
    else{
    
    calculate(line);
    
    }
    
    
    
    
    }

    private static void calculate(String line) {
        int y;
       int x  = Integer.parseInt(line);
       
       try{
       
           y = x/0;
           
           System.out.println(y);
       
       
       }
       
        //Here although we define a runtime exception called mathematicalexception,
        //The most specific child ArithmeticException was called
       catch(Mathematicalexception e){
       
       throw new Mathematicalexception("Arithmetic exception occured");
               
       }
        
    }
    

}