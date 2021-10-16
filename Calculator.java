import java.io.*;
import java.util.*;

class Calculator {
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Calculator!  ");
		System.out.print("Enter Input One : ");
		int inputOne = scan.nextInt();
		System.out.println();
    System.out.print("Enter Input Two : ");
		int inputTwo = scan.nextInt();
		
		System.out.println("Enter a choice: \n 1 - Addition  \n 2 - Subraction \n 3 - Multiplication \n 4 - Division");
		
		int choice = scan.nextInt();
		
        switch(choice){
            case 1:{
                System.out.println("Addition Result: "+ (inputTwo+inputOne));
                break;
            }
            
            case 2:{
                System.out.println("Subraction Result: "+ (inputOne-inputTwo));
                break;
            }
            
            case 3:{
                System.out.println("Multiplication Result: "+ (inputOne*inputTwo));
                break;
            }
            
            case 4:{
                System.out.println("Division Result: "+ (inputOne/inputTwo));
                break;
            }
            
            default:{
                System.out.println("Please Enter Valid Choice");
                break;
            }
        }
		
	}
}
