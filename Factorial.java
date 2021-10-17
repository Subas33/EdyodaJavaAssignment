import java.io.*;
import java.util.*;

class Factorial {
    
    
    public int findUsingRecursion(int n){
        if(n>=1) return (n * findUsingRecursion(n-1));
        else return 1;
    } 
    
     public int findUsingLoop(int n){
        int result = 1;
        
        for(int i=1; i<=n; i++){
            result*=i;
        }
        return result;
    } 
    
    
    
    
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter input 1: ");
		int inputOne = scan.nextInt();

		
		
		Factorial solution = new Factorial();
		
		int loop = solution.findUsingLoop(inputOne);
		
		int recursion = solution.findUsingRecursion(inputOne);
		
		System.out.println("Using Recursion : " +recursion);
		
		System.out.println("Using Loop : "+loop);
		
	}
}
