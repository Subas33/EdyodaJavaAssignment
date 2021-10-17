import java.io.*;
import java.util.*;

class GCD {
    
    
    public void find(int x, int y){
        int gcd = 1;  
        for(int i = 1; i <= x && i <= y; i++)  
        {  

        if(x%i==0 && y%i==0)  

        gcd = i;  
        }  
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
    } 
    
    
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter input 1: ");
		int inputOne = scan.nextInt();
		System.out.print("Enter input 2: ");
		int inputTwo = scan.nextInt();
		

		
		
		GCD solution = new GCD();
		
		solution.find(inputOne,inputTwo);
		
	}
}
