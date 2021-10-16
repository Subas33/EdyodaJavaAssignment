import java.io.*;
import java.util.*;

class OddOrEven {
    
    
    public void calculate(int input){
        if(input%2==0){
		    System.out.println("The Number is Even");
		}
		else{
		    System.out.println("The Number is Odd");
		}
    }
    
    
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter Input : ");
		int input = scan.nextInt();
		Main solution = new Main();
		solution.calculate(input);
	}
}
