/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    public static void checkAnagram(String a, String b){
        
        int flag = 0;
        char[] strOne = a.toCharArray();
        char[] strTwo = b.toCharArray();
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<strOne.length;i++){
            int count=0;
            for(int j=0;j<strOne.length;j++){
                if(strOne[i]==strOne[j]){
                    count++;
                }
            }
            if(map.containsKey(strOne[i])){
                int temp = map.get(strOne[i])+ count;
                map.put(strOne[i],temp);
            }
            else{
                map.put(strOne[i],count);
            }
        }
        
        for(int i=0;i<strTwo.length;i++){
            int count=0;
            for(int j=0;j<strTwo.length;j++){
                if(strTwo[i]==strTwo[j]){
                    count++;
                }
            }
            if(map.containsKey(strTwo[i])){
                System.out.println(strTwo[i]+" has the value of: "+map.get(strTwo[i]));
                if(map.get(strTwo[i])!=count){
                    flag=1;
                    // break;
                }
            }
        }
        
        if(flag==0)
        System.out.println("Anagram");
        else        
        System.out.println("Not Anagram");

        
     }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String inputOne = sc.next();
	    sc.nextLine();
	    String inputTwo = sc.next();
	    if(inputOne.length()==inputTwo.length()){
	        checkAnagram(inputOne,inputTwo);
	    }
	    else
		System.out.println("Not Anagram!");
	}
}
