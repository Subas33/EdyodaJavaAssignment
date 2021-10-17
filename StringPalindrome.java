import java.io.*;
import java.util.*;

class StringPalindrome {
    
    
    public void find(String input){
       String temp = "";
       char ch;
       for(int i=(input.length()-1);i>=0;i--){
           ch = input.charAt(i);
           temp+=ch;
       }
       
       if(input.equals(temp))
       System.out.println(input+ " is a Palindrome");
       else
       System.out.println(input+ " is not a Palindrome");
    } 
    
    
    
    
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter input String: ");
		String input = scan.next();
		
		
		StringPalindrome solution = new StringPalindrome();
		
		solution.find(input);
		
	}
}
