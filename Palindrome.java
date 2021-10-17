import java.io.*;
import java.util.*;

class Palindrome {
    
    
    public void find(int n){
        int r,sum=0;
        int temp=n;    
        while(n>0){    
           r=n%10; 
           sum=(sum*10)+r;    
           n=n/10;    
         }    
          if(temp==sum)    
           System.out.println(temp+ " is Palindrome Number ");    
          else    
           System.out.println(temp+" is not Palindrome Number ");    
    } 
    
    
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter input: ");
		int input = scan.nextInt();

		
		
		Palindrome solution = new Palindrome();
		
		solution.find(input);
		
	}
}
