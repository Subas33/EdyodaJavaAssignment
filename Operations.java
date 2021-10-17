import java.io.*;
import java.util.*;

class Main {
    
    
    public void sumOfTwo(int a,int b){
       System.out.println("Sum Of Two Numbers : "+ (a+b));
    } 
    
    public void sumOfThree(int a,int b,int c){
       System.out.println("Sum Of Three Numbers : "+ (a+b+c));
    } 
    
    public void multiplyOfTwo(int a,int b){
       System.out.println("Multiply Of Two Numbers : "+ (a*b));
    } 
    
    public void multiplyOfThree(int a,int b,int c){
       System.out.println("Multiply Of Two Numbers : "+ (a*b*c));
    } 
    
    
    
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter input 1: ");
		int inputOne = scan.nextInt();
		
		System.out.print("Enter input 2: ");
		int inputTwo = scan.nextInt();
		
		System.out.print("Enter input 3: ");
		int inputThree = scan.nextInt();

		
		
		Main solution = new Main();
		
		solution.sumOfTwo(inputOne,inputTwo);
		solution.sumOfThree(inputOne,inputTwo,inputThree);
		solution.multiplyOfTwo(inputOne,inputTwo);
		solution.multiplyOfThree(inputOne,inputTwo,inputThree);
		
	}
}
