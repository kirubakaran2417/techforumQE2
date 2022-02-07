package arrays;

public class arrays3 {
    public static void largestandsmallest( ) {
    	/*
    	 * initializing two variables max and min with arr[0]
    	 * iterate over array
    	 *     if current element is greater than max,then assign
    	 *     current element to max
    	 *     if current element is samller than min,then assign
    	 *     current element to min
    	 * 
    	 *     	 */
    	int[] numbers=new int[]{25,35,64,86,95};
    	int max=numbers[0];
    	int min=numbers[0];
    	
    	for(int i=1;i<=numbers.length;i++) {
    		if(numbers[i]>max) {
    			max=numbers[i];
    		}
    		else if(numbers[i]<min) {
    			min=numbers[i];
    		}	
    	}
    	
    	System.out.println("smallest number is"+min);
    	System.out.println("largest number is"+max);

    	
    }
	public static void main(String[] args) {
       largestandsmallest();
	}

}
