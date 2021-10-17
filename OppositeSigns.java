import java.io.*;
import java.util.*;

class OppositeSigns {
    
    
    public void find(int a, int b){
        if((a+b)==0){
            System.out.println("The Two integers are of opposite Signs");
        }
        else  System.out.println("The Two integers are NOT of opposite Signs");
        
    }
    
    
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter input 1 : ");
		int inputOne = scan.nextInt();
		System.out.print("Enter input 2 : ");
		int inputTwo = scan.nextInt();
		
		
		OppositeSigns solution = new OppositeSigns();
		
		solution.find(inputOne,inputTwo);
		
	}
}
