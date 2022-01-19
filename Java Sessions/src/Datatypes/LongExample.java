package Datatypes;

public class LongExample {
	 public static void main(String[] args) 
	 { 
	   int lightSpeed; 
	   long days; 
	   long seconds; 
	   long distance; 
	// Speed of light in miles per sec. 
	     lightSpeed = 186282; 
	     days = 1000;
	// Number of days. 
	     seconds = days*24*60*60; // Convert into seconds. 
	     distance = lightSpeed * seconds; 
	     System.out.println("In 1000 days, distance traveled by light: " +distance + " miles"); 
	   } 
}
