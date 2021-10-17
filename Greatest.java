import java.io.*;
import java.util.*;

class Greatest {
    
    
    public void find(int a, int b, int c){
        int greatest;
        if(a>b){
            if(a>c){
                System.out.println(a+" is the Greatest Number");
            }
           else{
                System.out.println(c+" is the Greatest Number");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is the Greatest Number");
            }
           else{
                System.out.println(c+" is the Greatest Number");
            }
        }
        
    }
    
    
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter input 1 : ");
		int inputOne = scan.nextInt();
		System.out.print("Enter input 2 : ");
		int inputTwo = scan.nextInt();
		System.out.print("Enter input 2 : ");
		int inputThree = scan.nextInt();
		
		Greatest solution = new Greatest();
		
		solution.find(inputOne,inputTwo,inputThree);
		
	}
}
