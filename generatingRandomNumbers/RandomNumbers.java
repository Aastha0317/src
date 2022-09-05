package generatingRandomNumbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	 public static void main(String[] args) { 

	 int startcounter=0; 
	 int endCounter=500; 
	 int arraysize = endCounter-startcounter; 
	 int numbers[] = new int[arraysize]; 
	 Random rnum = new Random(); 
	     for(int counter=startcounter;counter<endCounter;counter++) 
	 { 
	    	 
	 int num = rnum.nextInt(1000); 
	 numbers[counter]= num; 

	 }
	     Scanner ui = new Scanner(System.in);
	     System.out.println("Please provide a number ranging from 1-500");
	     int n = ui.nextInt();
	     Arrays.sort(numbers);
	     System.out.println("Your number is: " + numbers[n-1]);
	     
	}
	 
}
