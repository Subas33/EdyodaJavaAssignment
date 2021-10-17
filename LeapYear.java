import java.io.*;
import java.util.*;

class LeapYear {
    
    
    public boolean find(int year){
        boolean leap;
      if (year % 4 == 0) {

        if (year % 100 == 0) {
            if (year % 400 == 0)
                 leap = true;
            else
                leap = false;
        }
      
        else
            leap = true;
        }
    
        else
            leap = false;
        
        return leap;
       }
    
    
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int input = scan.nextInt();
		LeapYear solution = new LeapYear();
		if(solution.find(input)){
		    System.out.println("Leap Year");;
		}
		else{
		    System.out.println("Not Leap Year");;
		}
	}
}
